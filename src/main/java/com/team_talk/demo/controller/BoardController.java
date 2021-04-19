package com.team_talk.demo.controller;

import com.team_talk.demo.domain.Board;
import com.team_talk.demo.domain.Card;
import com.team_talk.demo.dto.BoardRequestDto;
import com.team_talk.demo.repository.BoardRepository;
import com.team_talk.demo.repository.CardRepository;
import com.team_talk.demo.repository.PinRepository;
import com.team_talk.demo.service.BoardService;
import com.team_talk.demo.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final PinRepository pinRepository;
    private final CardRepository cardRepository;
    private final CardService cardService;
    private final BoardRepository boardRepository;
    private final BoardService boardService;


    @GetMapping("/api/boards")
    public List<Board> AllBoard() {
        return boardRepository.findAll();
    }

    @GetMapping("/api/select_board")
    public Board SelectBoard(
            @RequestParam(required = false, value = "board") Long BoardId
    ) {
        Board board = boardService.findById(BoardId);
        return board;
    }

    @PostMapping("/api/boards")
    public void createBoard(@RequestBody BoardRequestDto requestDto) {
        boardService.create(requestDto);
    }

    @PutMapping("/api/boards/{boardId}")
    public void updateBoard(
            @PathVariable Long boardId,
            @RequestBody BoardRequestDto requestDto
    ) {
//        System.out.println(boardId);
        boardService.update(requestDto, boardId);
    }

    @DeleteMapping("/api/boards/{boardId}")
    public void deleteBoard(@PathVariable Long boardId) {
        boardRepository.deleteById(boardId);
    }


    @GetMapping("/detail")
    public Card readCard(
//            @RequestParam(required = false, value = "board") Long boardId,
//            @RequestParam(required = false, value = "pin") Long pinId,
            @RequestParam(required = false, value = "card") Long cardId
    ) {
//        List<Board> boardList = boardRepository.findAll();
//        Board board = boardList.get(Math.toIntExact(boardId)-1);
//        Pin pin = board.getPins().get(Math.toIntExact(pinId)-1);
//        Card card = pin.getCards().get(Math.toIntExact(cardId)-1);

        Card card = cardService.findById(cardId);
        //board=2&pin=5&card=17 이상한 이유는 각 객체마다 리스트로 들어가면서 다시 0인덱스부터 출발해서 그럼

        return card;
    }


}
