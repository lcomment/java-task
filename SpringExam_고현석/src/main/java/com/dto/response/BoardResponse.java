package com.dto.response;

import org.apache.ibatis.type.Alias;

import com.dto.request.BoardUpdateRequest;

@Alias("BoardResponse")
public class BoardResponse {
	private int no;
	private String title;
	private String author;
	private String content;
	private String writeday;
	private int readcnt;
	
	public BoardUpdateRequest updateReadCntRequest() {
		return new BoardUpdateRequest(no, readcnt + 1, title, author, content);
	}

	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}

	public String getWriteday() {
		return writeday;
	}

	public int getReadcnt() {
		return readcnt;
	}
}
