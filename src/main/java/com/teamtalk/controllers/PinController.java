package com.teamtalk.controllers;

//import com.teamtalk.dto.CardDto;
//import com.teamtalk.dto.PinDto;
//import com.teamtalk.models.Card;

import com.teamtalk.dto.CardDto;
import com.teamtalk.dto.PinDto;
import com.teamtalk.models.Card;
import com.teamtalk.models.Pin;
//import com.teamtalk.repositories.CardRepository;
import com.teamtalk.repositories.CardRepository;
import com.teamtalk.repositories.PinRepository;
import com.teamtalk.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PinController {
    private final PinRepository pinRepository;
    private final CardRepository cardRepository;
    private final CardService cardService;

    @GetMapping("/create")
    public void createPin() {
        Pin pin = new Pin("1번 핀");
        Long id = pinRepository.save(pin).getId();
        PinDto pinDto = new PinDto();
        CardDto cardDto = new CardDto();
        List<Card> cards = null;
        cardDto.setTitle("1-1 카드 제목");
        cardDto.setDescription("1-1 카드 내용");
        cardDto.setPinId(id);
        cardService.create(cardDto);

        cardDto.setTitle("1-2 카드 제목");
        cardDto.setDescription("1-2 카드 내용");
        cardDto.setPinId(id);
        cardService.create(cardDto);

        pin = new Pin("2번 핀");
        id = pinRepository.save(pin).getId();
        cardDto.setTitle("2-1 카드 제목");
        cardDto.setDescription("2-1 카드 내용");
        cardDto.setPinId(id);
        cardService.create(cardDto);
        pinRepository.save(pin);
    }

    @GetMapping("/pin")
    public List<Pin> readPin() {
        return pinRepository.findAll();
    }
}
