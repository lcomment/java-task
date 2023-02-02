package com.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BoardDAO;
import com.dto.request.BoardCreateRequest;
import com.dto.request.BoardUpdateRequest;
import com.dto.response.BoardResponse;
import com.dto.response.SimpleBoardResponse;

@Service
public class BoardServiceImpl implements BoardService  {
	@Autowired
	private BoardDAO boardDao;
	
	@Override
	public BoardResponse find(int id) throws Exception {
		BoardResponse board = boardDao.findById(id);
		modifyCnt(board.updateReadCntRequest());
		
		return board;
	}
	
	@Override
	public BoardResponse findById(int id) throws Exception {
		return boardDao.findById(id);
	}
	
	@Override
	public List<SimpleBoardResponse> findBySearch(HashMap<String, String> map) throws Exception {
		return boardDao.findBySearch(map);
	}

	@Override
	public List<SimpleBoardResponse> findAll() throws Exception {
		return boardDao.findAll();
	}

	@Override
	public void save(BoardCreateRequest dto) throws Exception {
		boardDao.save(dto);
	}

	@Override
	public void modify(BoardUpdateRequest dto) throws Exception {
		System.out.println(dto.getReadCnt());
		boardDao.modify(dto);
	}
	
	@Override
	public void modifyCnt(BoardUpdateRequest dto) throws Exception {
		System.out.println(dto.getReadCnt());
		boardDao.modifyCnt(dto);
	}

	@Override
	public void delete(int id) throws Exception {
		boardDao.delete(id);
	}

	@Override
	public void deleteAll() throws Exception {
		boardDao.deleteAll();
	}
}
