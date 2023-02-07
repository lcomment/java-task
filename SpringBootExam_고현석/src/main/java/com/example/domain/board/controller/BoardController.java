package com.example.domain.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.board.dto.request.BoardRequest;
import com.example.domain.board.entity.Board;
import com.example.domain.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	private final BoardService boardService;
	
	@GetMapping("/list")
	public ModelAndView boardList(@RequestParam HashMap<String, String> map) throws Exception{
		ModelAndView mav = new ModelAndView();
		
		List<Board> boardList = null;
		if(map.isEmpty()) {
			boardList = boardService.findAll();
			
		} else if(map.get("searchName").equals("username")){
			boardList = boardService.findByUsernameContains(map.get("searchValue"));
		} else {
			boardList = boardService.findByTitleContains(map.get("searchValue"));
		}
		
		if(!boardList.isEmpty()) {
			mav.addObject("boardList", boardList.stream()
					.map(Board::toBoardSimpleResponse)
					.collect(Collectors.toList()));
		}
		
		mav.setViewName("list");
		
		return mav;
	}
	
	@GetMapping("/write")
	public String write() {
		return "writeForm";
	}
	
	@PostMapping("/write")
	public String write(BoardRequest boardRequest, HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		
		boardService.save(boardRequest, (String) session.getAttribute("userid"));
		
		return "redirect:list";
	}
	
	@GetMapping("/delete/{no}")
	public String delete(@PathVariable Long no) throws Exception {
		boardService.delete(no);
		
		return "redirect:list";
	}
	
	@GetMapping("/retrieve/{no}")
	public ModelAndView retrieve(@PathVariable Long no) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("board", boardService.findByNo(no).toBoardResponse());
		mav.setViewName("retrieve");
		
		return mav;
	}
	
	@PostMapping("/update/{no}")
	public String update(@PathVariable Long no, BoardRequest boardRequest) throws Exception {
		boardService.update(boardRequest, no);
		
		return "redirect:list";
	}
}
