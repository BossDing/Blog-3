package com.beautifulsoup.service.impl;

import com.beautifulsoup.bean.db.Article;
import com.beautifulsoup.bean.db.User;
import com.beautifulsoup.bean.db.UserExample;
import com.beautifulsoup.bean.vo.UserCustom;
import com.beautifulsoup.mapper.UserMapper;
import com.beautifulsoup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * Created by BeautifulSoup on 2017/11/9.
 */
@Transactional
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

    @Override
    public User findUserByUid(Integer uid) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria= userExample.createCriteria();
        criteria.andUidEqualTo(uid);
        List<User> userList= userMapper.selectByExample(userExample);
        if(userList.size()>0&&userList!=null){
            return userList.get(0);
        }
        return null;
    }


    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public int getAllUsersCount() {
        int count=userMapper.getAllUsersCount();
        int result=1;
        if (count%5==0){
            result=count/5;
        }else{
            result=count/5+1;
        }
        return result;
    }

    @Override
    public List<User> listAllUsersByPage(Integer pageNum) {
        int pageNumCount=(pageNum-1)*5;
        return userMapper.listAllUsersByPage(pageNumCount);
    }

    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return userMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public void deleteArticleByUserId(int uid) {
        List<UserCustom> userCustoms=userMapper.findUserCustomsByUid(uid);
        if (null!=userCustoms&&!userCustoms.isEmpty()){
            UserCustom userCustom=userCustoms.get(0);
            Set<Article> articles=userCustom.getArticleSet();
            if (null!=articles&&!articles.isEmpty()){
                userMapper.deleteArticleByUserId(uid);
            }
        }
    }

    @Override
    public List<UserCustom> findUserCustomsByUid(Integer uid) {
        return userMapper.findUserCustomsByUid(uid);
    }


}