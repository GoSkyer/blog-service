package org.goskyer.service;

import org.goskyer.domain.Post;

import java.util.List;

/**
 * Created by zohar on 2017/4/17.
 * desc:
 */
public interface PostService {

    Post getPostByPostId(int postId);

    List<Post> getPostsByUserId(int UserId);

    int addPost(Post post);

    int deletePost(int PostId);
}
