#文件完整性校验表

CREATE TABLE `verification` (
  `id` int NOT NULL auto_increment COMMENT '主键ID',
  `commonid` varchar(64) NOT NULL COMMENT '病例id',
  `filename` varchar(64) NOT NULL COMMENT '文件名',
  `md5sum` varchar(33) NOT NULL COMMENT '文件md5值',
  PRIMARY KEY (`id`),
  KEY `IDX_id` (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文件完整性校验表';