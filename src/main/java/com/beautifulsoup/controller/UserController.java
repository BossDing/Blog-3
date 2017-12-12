package com.beautifulsoup.controller;

import com.beautifulsoup.bean.db.Article;
import com.beautifulsoup.bean.db.User;
import com.beautifulsoup.bean.vo.UserCustom;
import com.beautifulsoup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * Created by BeautifulSoup on 2017/11/9.
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ModelAttribute("totalPage")
    public int getTotalPage(){
        return userService.getAllUsersCount();
    }

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
        List<User> userList=userService.listAllUsersByPage(1);
        model.addAttribute("users",userList);
        return "manage/manage-user";
    }

    @RequestMapping(value = "/listbypage")
    public String listUserByPage(Model model,@RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum){
        List<User> userList=userService.listAllUsersByPage(pageNum);
        model.addAttribute("users",userList);
        return "manage/manage-user";
    }

    @RequestMapping(value = "/add")
    public String addUser(){
        return "manage/manage-user-add";
    }

    @RequestMapping(value = "/update")
    public String updateUser(@RequestParam("uid")Integer uid,Model model){
        User user=userService.findUserByUid(uid);
        model.addAttribute("user",user);
        return "manage/manage-user-update";
    }

    @RequestMapping(value = "/deletebyid",method = RequestMethod.POST)
    public String deleteUser(@RequestParam("uid")Integer uid,RedirectAttributes model){
        userService.deleteArticleByUserId(uid);
        int deleteCount=userService.deleteByPrimaryKey(uid);
        model.addAttribute("deleteCount",deleteCount);
        return "manage/manage-user";
    }

    @RequestMapping(value = "/adduser",method = RequestMethod.POST)
    public String addUserSubmit(User user,Model model){
        int successId=userService.insertSelective(user);
        model.addAttribute("successId",successId);
        List<User> userList=userService.listAllUsersByPage(1);
        model.addAttribute("users",userList);
        return "manage/manage-user";
    }

    @RequestMapping(value = "/updateuser",method = RequestMethod.POST)
    public String updateUserSubmit(User user,Model model){
        userService.updateByPrimaryKey(user);
        List<User> userList=userService.listAllUsersByPage(1);
        model.addAttribute("users",userList);
        return "manage/manage-user";
    }
}
