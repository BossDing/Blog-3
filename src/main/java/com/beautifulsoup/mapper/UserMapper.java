package com.beautifulsoup.mapper;

import com.beautifulsoup.bean.db.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by BeautifulSoup on 2017/11/9.
 */
public interface UserMapper {
    User findUserByUsername(@Param("username") String username);
}
