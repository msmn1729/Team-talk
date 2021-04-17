package com.team_talk.demo.repository;

import com.team_talk.demo.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;


public interface BoardRepository extends JpaRepository<Board, Long> {
//    List<Board> findAllByModifiedAtBetweenOrderByModifiedAtDesc(LocalDateTime start, LocalDateTime end);
}