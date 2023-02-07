package com.example.domain.member.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LoginDTO {
	private String userid;
	private String passwd;
	
	public LoginDTO(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}
}
