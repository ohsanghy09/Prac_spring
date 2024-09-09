package com.example.demo.controller;

import com.example.demo.model.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class HelloComtroller {

    // 조건에 따른 응답 상태코드 반환
    @GetMapping("/Navigation")
    public ResponseEntity<String> processRequest() {
        // 내부 비즈니스 로직에 따른 조건
        boolean condition1 = true; // 임의의 조건 1
        boolean condition2 = false; // 임의의 조건 2

        // 첫 번째 조건이 참일 때 - 200 OK 반환
        if (condition1) {
            return new ResponseEntity<>("오상현", HttpStatus.OK);
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

    //회원탈퇴 메서드
    @PostMapping("/deleteUser")
    public ResponseEntity<Map<String, String>> uSer(@RequestBody User user) {
        // 전달받은 사용자 정보를 처리
        Map<String, String> response = new HashMap<>();

        // 유효성 검사 (필요시 추가)
        if (user.getPassword() == null || user.getMember_id() == null) {
            response.put("error", "Invalid data: password is missing");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);  // 400 상태 코드 반환
        }

        // 정상적인 경우 password, member_id 반환
        response.put("member_id", user.getMember_id());
        response.put("password", user.getPassword());
        return new ResponseEntity<>(response, HttpStatus.OK);  // 200 상태 코드 반환
    }

    //비밀번호 변경 회원 검색
    @PostMapping("/UpdatefoundUser")
    public Map<String, String> createUser(@RequestBody UpdatePassword_User user) {
        // 전달받은 사용자 정보를 처리
        Map<String, String> response = new HashMap<>();

        // 유효성 검사 (필요시 추가)
        if (user.getMember_id() == null || user.getEmail() == null) {
            response.put("error", "Invalid data: id or password is missing");
            return response;
        }

        // 정상적인 경우 member_id와 email 반환
        response.put("member_id", user.getMember_id());
        response.put("email", user.getEmail());
        return response;
    }

    //비밀 번호 변경
    @PostMapping("/UpdatePasswordUser")
    public ResponseEntity<Map<String, String>> updateUserPassword(@RequestBody UpdatePassword_User2 user) {
        // 전달받은 사용자 정보를 처리
        Map<String, String> response = new HashMap<>();

        // 유효성 검사 (필요시 추가)
        if (user.getPassword() == null) {
            response.put("error", "Invalid data: password is missing");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);  // 400 상태 코드 반환
        }

        return new ResponseEntity<>(HttpStatus.OK);  // 200 상태 코드 반환
    }

    //아이디 찾기
    @PostMapping("/FindIdUser")
    public ResponseEntity<Map<String, String>> findIdUser(@RequestBody FindId_User user) {
        // 전달받은 사용자 정보를 처리
        Map<String, String> response = new HashMap<>();

        // 유효성 검사 (필요시 추가)
        if (user.getName() == null || user.getEmail() == null || user.getBirth() == null) {
            response.put("error", "Invalid data: password is missing");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);  // 400 상태 코드 반환
        }

        // 정상적인 경우 data 반환
        response.put("member_id", "ohsanghy09");
        response.put("name", user.getName());
        response.put("email", user.getEmail());
        response.put("birth", user.getBirth());
        return new ResponseEntity<>(response, HttpStatus.OK);  // 200 상태 코드 반환
    }

    //아이디 중복확인
    @PostMapping("/CheckId")
    public ResponseEntity<Map<String, String>> selectIdUser(@RequestBody SelectId_User user) {
        // 전달받은 사용자 정보를 처리
        Map<String, String> response = new HashMap<>();

        // DB에 아이디가 없을 경우 null 반환
//        if (user.getMember_id() == null) {
        response.put("message", "available");
        return new ResponseEntity<>(response, HttpStatus.OK);  // 400 상태 코드 반환
//        }

        // DB에 아이디가 있을 경우 아이디값 반환
//        response.put("member_id", user.getMember_id());
//        return new ResponseEntity<>(response,HttpStatus.OK);  // 200 상태 코드 반환
    }

    //이메일 인증번호 전송
    @PostMapping("/CheckEmail")
    public ResponseEntity<Map<String, String>> sendEmail(@RequestBody SendEmail_User user) {
        // 전달받은 사용자 정보를 처리
        Map<String, String> response = new HashMap<>();

        // 유효성 검사 (필요시 추가)
        if (user.getEmail() == null) {
            response.put("error", "Invalid data: password is missing");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);  // 400 상태 코드 반환
        }
        // 정상적인 경우 data 반환
        response.put("check_number", "GOOD1234");
        response.put("member_id", user.getMember_id());
        response.put("email", user.getEmail());
        return new ResponseEntity<>(response, HttpStatus.OK);  // 200 상태 코드 반환
    }

    //회원 내용 요청응답
    @PostMapping("/AddMember")
    public ResponseEntity<Map<String, String>> addMember(@RequestBody Addmember_User user) {
        // 전달받은 사용자 정보를 처리
        Map<String, String> response = new HashMap<>();

        // 정상적인 경우 data 반환
        response.put("member_id", user.getMember_id());
        response.put("password", user.getPassword());
        response.put("email", user.getEmail());
        response.put("name", user.getName());
        response.put("birth", user.getBirth());
        response.put("gender", user.getGender());
        return new ResponseEntity<>(response, HttpStatus.OK);  // 200 상태 코드 반환
    }

    // 토큰 발급
    @PostMapping("/token")
    public ResponseEntity<Map<String, Object>> sendDataWithToken(@RequestBody User user, HttpServletResponse response) {
        // 생성된 토큰 (예시로 고정된 값 사용)
        String token = "your-generated-token-here";

        // 응답 헤더에 토큰 추가
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);

        // 응답 데이터 생성
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("name", "오상현"); // 클라이언트로부터 받은 유저 이름 사용
        responseBody.put("member_id", user.getMember_id());
        responseBody.put("password", user.getPassword());

        // ResponseEntity를 사용해 응답 헤더와 데이터를 함께 반환
        return new ResponseEntity<>(responseBody, headers, HttpStatus.OK);
    }

    // 토큰 유효성 검사
    @GetMapping("/checked_token")
    public ResponseEntity<String> getProtectedData(@RequestHeader("Authorization") String token) {
        // JWT 토큰을 파싱하거나 유효성 검사를 수행할 수 있습니다.
        // 이 예제에서는 간단히 토큰을 출력하고 반환합니다.
        System.out.println("Received Token: " + token);

        // 보호된 데이터를 반환 (예시로 문자열을 반환)
        return ResponseEntity.ok("This is protected data token");
    }


    @GetMapping("/groups")
    public ResponseEntity<List<Calender_User>> getGroupSchedules() {
        // JSON 데이터를 GroupSchedule 객체로 변환
        List<Calender_User> groupSchedules = Arrays.asList(
                new Calender_User("운동", "천호동에서 운동", "#2320A7FF", "천호동", "2024-08-28T17:20", "2024-08-29T17:20", true),
                new Calender_User("추가한 그룹 일정", "새로 추가한 그룹 일정 내용", "#FF0000FF", "text", "2024-08-30T17:22", "2024-08-31T17:22", true)
        );

        return new ResponseEntity<>(groupSchedules, HttpStatus.OK);
    }



        @GetMapping("/group-items")
        public ResponseEntity<List<Calendar_Group_User>> getGroupItems() {
            // JSON 데이터를 GroupItem 객체로 변환
            List<Calendar_Group_User> groupItems = Arrays.asList(
                    new Calendar_Group_User("천호동"),
                    new Calendar_Group_User("text")
            );

            return new ResponseEntity<>(groupItems, HttpStatus.OK);
        }
}





