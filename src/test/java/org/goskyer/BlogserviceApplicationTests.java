package org.goskyer;

import org.goskyer.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogserviceApplicationTests {

    @Autowired
    public TestMapper testMapper;

    @Test
    public void contextLoads() {

    }

    @Test
    public void dbTest() {
        String json = testMapper.findAll().toString();
        System.out.println(json);
    }

}
