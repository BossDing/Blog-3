-- 用户表 --
create table USER(
		uid int(11) not null auto_increment,
		username varchar(100) not null default "" comment "用户名",
		password varchar(100) not null default "" comment "密码",
		avatar varchar(255) comment "头像地址",
		description varchar(255) comment "描述",
		follow int comment "关注人数",
		followed int comment "被人关注",
		phone varchar(20) comment "电话",
		address varchar(200) comment "住址",
		primary key(uid)
)ENGINE = INNODB DEFAULT CHARSET=utf8;
insert into user VALUES (1,"BeautifulSoup","1997admin","http://oz5ieaaaz.bkt.clouddn.com/icon.png","能工摹形,巧匠窃意",210,21,17864195311,"山东师范大学");
-- 权限表--
create table permission(
		pid int(11) not null auto_increment,
		name varchar(255) not null default "" comment "权限名称",
		url varchar(255) default "" comment "有权的URL",
		primary key(pid)
)ENGINE = INNODB DEFAULT CHARSET=utf8;
insert INTO permission VALUES (1,"admin","/user/*,/");
-- 角色表--
create table role(
		rid int(11) not null auto_increment,
		rname varchar(255) not null default "" comment "角色名称",
		primary key(rid)
)ENGINE = INNODB DEFAULT CHARSET=utf8;
insert into role VALUES (1,"Add");
insert into role VALUES (2,"Delete");
insert into role VALUES (3,"Update");
insert into role VALUES (4,"Query");
-- 权限角色关系表 --
CREATE TABLE permission_role (
  rid int(11) NOT NULL ,
  pid int(11) NOT NULL ,
  KEY idx_rid (rid),
  KEY idx_pid (pid)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;
insert into permission_role VALUES (1,1);
insert into permission_role VALUES (1,2);
insert into permission_role VALUES (1,3);
insert into permission_role VALUES (1,4);
-- 用户角色关系表 --
CREATE TABLE user_role (
  uid int(11) NOT NULL ,
  rid int(11) NOT NULL ,
  KEY idx_uid (uid),
  KEY idx_rid (rid)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;
INSERT into user_role VALUES (1,1);