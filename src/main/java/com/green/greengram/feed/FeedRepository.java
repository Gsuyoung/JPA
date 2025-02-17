package com.green.greengram.feed;

import com.green.greengram.entity.Feed;
import com.green.greengram.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FeedRepository extends JpaRepository<Feed, Long> {
    Optional<Feed> findByFeedIdAndWriterUserId(Long feedId, User writerUser);

    //쿼리 메소드로 delete, update는 비추천
    int deleteByFeedIdAndWriterUserId(Long feedId, User writerUser);

    //JPQL (Java Persistence Query Language)
    @Modifying // <-- 이 애노테이션이 있어야 delete or update JPQL, 리턴타입은 void or int 없으면 무조건 select
    @Query("delete from Feed f where f.feedId=:feedId AND f.writerUserId.userId=:writerUserId")
    int deleteFeed(@Param("feedId") Long feedId, @Param("writerUser") Long writerUserId);
    /*
    Feed(대문자로 시작) - 클래스명 작성해야 함

    feedId = 1, writerUserId = 2 가정하에 아래 SQL문이 만들어진다.
    DELETE FROM feed f
    WHERE f.feed_id = 1
    AND f.user_id = 2
     */
}