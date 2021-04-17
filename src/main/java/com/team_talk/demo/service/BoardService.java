package com.team_talk.demo.service;

import com.team_talk.demo.domain.Board;
import com.team_talk.demo.dto.BoardRequestDto;
import com.team_talk.demo.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;


    public Board create(BoardRequestDto requestDto) {
        Board newBoard = new Board(requestDto);
        return boardRepository.save(newBoard);
    }

    public void update(BoardRequestDto requestDto, Long boardId){
        Board board= boardRepository.findById(boardId).orElseThrow(()->new IllegalArgumentException("내용이 존재하지 않습니다."));
        board.update(requestDto);
    }


    public Board findById(Long id) {
        return boardRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
    }



}
