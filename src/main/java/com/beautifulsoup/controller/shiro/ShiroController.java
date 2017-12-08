package com.beautifulsoup.controller.shiro;

import com.beautifulsoup.bean.db.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by BeautifulSoup on 2017/11/9.
 */
@Controller
public class ShiroController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            subject.logout();
        }
        return "login";
    }

    @RequestMapping("unauthorized")
    public String unauthorized() {
        return "unauthorized";
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String admin() {
        return "admin success";
    }

    @RequestMapping("/edit")
    @ResponseBody
    public String edit() {
        return "edit success";
    }

    @RequestMapping("/loginUser")
    public String loginUser(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpSession session, Model model) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            User user = (User) subject.getPrincipal();
//            session.setAttribute("user", user);
            model.addAttribute("user",user);
            return "index";
        } catch (Exception e) {
            return "login";
        }
    }

    @RequestMapping(value = "/gettoken",method = RequestMethod.POST)
    public @ResponseBody UsernamePasswordToken getToken(@RequestParam("username") String username,
                                         @RequestParam("password") String password){
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
        Subject subject=SecurityUtils.getSubject();
        subject.login(token);
        return token;
    }

}
