package com.example.original.controller;

import com.example.original.DTO.FindDTO;
import com.example.original.DTO.TestDTO;
import com.example.original.domain.Test;
import com.example.original.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    final TestService testService;
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping("/post")  //path(주소)
    public String post(@RequestBody TestDTO testDTO) {
        testService.joinApply(testDTO);
        return "success";
    }

    @PostMapping("/find")
    public ResponseEntity<Test> findTest(@RequestBody FindDTO findDTO) {
        HttpHeaders resHeaders = new HttpHeaders();
        resHeaders.add("Content-Type", "application/json;charset=UTF-8");

        Test test = testService.findTest(findDTO);

        return new ResponseEntity<>(test, resHeaders, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<Test> updateTest(@RequestBody FindDTO findDTO) {
        HttpHeaders resHeaders = new HttpHeaders();
        resHeaders.add("Content-Type", "application/json;charset=UTF-8");

        Test test = testService.update(findDTO);

        return new ResponseEntity<>(test, resHeaders, HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseEntity<Boolean> deleteTest(@RequestBody FindDTO findDTO) {
        HttpHeaders resHeaders = new HttpHeaders();
        resHeaders.add("Content-Type", "application/json;charset=UTF-8");

        testService.deleteTest(findDTO);
        return new ResponseEntity<>(Boolean.TRUE, resHeaders, HttpStatus.OK);
    }
}




