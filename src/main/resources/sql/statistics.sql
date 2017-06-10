#statistics 表

CREATE TABLE `statistics` (
  `id` varchar(64) NOT NULL COMMENT '主键ID',
  `user_id` varchar(64) NOT NULL COMMENT '用户ID',
  `data_id` varchar(64) NOT NULL COMMENT '心电/血压数据ID',
  `data_type` tinyint(1) DEFAULT '1' COMMENT '数据类型 1=心电，2=血压',
  `action` tinyint(1) DEFAULT '1' COMMENT '操作类型 1=采集上传，2=分析上传',
  `operation_time` datetime DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`id`),
  KEY `IDX_user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='统计表';