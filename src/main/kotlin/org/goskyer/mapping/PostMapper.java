package org.goskyer.mapping;

import org.apache.ibatis.annotations.Mapper;
import org.goskyer.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zohar on 2017/4/14.
 * desc:
 */
@Mapper
@Repository
public interface PostMapper {

    public Post selectByPostId(int postId);

    List<Post> selectByUserId(int UserId);

    int insertPost(Post post);

    int deletePost(int postId);
}
