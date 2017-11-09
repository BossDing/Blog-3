package com.beautifulsoup.service;

import com.beautifulsoup.bean.db.User;

/**
 * Created by BeautifulSoup on 2017/11/9.
 */
public interface UserService {
    User findUserByUsername(String username);
}
