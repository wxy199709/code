package edu.service.impl;

import edu.dao.UserMapper;
import edu.entity.User;
import edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User user){

    }

    @Override
    public User selectUserBynameAndpassowrd(String username, String password) {
        User user = userMapper.selectUserBynameAndpassowrd(username, password);
        if (username.equals(user.getUsername()) && password.equals(user.getPassword())){
            return user;
        }else {
            return null;
        }
    }
}
