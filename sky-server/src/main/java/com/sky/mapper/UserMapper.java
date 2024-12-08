package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface UserMapper {
    /**
     * 插入
     *
     * @param user
     */
    void insert(User user);

    /**
     * 根据openid查询用户
     *
     * @return
     */
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String openid);

    /**
     * 通过id查找用户
     *
     * @param id
     * @return
     */
    @Select("select  * from user where id = #{id}")
    User getById(Long id);

    /**
     * 根据动态条件统计用户数量
     *
     * @param map
     * @return
     */
    Integer countByMap(Map map);
}
