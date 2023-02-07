package com.example.domain.member.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.domain.member.dto.LoginDTO;
import com.example.domain.member.dto.MemberDTO;
import com.example.domain.member.entity.Member;
import com.example.domain.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
	private final MemberRepository memberRepository;

	@Override
	@Transactional
	public void save(MemberDTO memberDto) throws Exception {
		memberRepository.save(Member.builder()
				.userid(memberDto.getUserid())
				.passwd(memberDto.getPasswd())
				.username(memberDto.getUsername())
				.email(memberDto.getEmail())
				.phone(memberDto.getPhone())
				.build());
	}

	@Override
	public Member findByUserid(String userid) throws Exception {
		return memberRepository.findByUserid(userid);
	}
	
	@Override
	public boolean login(LoginDTO loginDto) throws Exception {
		Member member = findByUserid(loginDto.getUserid());
		
		if(member == null) {
			return false;
		}
		
		if(!member.getPasswd().equals(loginDto.getPasswd())) {
			return false;
		}
		return true;
	}
	
	
}
