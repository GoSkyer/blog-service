package org.goskyer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * Created by OoO on 2017/3/4.
 */
@Mapper
public interface TestMapper {

    @Select("select * from member;")
    public Map<String,Object> findAll();

}
