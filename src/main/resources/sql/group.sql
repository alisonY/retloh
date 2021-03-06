#group 表

CREATE TABLE `user_group` (
  `id` varchar(64) NOT NULL COMMENT '主键ID',
  `description` varchar(64) NOT NULL COMMENT '组描述ID',
  `operator_id` varchar(64) DEFAULT '1' COMMENT '操作人ID',
  `operator` varchar(128) DEFAULT '1' COMMENT '操作人名称',
  `uptate_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `is_deleted` int(4) DEFAULT '1' COMMENT '是否删除 0=未删除，1=删除',
  PRIMARY KEY (`id`),
  KEY `IDX_id` (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分组表';