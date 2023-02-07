package com.example.domain.board.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardRequest {
	private String title;
	private String username;
	private String content;
	
	public BoardRequest(String title, String username, String content) {
		this.title = title;
		this.username = username;
		this.content = content;
	}
}
