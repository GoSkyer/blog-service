package org.goskyer;

import org.goskyer.mapping.PostMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootstudyApplicationTests {
    private final static Logger logger = LoggerFactory.getLogger(SpringbootstudyApplicationTests.class);
    @Autowired
    PostMapper postMapper;

    @Test
    public void contextLoads() {
//		System.out.println(postMapper.selectByPostId(2));
//		Logger.getGlobal().log(Level.ALL,postMapper.selectByUserId(14).toString());
//		System.out.println(postMapper.selectByUserId(14).toString());
//        Post post = new Post();
//        post.setAuthId(14);
//        post.setTitle("test4");
//        post.setMd("md123123");
//        postMapper.insertPost(post);
        logger.info(postMapper.deletePost(22) + "");
    }

}
