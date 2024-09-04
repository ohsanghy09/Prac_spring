package com.example.demo.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class HelloComtroller {

    @GetMapping("/process")
    public ResponseEntity<String> processRequest() {
        // 내부 비즈니스 로직에 따른 조건
        boolean condition1 = true; // 임의의 조건 1
        boolean condition2 = false; // 임의의 조건 2

        // 첫 번째 조건이 참일 때 - 200 OK 반환
        if (condition1) {
            return new ResponseEntity<>("Process successful!", HttpStatus.OK);
        }
        // 두 번째 조건이 참일 때 - 201 Created 반환
        else if (condition2) {
            return new ResponseEntity<>("Resource created!", HttpStatus.CREATED);
        }
        // 아무 조건도 만족하지 않을 때 - 500 Internal Server Error 반환
        else {
            return new ResponseEntity<>("An error occurred!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}



