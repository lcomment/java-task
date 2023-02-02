package com.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.request.BoardCreateRequest;
import com.dto.request.BoardUpdateRequest;
import com.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	// 조회
	@GetMapping("/retrieve/{id}")
	public ModelAndView detail(@PathVariable int id) throws Exception {
		ModelAndView mnv = new ModelAndView();

		mnv.addObject("board", boardService.find(id));
		mnv.setViewName("retrieve");
		
		return mnv;
	}
	
	@GetMapping("/list")
	public ModelAndView list(@RequestParam HashMap<String, String> map) throws Exception {
		ModelAndView mnv = new ModelAndView();
		
		if(map.isEmpty()) {
			mnv.addObject("boardList", boardService.findAll());
		} else {
			mnv.addObject("boardList", boardService.findBySearch(map));
//			mnv.addObject("board", boardService.find(2));
		}
		mnv.setViewName("list");
		
		return mnv;
	}
	
	// 작성
	@GetMapping("/write")
	public String write() {
		return "writeForm";
	}
	
	@PostMapping("/write")
	public String save(BoardCreateRequest dto) throws Exception {
		boardService.save(dto);
		
		return "redirect:list";
	}
	
	@PostMapping("/modify")
	public String modify(BoardUpdateRequest dto) throws Exception {
		boardService.modify(dto);
		
		return "redirect:/list";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) throws Exception {
		boardService.delete(id);
		
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public String deleteAll() throws Exception {
		boardService.deleteAll();
		
		return "redirect:/list";
	}
}
