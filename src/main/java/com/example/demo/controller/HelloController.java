package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public List<Map<String, String>> hello() {
        List<Map<String, String>> responseList = new ArrayList<>();

        Map<String, String> item1 = new HashMap<>();
        item1.put("id", "6851");
        item1.put("color", "#26CD29FF");
        item1.put("details", "내용");
        item1.put("end", "2024-08-20T14:00");
        item1.put("kind", "답십리");
        item1.put("name", "답십리");
        item1.put("start", "2024-08-15T14:00");
        item1.put("timed", "true");

        Map<String, String> item2 = new HashMap<>();
        item2.put("id", "71d4");
        item2.put("name", "전농동");
        item2.put("details", "내용: 전농동");
        item2.put("color", "#3E4A7DFF");
        item2.put("kind", "전농동");
        item2.put("start", "2024-08-17T14:56");
        item2.put("end", "2024-08-22T14:57");
        item2.put("timed", "true");

        responseList.add(item1);
        responseList.add(item2);

        return responseList;
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
