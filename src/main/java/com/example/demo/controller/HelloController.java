package com.example.demo.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class HelloController {

    @GetMapping("/api/data")
    public String sendDataWithToken(HttpServletResponse response) {
        // 생성된 토큰 (예시로 고정된 값 사용)
        String token = "your-generated-token-here";

        // 응답 헤더에 토큰 추가
        response.setHeader("Authorization", "Bearer " + token);

        // 클라이언트로 보낼 데이터
        return "This is the protected data";

    }

    @GetMapping("/api/Group")
    public Map<String, String> Group() {
        Map<String, String> response = new HashMap<>();
        response.put("id", "2d8d");
        response.put("group_item", "답십리");
        return response;
    }

    @PostMapping("/api/addEvent")
    public  void addEvent(@RequestBody Map<String, String> event) {
        // 받은 이벤트 데이터를 처리 (예: DB 저장)
        // 여기서는 간단히 ID를 추가하고 반환

        event.put("id", "new_id");
    }



}
