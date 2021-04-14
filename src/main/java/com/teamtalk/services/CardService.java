package com.teamtalk.services;

import com.teamtalk.dto.CardDto;
import com.teamtalk.models.Card;
import com.teamtalk.models.Pin;
import com.teamtalk.repositories.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CardService {
    private final CardRepository cardRepository;
    private final PinService pinService;

    public Card create(CardDto cardDto) {
        Card card = new Card(cardDto, pinService);
        return cardRepository.save(card);
    }

    public Card findById(Long id) {
        return cardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException()
        );
    }
}
