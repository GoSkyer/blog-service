package org.goskyer.mapping;

import org.apache.ibatis.annotations.Mapper;
import org.goskyer.domain.Post;
import org.springframework.stereotype.Repository;

/**
 * Created by zohar on 2017/4/14.
 * desc:
 */
@Mapper
@Repository
public interface PostMapper {

    public Post selectByPostId(long postId);



}
