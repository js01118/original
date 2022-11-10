package com.example.original.service;

import com.example.original.DTO.FindDTO;
import com.example.original.DTO.TestDTO;
import com.example.original.domain.Test;
import com.example.original.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    final TestRepository testRepository;
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public String joinApply(TestDTO testDTO) {
        testRepository.save(Test.builder()
                .productName(testDTO.getProductName())
                .stock(testDTO.getStock())
                .price(testDTO.getPrice())
                .life(testDTO.getLife())
                .origin(testDTO.getOrigin())
                .build()
        );
    return "success";
    }

    public Test findTest(FindDTO findDTO) {
        return testRepository.findTestById(findDTO.getId());
    }

    public void deleteTest(FindDTO findDTO) {
        testRepository.deleteById(findDTO.getId());
    }

    public Test update(FindDTO findDTO) {
        Test test = testRepository.findTestById(findDTO.getId());
        test.setProductName("123");
        test.setOrigin("123");
        testRepository.save(test);
        return testRepository.findTestById(findDTO.getId());
    }

}
