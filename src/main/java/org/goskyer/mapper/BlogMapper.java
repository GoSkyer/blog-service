package org.goskyer.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper {

    void createBlog();

}
