package com.beautifulsoup.service.impl;

import com.beautifulsoup.bean.db.User;
import com.beautifulsoup.bean.db.UserExample;
import com.beautifulsoup.mapper.UserMapper;
import com.beautifulsoup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public User updateUserByUid() {
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
}