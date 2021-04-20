package com.team_talk.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignupRequestDto {
    private String username;
    private String password;
    private String framework;
    private boolean admin = false;
    private String adminToken = "";
}