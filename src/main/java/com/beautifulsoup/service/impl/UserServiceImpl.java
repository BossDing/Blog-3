package com.beautifulsoup.service.impl;

import com.beautifulsoup.bean.db.User;
import com.beautifulsoup.mapper.UserMapper;
import com.beautifulsoup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by BeautifulSoup on 2017/11/9.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByUsername(String username) {
        User user=userMapper.findUserByUsername(username);
        System.out.println(user);
        return user;
    }
}
