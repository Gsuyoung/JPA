package com.green.greengram.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class UserFollow extends CreatedAt{
    @EmbeddedId
    private UserFollowIds userFollowIds;

    @ManyToOne
    @MapsId("fromUserId")
    @JoinColumn(name = "from_user_id")
    private User FromUser;

    @ManyToOne
    @MapsId("toUserId")
    @JoinColumn(name = "to_user_id")
    private User ToUser;
}
