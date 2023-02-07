package com.example.domain.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.board.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
	List<Board> findByUsernameContains(String username);
	List<Board> findByTitleContains(String title);
}
