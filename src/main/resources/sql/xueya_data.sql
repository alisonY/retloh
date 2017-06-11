#血压 表

CREATE TABLE `xueyadata` (
  `patient_id` varchar(64) NOT NULL DEFAULT '' COMMENT '患者id',
  `count` int(32) DEFAULT NULL COMMENT '次数',
  `systole` int(32) DEFAULT NULL COMMENT '收缩压',
  `diastole` int(32) DEFAULT NULL COMMENT '舒张压',
  `hr` int(32) DEFAULT NULL COMMENT '心率',
  `data_no` int(32) DEFAULT NULL COMMENT '24小时中第几次测量',
  `caiji_date` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`patient_id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;