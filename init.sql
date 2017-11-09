--用户表--
create table USER(
		uid int(11) not null auto_increment,
		username varchar(100) not null default "" comment "用户名",
		password varchar(100) not null default "" comment "密码",
		avatar varchar(255) comment "头像地址",	
		descriprion varchar(255) comment "描述",
		follow int comment "关注人数",
		followed int comment "被人关注",
		phone varchar(20) comment "电话",
		address varchar(200) comment "住址",
		create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
		update_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
		primary key(uid)
)ENGINE = INNODB DEFAULT CHARSET=utf8;
--权限表--
create table permission(
		pid int(11) not null auto_increment,
		name varchar(255) not null default "" comment "权限名称",
		url varchar(255) default "" comment "拦截的URL",
		create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
		update_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
		primary key(pid)
)ENGINE = INNODB DEFAULT CHARSET=utf8;
--角色表--
create table role(
		rid int(11) not null auto_increment,
		rname varchar(255) not null default "" comment "角色名称",
		create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
		update_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
		primary key(rid)
)ENGINE = INNODB DEFAULT CHARSET=utf8;
-- 权限角色关系表 --
CREATE TABLE permission_role (
  rid int(11) NOT NULL ,
  pid int(11) NOT NULL ,
  KEY idx_rid (rid),
  KEY idx_pid (pid)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;
-- 用户角色关系表 --
CREATE TABLE user_role (
  uid int(11) NOT NULL ,
  rid int(11) NOT NULL ,
  KEY idx_uid (uid),
  KEY idx_rid (rid)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;