package com.example.domain.member.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberDTO {
	private String userid;
	private String passwd;
	private String username;
	private String email;
	private String phone;
	
	@Builder
	public MemberDTO(String userid, String passwd, String username, String email, String phone) {
		this.userid = userid;
		this.passwd = passwd;
		this.username = username;
		this.email = email;
		this.phone = phone;
	}
}