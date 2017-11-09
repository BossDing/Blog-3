--�û���--
create table USER(
		uid int(11) not null auto_increment,
		username varchar(100) not null default "" comment "�û���",
		password varchar(100) not null default "" comment "����",
		avatar varchar(255) comment "ͷ���ַ",	
		descriprion varchar(255) comment "����",
		follow int comment "��ע����",
		followed int comment "���˹�ע",
		phone varchar(20) comment "�绰",
		address varchar(200) comment "סַ",
		create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '����ʱ��',
		update_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '����ʱ��',
		primary key(uid)
)ENGINE = INNODB DEFAULT CHARSET=utf8;
--Ȩ�ޱ�--
create table permission(
		pid int(11) not null auto_increment,
		name varchar(255) not null default "" comment "Ȩ������",
		url varchar(255) default "" comment "���ص�URL",
		create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '����ʱ��',
		update_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '����ʱ��',
		primary key(pid)
)ENGINE = INNODB DEFAULT CHARSET=utf8;
--��ɫ��--
create table role(
		rid int(11) not null auto_increment,
		rname varchar(255) not null default "" comment "��ɫ����",
		create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '����ʱ��',
		update_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '����ʱ��',
		primary key(rid)
)ENGINE = INNODB DEFAULT CHARSET=utf8;
-- Ȩ�޽�ɫ��ϵ�� --
CREATE TABLE permission_role (
  rid int(11) NOT NULL ,
  pid int(11) NOT NULL ,
  KEY idx_rid (rid),
  KEY idx_pid (pid)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;
-- �û���ɫ��ϵ�� --
CREATE TABLE user_role (
  uid int(11) NOT NULL ,
  rid int(11) NOT NULL ,
  KEY idx_uid (uid),
  KEY idx_rid (rid)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;