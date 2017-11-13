package com.beautifulsoup.mapper;

import com.beautifulsoup.bean.db.PermissionRole;
import com.beautifulsoup.bean.db.PermissionRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionRoleMapper {
    int countByExample(PermissionRoleExample example);

    int deleteByExample(PermissionRoleExample example);

    int insert(PermissionRole record);

    int insertSelective(PermissionRole record);

    List<PermissionRole> selectByExample(PermissionRoleExample example);

    int updateByExampleSelective(@Param("record") PermissionRole record, @Param("example") PermissionRoleExample example);

    int updateByExample(@Param("record") PermissionRole record, @Param("example") PermissionRoleExample example);
}