package edu.dao;

import edu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserMapper {
    void insertUser(User user);
    User selectUserBynameAndpassowrd(@Param("username") String username, @Param("password") String password);
}
