#user 表

CREATE TABLE `t_user` (
  `id` varchar(64) NOT NULL DEFAULT '',
  `login_name` varchar(64) DEFAULT NULL COMMENT '登录账号',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `user_name` varchar(64) DEFAULT NULL COMMENT '用户名',
  `department` varchar(64) DEFAULT NULL COMMENT '部门',
  `user_rank` int(32) DEFAULT NULL COMMENT '等级',
  `user_type` int(32) DEFAULT NULL COMMENT '类型',
  `groupid`  int(32) DEFAULT NULL COMMENT '组',
  `group_desc`  varchar(64) DEFAULT NULL COMMENT '组描述',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `operator` varchar(64) DEFAULT NULL COMMENT '操作人',
  PRIMARY KEY (`id`),
  UNIQUE KEY `loginName` (`login_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;