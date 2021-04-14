package com.teamtalk.services;

import com.teamtalk.dto.CardDto;
import com.teamtalk.dto.PinDto;
import com.teamtalk.models.Card;
import com.teamtalk.models.Pin;
import com.teamtalk.repositories.PinRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PinService {
    private final PinRepository pinRepository;

    public Pin create(PinDto pinDto) {
        Pin pin = new Pin(pinDto);
        return pinRepository.save(pin);
    }
    public Pin findById(Long id) {
        return pinRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException()
        );
    }
}
