package com.example.domain.member.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.domain.member.dto.MemberDTO;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
	@Id
	private String userid;
	
	@Column(nullable = false)
	private String passwd;
	
	@Column(nullable = false)
	private String username;
	
	@Column()
	private String email;
	
	@Column()
	private String phone;
	
	@Builder
	public Member(String userid, String passwd, String username, String email, String phone) {
		this.userid = userid;
		this.passwd = passwd;
		this.username = username;
		this.email = email;
		this.phone = phone;
	}
	
	public MemberDTO toMemberDTO() {
		return MemberDTO.builder()
				.userid(userid)
				.passwd(passwd)
				.username(username)
				.email(email)
				.phone(phone)
				.build();
	}
}
