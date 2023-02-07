package com.example.domain.board.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.domain.board.dto.request.BoardRequest;
import com.example.domain.board.entity.Board;
import com.example.domain.board.repository.BoardRepository;
import com.example.domain.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	private final BoardRepository boardRepository;
	private final MemberRepository memberRespository;

	@Override
	public List<Board> findAll() throws Exception {
		return boardRepository.findAll();
	}

	@Override
	@Transactional
	public void save(BoardRequest boardRequest, String userid) throws Exception {
		boardRepository.save(Board.builder()
				.username(boardRequest.getUsername())
				.title(boardRequest.getTitle())
				.content(boardRequest.getContent())
				.member(memberRespository.findByUserid(userid))
				.build());
	}

	@Override
	public void delete(Long id) throws Exception {
		boardRepository.deleteById(id);		
	}

	@Override
	@Transactional
	public Board findByNo(Long no) throws Exception {
		Board board = boardRepository.findById(no).orElseThrow(EntityNotFoundException::new);
		board.increaseCnt();
		return board;
	}

	@Override
	@Transactional
	public Board update(BoardRequest boardRequest, Long no) throws Exception {
		Board board = boardRepository.findById(no).orElseThrow(EntityNotFoundException::new);
		board.update(boardRequest);
		return board;
	}

	@Override
	public List<Board> findByUsernameContains(String username) {
		return boardRepository.findByUsernameContains(username);
	}

	@Override
	public List<Board> findByTitleContains(String title) {
		return boardRepository.findByTitleContains(title);
	}

}
