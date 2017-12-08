package com.beautifulsoup.service;

import com.beautifulsoup.bean.db.User;

import java.util.List;

/**
 * Created by BeautifulSoup on 2017/11/9.
 */
public interface UserService {
    User findUserByUsername(String username);
    User findUserByUid(Integer uid);
    int insertSelective(User record);
    int insert(User record);
    List<User> findAllUsers();
}
