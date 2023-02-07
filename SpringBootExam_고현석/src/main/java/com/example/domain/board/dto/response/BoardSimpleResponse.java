package com.example.domain.board.dto.response;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardSimpleResponse {
	private Long no;
	private String title;
	private String username;
	private String writeday;
	private Long readcnt;
	
	@Builder
	public BoardSimpleResponse(Long no, String title, String username, String writeday, Long readcnt) {
		this.no = no;
		this.title = title;
		this.username = username;
		this.writeday = writeday;
		this.readcnt = readcnt;
	}
}
