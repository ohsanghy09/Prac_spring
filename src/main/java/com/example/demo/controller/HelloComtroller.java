package com.example.demo.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class HelloComtroller {

    @GetMapping("/api/data")
    public String sendDataWithToken(HttpServletResponse response) {
        // 생성된 토큰 (예시로 고정된 값 사용)
        String token = "your-generated-token-here";

        // 응답 헤더에 토큰 추가
        response.setHeader("Authorization", "Bearer " + token);

        // 클라이언트로 보낼 데이터
        return "This is the protected data";

    }


        @GetMapping("/protected-data")
        public ResponseEntity<String> getProtectedData(@RequestHeader("Authorization") String token) {
            // JWT 토큰을 파싱하거나 유효성 검사를 수행할 수 있습니다.
            // 이 예제에서는 간단히 토큰을 출력하고 반환합니다.
            System.out.println("Received Token: " + token);

            // 보호된 데이터를 반환 (예시로 문자열을 반환)
            return ResponseEntity.ok("This is protected data token");
        }

}