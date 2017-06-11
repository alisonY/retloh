#血压 info表

CREATE TABLE `xueyainfo` (
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
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;