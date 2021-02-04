package edu.service;



import edu.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    void insertUser(User user);
    User selectUserBynameAndpassowrd(@Param("username") String username, @Param("password") String password);
}
