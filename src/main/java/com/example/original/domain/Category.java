package com.example.original.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)

@Table(schema = "exam", name = "category")

public class Category implements Serializable { //Serializable : 직렬화 , implements : 규칙, 제약
    @Id //키
    @GeneratedValue(strategy = GenerationType.IDENTITY) //@Id랑 같이 쓸 것
    private Long categoryId; //DB int -> Long

    @Size(max = 10) //varchar()크기를 넘지 말 것
    private String code;

    @NotNull //null값이 들어 갈 수 없다
    @Size(max = 50)
    private String name;

    @NotNull
    @Size(max = 1)
    private String useYn;

    @NotNull
    private LocalDateTime regDate;
}
