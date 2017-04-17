package org.goskyer.controller.post

import org.goskyer.controller.auth.BaseController
import org.goskyer.domain.BaseResult
import org.goskyer.service.impl.PostServiceImpl
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by zohar on 2017/4/17.
 * desc:
 */
@RestController
@RequestMapping("")
class PostController : BaseController() {

    private val logger = LoggerFactory.getLogger(PostController::class.java)

    @Autowired
    private lateinit var postService: PostServiceImpl

    @GetMapping(value = "/post/{postId}")
    public fun getPostByPostId(@PathVariable("postId") postId: Int): BaseResult<*>? {
        val post = postService.getPostByPostId(postId)
        logger.info(post.toString())
        return BaseResult.build("获取博客成功",post)
    }

    @GetMapping(value = "/posts/{userId}")
    public fun getPostByUserId(@PathVariable("userId") userId: Int): BaseResult<*>? {
        val posts = postService.getPostsByUserId(userId)
        logger.info(posts.toString())
        return BaseResult.build("获取用户博客列表成功",posts)
    }

}