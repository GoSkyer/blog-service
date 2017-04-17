package org.goskyer.service.impl

import org.goskyer.domain.Post
import org.goskyer.mapping.PostMapper
import org.goskyer.service.PostService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by zohar on 2017/4/17.
 * desc:
 */
@Service
class PostServiceImpl: PostService {

    private val logger = LoggerFactory.getLogger(PostServiceImpl::class.java)


    @Autowired
    private lateinit var postMapper:PostMapper

    override fun getPostByPostId(postId: Int): Post {
        return postMapper.selectByPostId(postId)
    }

    override fun getPostsByUserId(userId: Int): MutableList<Post> {
        return postMapper.selectByUserId(userId)
    }

    override fun addPost(post: Post?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deletePost(PostId: Int): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}