#通用表

CREATE TABLE `common` (
	`id` varchar(64) NOT NULL COMMENT '主键ID',
	`group_id` varchar(64) NOT NULL COMMENT '分组ID',
	`num` varchar(16) DEFAULT NULL COMMENT '编号(此次检查项目编号)',
	`pat_name` varchar(10) DEFAULT NULL COMMENT '患者姓名',
	`sex` varchar(5) DEFAULT NULL COMMENT '性别',
	`age` int(11) DEFAULT 0 COMMENT '年龄',
	`tell` varchar(15) DEFAULT NULL COMMENT '电话',
	`id_card` varchar(20) DEFAULT NULL COMMENT '身份证号码',
	`social_id` varchar(20) DEFAULT NULL COMMENT '社保号',
	`hs_name` varchar(64) DEFAULT NULL COMMENT '医院名称',
	`pat_no` varchar(20) DEFAULT NULL COMMENT '门诊号或住院号',
	`area_id` varchar(64) DEFAULT NULL COMMENT '区域编号或区域名称',
	`pg_type` varchar(20) DEFAULT NULL COMMENT '项目类型(心电或血压等)',
	`up_id` varchar(64) DEFAULT NULL COMMENT '上传用户编号(user表中关联)',
	`up_name` varchar(10) DEFAULT NULL COMMENT '上传大夫名称',
	`ana_id` varchar(30) DEFAULT NULL COMMENT '分析端编号',
	`ana_name` varchar(30) DEFAULT NULL COMMENT '分析大夫名称',
	`up_time` datetime DEFAULT NULL COMMENT '上传时间',
	`down_time` datetime DEFAULT NULL COMMENT '分析端下载时间',
	`net_flag` int(11)  DEFAULT NULL COMMENT '当前数据状态',
	`special` varchar(100) DEFAULT NULL COMMENT '病例特殊说明',
	`conclusion` varchar(100) DEFAULT NULL COMMENT '结论特点(标签特殊病例支持模糊查询)',
	`report_id` varchar(100) DEFAULT NULL COMMENT '报告文件编号或者文件名称',
	`analysed_file` varchar(100) DEFAULT NULL COMMENT '分析生成的文件id或路径',
	`create_time` datetime DEFAULT NULL COMMENT '数据添加时间',
	`update_time` datetime DEFAULT NULL COMMENT '数据修改时间',
	`status` int(11) DEFAULT '0' COMMENT '0=待上传数据包，1=已上传待分析，2=待分析下载中，3=已被下载，4=已被分析回传中，5=已回传报告',
	`info` varchar(2048) DEFAULT NULL COMMENT '其他所有相关信息#号隔开',
	`param0` varchar(64) DEFAULT NULL COMMENT '预留字段',
	`param1` varchar(64) DEFAULT NULL COMMENT '预留字段',
	`param2` varchar(64) DEFAULT NULL COMMENT '预留字段',
	`param3` varchar(64) DEFAULT NULL COMMENT '预留字段',
	`param4` varchar(64) DEFAULT NULL COMMENT '预留字段',
	`param5` varchar(64) DEFAULT NULL COMMENT '预留字段',
	`param6` varchar(64) DEFAULT NULL COMMENT '预留字段',
	`param7` varchar(64) DEFAULT NULL COMMENT '预留字段',
	`param8` varchar(64) DEFAULT NULL COMMENT '预留字段',
	`param9` varchar(64) DEFAULT NULL COMMENT '预留字段',
	PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
