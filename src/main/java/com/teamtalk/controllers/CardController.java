package com.teamtalk.controllers;

import com.teamtalk.models.Card;
import com.teamtalk.repositories.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CardController {
    private final CardRepository cardRepository;

    @GetMapping("/card")
    public List<Card> readCard() {
        return cardRepository.findAll();
    }
}
