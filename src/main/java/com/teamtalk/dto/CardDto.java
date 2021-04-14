package com.teamtalk.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CardDto {
    private String title;
    private String description;
    private Long pinId;
}
