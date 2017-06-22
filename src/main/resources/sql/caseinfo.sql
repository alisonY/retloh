#caseinfo 病例库
导联数
记录小时数
起搏器参数
文件偏移量
分
月
日
年
姓名
住院号
编号
性别
操作医生
诊断医生
年龄
门诊号
床号
科室
用药说明
结论
医院名称
默认医院名
医院地址
医院电话
医院传真
患者年
患者月
患者日
建议
注意
病例库标记语
HolterLoadDate 回放时间
7行医生手写结论

CREATE TABLE `caseinfo` (
  `id` varchar(64) NOT NULL COMMENT '主键ID',
  `group_id` varchar(64) NOT NULL COMMENT '分组ID',
  `serial_number` varchar(20) DEFAULT '0' COMMENT '序列号*',
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `citizen_number` varchar(20) DEFAULT NULL COMMENT '身份证号',
  `age` int(11) DEFAULT '0' COMMENT '年龄',
  `sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `clinic_number` varchar(20) DEFAULT '0' COMMENT '门诊号',
  `bed_number` varchar(20) DEFAULT '0' COMMENT '床位号',
  `record_year` int(11) DEFAULT '0' COMMENT '记录年',
  `record_mounth` int(11) DEFAULT '0' COMMENT '记录月',
  `record_day` int(11) DEFAULT '0' COMMENT '记录日',
  `record_minutes` int(11) DEFAULT '0' COMMENT '记录分',
  `operation_doctor` varchar(20) DEFAULT NULL COMMENT '操作医生',
  `diagnostic_doctor` varchar(20) DEFAULT NULL COMMENT '诊断医生',
  `status` int(11) DEFAULT '0' COMMENT '0=待上传数据包，1=已上传待分析，2=待分析下载中，3=已被下载，4=已被分析回传中，5=已回传报告',
  `department` varchar(50) DEFAULT NULL COMMENT '部门',
  `hospital_number` varchar(20) DEFAULT '0' COMMENT '医院号',
  `hospital_name` varchar(150) DEFAULT NULL COMMENT '医院名称',
  `default_hospital_name` varchar(150) DEFAULT NULL COMMENT '默认医院名称',
  `hospital_address` varchar(150) DEFAULT NULL COMMENT '医院地址',
  `hospital_phonenum` varchar(20) DEFAULT '0' COMMENT '医院电话',
  `hospital_fax` varchar(20) DEFAULT '0' COMMENT '医院传真',
  `patient_year` int(11) DEFAULT '0' COMMENT '患者年',
  `patient_month` int(11) DEFAULT '0' COMMENT '患者月',
  `patient_day` int(11) DEFAULT '0' COMMENT '患者日',
  `daolianshu` int(11) DEFAULT '0' COMMENT '导联数',
  `sum_hours` int(11) DEFAULT '0' COMMENT '记录小时数',
  `pacemaker_parameter` varchar(20) DEFAULT '0' COMMENT '起搏器参数',
  `offset` int(11) DEFAULT '0' COMMENT '文件偏移量',
  `suggest` varchar(200) DEFAULT NULL COMMENT '建议',
  `conclusion` varchar(150) DEFAULT NULL COMMENT '结论',
  `yongyaoshuoming` varchar(150) DEFAULT NULL COMMENT '用药说明',
  `note` varchar(200) DEFAULT NULL COMMENT '注意',
  `case_tag` varchar(150) DEFAULT NULL COMMENT '病例库标记语',
  `holter_load_date` datetime DEFAULT NULL COMMENT '回放时间',
  `create_time` datetime DEFAULT NULL COMMENT '数据添加时间',
  `update_time` datetime DEFAULT NULL COMMENT '数据修改时间',
  `handwritten_conclusion` varchar(200) DEFAULT NULL COMMENT '医生手写结论',
  `pdfexport_filePath` varchar(128) DEFAULT NULL COMMENT 'pdf路径',
  `original_filePath` varchar(128) DEFAULT NULL COMMENT '数据包路径',
  `analyzed_filePath` varchar(128) DEFAULT NULL COMMENT '分析后路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;