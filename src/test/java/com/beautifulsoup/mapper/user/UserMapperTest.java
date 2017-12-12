package com.beautifulsoup.mapper.user;

import com.beautifulsoup.BlogApplicationTests;
import com.beautifulsoup.bean.vo.UserCustom;
import com.beautifulsoup.mapper.UserMapper;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by BeautifulSoup on 2017/12/12.
 */
public class UserMapperTest extends BlogApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindUserCustomsById(){
        List<UserCustom> customs=userMapper.findUserCustomsByUid(2);
        System.out.println("集合的长度为:"+customs.size());
        System.out.println("属性集合的长度为:"+customs.get(0).getArticleSet().size());
        for (UserCustom custom:customs){
            System.out.println(ReflectionToStringBuilder.toString(custom, ToStringStyle.MULTI_LINE_STYLE));
        }
    }
}
