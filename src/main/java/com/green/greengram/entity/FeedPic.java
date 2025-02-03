package com.green.greengram.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Setter
@Getter
public class FeedPic extends CreatedAt{
    @EmbeddedId //복합키
    private FeedPicIds feedPicIds;

    @ManyToOne //복합키를위한 설정 (class명 : many feed: one)
    @MapsId("feedId") //속성명
    @JoinColumn(name = "feed_id")
    @OnDelete(action = OnDeleteAction.CASCADE) //단방향 상태에서 on delete cascade(DDL) 설정
    private Feed feed;
}
