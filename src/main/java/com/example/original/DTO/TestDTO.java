package com.example.original.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TestDTO {

    private String productName;
    private Long stock;
    private Long price;
    private String life;
    private String origin;
}
