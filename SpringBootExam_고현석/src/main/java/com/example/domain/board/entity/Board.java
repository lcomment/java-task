package com.example.domain.board.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.example.domain.board.dto.request.BoardRequest;
import com.example.domain.board.dto.response.BoardResponse;
import com.example.domain.board.dto.response.BoardSimpleResponse;
import com.example.domain.member.entity.Member;
import com.example.global.BaseTime;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long no;
	
	@Column(nullable = false)
	private String username;
	
	@Column(nullable = false)
	private String title;
	
	@Column
	private String content;
	
	@Column
	private Long readcnt;
	
	 @Embedded
	 private BaseTime baseTime;	
	 
	 @ManyToOne
	 @JoinColumn(name = "userid")
	 private Member member;
	 
	 @Builder
	 public Board(String username, String title, String content, Member member) {
		 this.username = username;
		 this.title = title;
		 this.content = content;
		 this.readcnt = 0L;
		 this.member = member;
		 this.baseTime = new BaseTime();
	 }
	 
	 public void increaseCnt() {
		 readcnt++;
	 }
	 
	 public void update(BoardRequest boardRequest) {
		 this.title = boardRequest.getTitle();
		 this.content = boardRequest.getContent();
	 }
	 
	 public BoardSimpleResponse toBoardSimpleResponse() {
		 return BoardSimpleResponse.builder()
				 .no(no)
				 .title(title)
				 .username(username)
				 .writeday(baseTime.getWriteday().toString())
				 .readcnt(readcnt)
				 .build();
	 }
	 
	 public BoardResponse toBoardResponse() {
		 return BoardResponse.builder()
				 .no(no)
				 .title(title)
				 .username(username)
				 .writeday(baseTime.getWriteday().toString())
				 .readcnt(readcnt)
				 .content(content)
				 .build();
	 }
}
