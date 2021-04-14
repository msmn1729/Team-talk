package com.teamtalk.models;

import com.teamtalk.dto.CardDto;
import com.teamtalk.services.PinService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
//@Embeddable
public class Card {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pin_id") // 필요?
    private Pin pin;

    public Card(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Card(CardDto cardDto, PinService pinService) {
        this.title = cardDto.getTitle();
        this.description = cardDto.getDescription();
        this.pin = pinService.findById(cardDto.getPinId());
    }
}
