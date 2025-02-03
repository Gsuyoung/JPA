package com.green.greengram.entity;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Embeddable
@EqualsAndHashCode
public class UserFollowIds implements Serializable {
    private Long fromUserId;
    private Long toUserId;
}
