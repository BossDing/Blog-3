package com.beautifulsoup.shiro;

import com.beautifulsoup.bean.db.Permission;
import com.beautifulsoup.bean.db.Role;
import com.beautifulsoup.bean.db.User;
import com.beautifulsoup.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by BeautifulSoup on 2017/11/9.
 * 实现用户认证与授权
 */
public class BlogAuthRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user= (User) principalCollection.fromRealm(this.getClass().getName()).iterator().next();
        List<String> permissionList=new ArrayList<>();
        List<String> roleList=new ArrayList<>();
        Set<Role> roleSet=user.getRoles();

        if (CollectionUtils.isNotEmpty(roleSet)){
            for (Role role:roleSet){
                roleList.add(role.getRname());
                Set<Permission> permissionSet=role.getPermissions();
                if (CollectionUtils.isNotEmpty(permissionSet)){
                    for (Permission permission:permissionSet){
                        permissionList.add(permission.getName());
                    }
                }
            }
        }

        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        info.addStringPermissions(permissionList);
        info.addRoles(roleList);

        return info;
    }




    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        String username = usernamePasswordToken.getUsername();
        User user=userService.findUserByUsername(username);
        return new SimpleAuthenticationInfo(user,user.getPassword(),this.getClass().getName());
    }

}
