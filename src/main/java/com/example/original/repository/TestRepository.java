package com.example.original.repository;

import com.example.original.domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

//데이터 수정시 영속성 조심

@Repository
public interface TestRepository extends JpaRepository<Test, Long> implements Serializable {

    public Test findTestById(Long id);

    public void deleteById(Long id);

}
