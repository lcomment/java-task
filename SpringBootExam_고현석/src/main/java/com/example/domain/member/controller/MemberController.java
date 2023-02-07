package com.example.domain.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.member.dto.LoginDTO;
import com.example.domain.member.dto.MemberDTO;
import com.example.domain.member.service.MemberService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {
	private final MemberService memberService;
	
	@GetMapping("/memberAdd")
	public String memberAdd() {
		return "memberForm";
	}
	
	@GetMapping("/idcheck")
	@ResponseBody
	public String checkDuplicateUserid(@RequestParam String userid) throws Exception{
		String mesg = "사용 가능";

		if(memberService.findByUserid(userid) != null) {
			mesg = "아이디 중복";
		}
		
		return mesg;
	}
	
	@PostMapping("/memberAdd")
	public String memberAdd(MemberDTO memberDTO) throws Exception {
		memberService.save(memberDTO);
		
		return "redirect:home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "loginForm";
	}
	
	@PostMapping("/login")
	public String login(LoginDTO loginDTO, HttpServletRequest request) throws Exception {
		if(memberService.login(loginDTO)) {
			HttpSession session = request.getSession();
			session.setAttribute("userid", loginDTO.getUserid());
			session.setAttribute("passwd", loginDTO.getPasswd());
			session.setAttribute("username", memberService.findByUserid(loginDTO.getUserid()).getUsername());
			System.out.println("로그인 성공");
			return "redirect:home";
		} else {
			return "error";
		}
	}
	
	@GetMapping("/mypage")
	public ModelAndView mypage(HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		String userid = (String) request.getSession().getAttribute("userid");
		mav.addObject("member", memberService.findByUserid(userid).toMemberDTO());
		mav.setViewName("mypage");
		
		return mav;
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		session.invalidate();
		
		return "redirect:home";
	}
}
