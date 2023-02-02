package com.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.request.BoardCreateRequest;
import com.dto.request.BoardUpdateRequest;
import com.dto.response.BoardResponse;
import com.dto.response.SimpleBoardResponse;

@Repository
public class BoardDAO {
	@Autowired
	SqlSessionTemplate session;
	
	public BoardResponse findById(int id) throws Exception {
		return session.selectOne("com.config.BoardMapper.findById", id);
	}
	
	public List<SimpleBoardResponse> findBySearch(HashMap<String, String> map) throws Exception {
		return session.selectList("com.config.BoardMapper.findBySearch", map);
	}
	
	public List<SimpleBoardResponse> findAll() throws Exception {
		return session.selectList("com.config.BoardMapper.findAll");
	}
	
	public int save(BoardCreateRequest dto) throws Exception {
		return session.insert("com.config.BoardMapper.save", dto);
	}
	
	public int modifyCnt(BoardUpdateRequest dto) throws Exception {
		return session.update("com.config.BoardMapper.updateCnt", dto);
	}
	
	public int modify(BoardUpdateRequest dto) throws Exception {
		return session.update("com.config.BoardMapper.update", dto);
	}
	
	public int delete(int id) throws Exception {
		return session.delete("com.config.BoardMapper.delete", id);
	}
	
	public int deleteAll() throws Exception {
		return session.delete("com.config.BoardMapper.deleteAll");
	}
}
