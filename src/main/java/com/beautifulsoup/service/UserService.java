package com.beautifulsoup.service;

import com.beautifulsoup.bean.db.User;
import com.beautifulsoup.bean.vo.UserCustom;

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

    int getAllUsersCount();

    List<User> listAllUsersByPage(Integer pageNum);

    int deleteByPrimaryKey(Integer uid);

    int updateByPrimaryKey(User record);

    void deleteArticleByUserId(int uid);

    List<UserCustom> findUserCustomsByUid(Integer uid);
}
