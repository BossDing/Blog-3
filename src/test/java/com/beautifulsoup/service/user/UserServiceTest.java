package com.beautifulsoup.service.user;

import com.beautifulsoup.BlogApplicationTests;
import com.beautifulsoup.bean.db.User;
import com.beautifulsoup.service.UserService;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BeautifulSoup on 2017/11/30.
 */

public class UserServiceTest extends BlogApplicationTests{

    @Autowired
    private UserService userService;

    @Test
    public void testFindByUsername(){

        User user=userService.findUserByUsername("BeautifulSoup");

        System.out.println(ReflectionToStringBuilder.toString(user, ToStringStyle.MULTI_LINE_STYLE));
    }

    @Test
    @Ignore
    public void  testInsertSelective(){
        List<User> userList=new ArrayList<>();
        User user1=new User("Wangxiaohao","password","","万事起于忽微,量变引起质变",100,230,"13866974521","魔都");
        User user2=new User("李明","password","","Hello World!",136,56,"18836472153","北京中关村");
        User user3=new User("BritialMan","22222","","夫祸患常积于忽微,而智勇多困于所溺",200,129,"13022356194","深圳华强北");
        User user4=new User("Linlin","33333","","程序即艺术",178,56,"15366981024","杭州科技园");
        User user5=new User("王小灏","4444444","","生命不息,奋斗不止。",654,23,"13964669927","成都蚂蚁金服");
        User user6=new User("Zhukai","1235587...","","Hello World!",423,44,"13866974521","西安");
        User user7=new User("Guolin","password","","做你想做的什么时候都不晚",310,31,"17864263303","重庆");
        User user8=new User("HongYang","password","","临渊羡鱼,不如退而结网",100,61,"17872968841","广州");
        User user9=new User("Sam","password","","You are Special,Don't Never Forget it!",340,72,"1357689","北京盛大");

        userService.insertSelective(user1);
        userService.insertSelective(user2);
        userService.insertSelective(user3);
        userService.insertSelective(user4);
        userService.insertSelective(user5);
        userService.insertSelective(user6);
        userService.insertSelective(user7);
        userService.insertSelective(user8);
        userService.insertSelective(user9);
    }

    @Test
    public void findAllUsers(){
        List<User> userList=userService.findAllUsers();

        for (User user:userList) {
            System.out.println(ReflectionToStringBuilder.toString(user,ToStringStyle.MULTI_LINE_STYLE));
        }

    }



}
