package com.example.domain.board.service;

import java.util.List;

import com.example.domain.board.dto.request.BoardRequest;
import com.example.domain.board.entity.Board;

public interface BoardService {
	List<Board> findAll() throws Exception;
	void save(BoardRequest boardRequest, String userid) throws Exception;
	void delete(Long id)throws Exception;
	Board findByNo(Long no) throws Exception;
	Board update(BoardRequest boardRequest, Long no) throws Exception;
	List<Board> findByUsernameContains(String username);
	List<Board> findByTitleContains(String title);
}
