package com.beautifulsoup.controller;

import com.beautifulsoup.bean.db.User;
import com.beautifulsoup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BeautifulSoup on 2017/11/9.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public @ResponseBody User showUserByUsername(@RequestParam("username") String username){
        User user=userService.findUserByUsername(username);
//        return user;
        return user;
    }
}
