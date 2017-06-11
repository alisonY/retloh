#血压 表

CREATE TABLE `xueyadate` (
  `patient_id` varchar(64) NOT NULL DEFAULT '' COMMENT '患者id',
  `count` int(32) DEFAULT NULL COMMENT '次数',
  `start_date` datetime DEFAULT NULL COMMENT '开始时间',
  `day_start_time` datetime DEFAULT NULL COMMENT '白天开始时间',
  `day_interval` datetime DEFAULT NULL COMMENT '白天间隔',
  `night_start_time` datetime DEFAULT NULL COMMENT '晚上开始时间',
  `night_interval` datetime DEFAULT NULL COMMENT '晚上间隔时间',
  `total_count` int(32) DEFAULT NULL COMMENT '总测量次数',
  `error_count` int(32) DEFAULT NULL COMMENT '错误数据次数',
  `remark` varchar(64) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;