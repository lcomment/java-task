package com.service;

import java.util.HashMap;
import java.util.List;

import com.dto.request.BoardCreateRequest;
import com.dto.request.BoardUpdateRequest;
import com.dto.response.BoardResponse;
import com.dto.response.SimpleBoardResponse;

public interface BoardService {
	public BoardResponse find(int id) throws Exception;
	public BoardResponse findById(int id) throws Exception;
	public List<SimpleBoardResponse> findBySearch(HashMap<String, String> map) throws Exception;
	public List<SimpleBoardResponse> findAll() throws Exception;
	public void save(BoardCreateRequest dto) throws Exception;
	public void modify(BoardUpdateRequest dto) throws Exception;
	public void modifyCnt(BoardUpdateRequest dto) throws Exception;
	public void delete(int id) throws Exception;
	public void deleteAll() throws Exception;
}
