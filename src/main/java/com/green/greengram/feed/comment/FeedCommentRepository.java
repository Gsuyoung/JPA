package com.green.greengram.feed.comment;

import com.green.greengram.entity.FeedComment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FeedCommentRepository extends JpaRepository<FeedComment, Long> {
//    Optional<FeedComment> findByFeedCommentIdAndUserId(Long feedCommentId, User user);

//    @Modifying // <-- 이 애노테이션이 있어야 delete or update JPQL, 리턴타입은 void or int 없으면 무조건 select
//    @Query("delete from FeedComment f where f.feedCommentId=:feedCommentId AND f.user.userId=:userId")
//    int deleteFeedComment(@Param("feedCommentId") Long feedCommentId, @Param("userId") Long userId);
}