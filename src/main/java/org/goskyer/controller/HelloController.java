package org.goskyer.controller;

import org.goskyer.common.ResultModel;
import org.goskyer.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by galaxy on 2017/3/3.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/test")
    public String hello(){

        ResultModel resultModel = new ResultModel(testMapper.findAll());

        return  resultModel.toJSON();
    }

}
