package com.example.domain.board.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardResponse {
	private Long no;
	private String title;
	private String username;
	private String writeday;
	private Long readcnt;
	private String content;
	
	@Builder
	public BoardResponse(Long no, String title, String username, String writeday, Long readcnt, String content) {
		this.no = no;
		this.title = title;
		this.username = username;
		this.writeday = writeday;
		this.readcnt = readcnt;
		this.content = content;
	}
}
