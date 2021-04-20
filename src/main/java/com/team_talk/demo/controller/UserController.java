package com.team_talk.demo.controller;

import com.team_talk.demo.domain.User;
import com.team_talk.demo.dto.SignupRequestDto;
import com.team_talk.demo.repository.UserRepository;
import com.team_talk.demo.security.UserDetailsImpl;
import com.team_talk.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Optional;

//@Controller // /**/원래는 이거 였음
@RestController
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping("/test")
    public void test() {
        User user = new User("회원", "1", "주특기");
        userRepository.save(user);
    }

    // 회원 조회
    @GetMapping("/users")
    public List<User> readUsers() {
        return userRepository.findAll();
    }

    // 회원 로그인 페이지
    @GetMapping("/user/login")
    public String login() {
        return "login";
    }

    @GetMapping("/user/check")
    public Optional<User> loginCheck(@AuthenticationPrincipal UserDetailsImpl userDetails) {
//        SignupRequestDto signupRequestDto = new SignupRequestDto();
//        signupRequestDto.setUsername(userDetails.getUsername());
//        signupRequestDto.setPassword(userDetails.getPassword());
//        User user = new User();
//        user.setUsername(userDetails.getUsername());
//        user.setPassword(userDetails.getPassword());
//        user.setFramework(userDetails.getFramework());
//        return user;
        return userRepository.findByUsername(userDetails.getUsername());
    }

    @GetMapping("/user/login/error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }

    // 회원 가입 페이지
    @GetMapping("/user/signup")
    public String signup() {
        return "signup";
    }

    // 회원 가입 요청 처리
    @PostMapping("/user/signup")
    public void registerUser(@RequestBody SignupRequestDto requestDto) {
        userService.registerUser(requestDto);
        System.out.println(requestDto.getUsername());
        System.out.println(requestDto.getPassword());
        System.out.println(requestDto.getSkill());
//        return "redirect:/";
    }

    @GetMapping("/user/forbidden")
    public String forbidden() {
        return "forbidden";
    }

}