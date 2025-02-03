package com.green.greengram.feed;

import com.green.greengram.entity.Feed;
import com.green.greengram.entity.FeedPic;
import com.green.greengram.entity.FeedPicIds;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FeedPicRepository extends JpaRepository<FeedPic, FeedPicIds> {
}
