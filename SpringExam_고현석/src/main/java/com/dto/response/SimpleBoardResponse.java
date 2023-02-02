package com.dto.response;

import org.apache.ibatis.type.Alias;

@Alias("SimpleBoardResponse")
public class SimpleBoardResponse {
	private int no;
	private String title;
	private String author;
	private String writeday;
	private int readcnt;
	
	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getWriteday() {
		return writeday;
	}

	public int getReadcnt() {
		return readcnt;
	}
	
	public SimpleBoardResponse() {}
	
	public SimpleBoardResponse(int no, String title, String author, String writeday, int readcnt) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.writeday = writeday;
		this.readcnt = readcnt;
	}
}
