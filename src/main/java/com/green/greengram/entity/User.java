package com.green.greengram.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Entity //테이블을 만들고 DML할 때 사용
public class User extends UpdatedAt{
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    private Long userId;

    @Column(nullable = false, length = 30, unique = true)
    private String uid;

    @Column(nullable = false, length = 100)
    private String upw;

    @Column(length = 30)
    private String nickName;

    @Column(length = 50)
    private String pic;
}
