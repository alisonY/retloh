#血压 病人信息表

CREATE TABLE `blood_pressure_info` (
`id` varchar(64) NOT NULL COMMENT '主键ID业务无关',
  `patient_id` varchar(64) NOT NULL DEFAULT '' COMMENT '患者id',
  `sur_name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `first_name` varchar(20) DEFAULT NULL COMMENT '姓',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `weight` int(32) DEFAULT NULL COMMENT '体重',
  `height` int(32) DEFAULT NULL COMMENT '身高',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `bed_no` varchar(20) DEFAULT NULL COMMENT '床号',
  `boom_no` varchar(20) DEFAULT NULL COMMENT '房间号',
  `section_office` varchar(40) DEFAULT NULL COMMENT '科室',
  `doctor_name` varchar(30) DEFAULT NULL COMMENT '医生姓名',
  `code` varchar(20) DEFAULT NULL COMMENT '编号',
  `telephpne` varchar(15) DEFAULT NULL COMMENT '电话',
  `address` varchar(64) DEFAULT NULL COMMENT '地址',
  `country` varchar(64) DEFAULT NULL COMMENT '国籍',
  `id_card` varchar(30) DEFAULT NULL COMMENT 'idcard',
  `social_num` varchar(30) DEFAULT NULL COMMENT '社保号',
  `reserve1` varchar(30) DEFAULT NULL COMMENT '保留字段1',
  `reserve2` varchar(30) DEFAULT NULL COMMENT '保留字段2',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#血压 测量区间表

CREATE TABLE `blood_pressure_interval` (
`id` varchar(64) NOT NULL COMMENT '主键ID业务无关',
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
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


#血压 表
CREATE TABLE `blood_pressure_data` (
`id` varchar(64) NOT NULL COMMENT '主键ID业务无关',
  `patient_id` varchar(64) NOT NULL DEFAULT '' COMMENT '患者id',
  `count` int(32) DEFAULT NULL COMMENT '次数',
  `systole` int(32) DEFAULT NULL COMMENT '收缩压',
  `diastole` int(32) DEFAULT NULL COMMENT '舒张压',
  `hr` int(32) DEFAULT NULL COMMENT '心率',
  `data_no` int(32) DEFAULT NULL COMMENT '24小时中第几次测量',
  `caiji_date` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;