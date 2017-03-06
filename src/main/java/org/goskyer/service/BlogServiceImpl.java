package org.goskyer.service;

import org.goskyer.dao.BlogDAO;
import org.goskyer.dao.BlogDAOImpl;
import org.goskyer.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl {

    @Autowired
    private BlogMapper blogMapper;

}
