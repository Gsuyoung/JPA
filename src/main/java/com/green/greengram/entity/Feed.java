package com.green.greengram.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
//@Table(name = "feed_table") //테이블명이 클래스명이 아닌 다른 이름으로 만들고 싶다면
public class Feed extends UpdatedAt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedId;

    @ManyToOne //Many가 Feed, To One이 User
    @JoinColumn(name = "writer_user_id", nullable = false)
    private User writerUserId;

    @Column(length = 1_000)
    private String contents;

    @Column(length = 30)
    private String location;
}