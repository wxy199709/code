package edu.controller;


import edu.config.Result;
import edu.dao.UserMapper;
import edu.entity.User;
import edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/regist")
    public HashMap<String, Object> registre(UserMapper user){
        try {
            return Result.make(Result.success,Result.msg,null);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.make(Result.fail,Result.failMsg,null);

    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public HashMap<String, Object> login(@RequestParam("username") String username, @RequestParam("password") String password){
        try {
            if (username!=null && password !=null){
                User user = userService.selectUserBynameAndpassowrd(username, password);
                return Result.make(Result.success,Result.msg,user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.make(Result.fail,Result.failMsg,null);
    }
}
