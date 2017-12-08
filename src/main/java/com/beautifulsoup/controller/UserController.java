package com.beautifulsoup.controller;

import com.beautifulsoup.bean.db.User;
import com.beautifulsoup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by BeautifulSoup on 2017/11/9.
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/getbyname",method = RequestMethod.GET)
    public @ResponseBody User showUserByUsername(@RequestParam("username") String username){
        User user=userService.findUserByUsername(username);
        return user;
    }
    @RequestMapping(value = "/getbyid",method = RequestMethod.GET)
    public @ResponseBody User showUserByUid(@RequestParam("uid") Integer uid){
        User user=userService.findUserByUid(uid);
        return user;
    }
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public int insertSelective(@RequestParam @RequestBody User user){
        return userService.insertSelective(user);
    }

    @RequestMapping(value = "/listall")
    public String listAllUsers(Model model){
        List<User> userList=userService.findAllUsers();
        model.addAttribute("users",userList);
        return "manage/manage-user";
    }
}
