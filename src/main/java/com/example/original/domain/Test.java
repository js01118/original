package com.example.original.domain;

import com.sun.istack.NotNull;
import lombok.*;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.BatchSize;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String productName;

    @Column
    private Long stock;

    @Column
    private Long price;

    @Column
    private String life;

    @Column
    private String origin;

}
