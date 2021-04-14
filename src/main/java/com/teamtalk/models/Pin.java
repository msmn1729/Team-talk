package com.teamtalk.models;

import com.teamtalk.dto.PinDto;
import com.teamtalk.services.PinService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Pin {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @Column(nullable = false)
    private String title;

//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "card_id") // 필요?
//    private List<Card> cards;

    public Pin(String title) {
        this.title = title;
    }

    public Pin(PinDto pinDto) {
        this.title = pinDto.getTitle();
//        this.cards = cardService.findById(pinDto.getCardsId());
    }
}
