package com.example.domain.member.service;

import com.example.domain.member.dto.LoginDTO;
import com.example.domain.member.dto.MemberDTO;
import com.example.domain.member.entity.Member;

public interface MemberService {
	void save(MemberDTO memberDto) throws Exception;
	Member findByUserid(String userid) throws Exception;
	boolean login(LoginDTO loginDto) throws Exception;
}
