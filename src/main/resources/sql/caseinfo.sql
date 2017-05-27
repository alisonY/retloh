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

CREATE TABLE CaseInfo (
  id  varchar(64) NOT NULL,
	name VARCHAR (20) NOT NULL,
	daolianshu INT DEFAULT 0,
	sum_hours INT DEFAULT 0,
	pacemaker_parameter INT DEFAULT 0,
	offset INT DEFAULT 0,
	record_minutes INT DEFAULT 0,
	record_mounth INT DEFAULT 0,
	record_day INT DEFAULT 0,
	record_year INT DEFAULT 0,
	hospital_number INT DEFAULT 0,
	serial_number INT DEFAULT 0,
	sex VARCHAR (10) DEFAULT NULL,
	operation_doctor VARCHAR (20) DEFAULT NULL,
	diagnostic_doctor VARCHAR (20) DEFAULT NULL,
	age INT DEFAULT 0,
	clinic_number INT DEFAULT 0,
	bed_number INT DEFAULT 0,
	department VARCHAR (50) DEFAULT NULL,
	yongyaoshuoming VARCHAR (150) DEFAULT NULL,
	conclusion VARCHAR (150) DEFAULT NULL,
	hospital_name VARCHAR (150) DEFAULT NULL,
	default_hospital_name VARCHAR (150) DEFAULT NULL,
	hospital_address VARCHAR (150) DEFAULT NULL,
	hospital_phonenum INT DEFAULT 0,
	hospital_fax INT DEFAULT 0,
	patient_year INT DEFAULT 0,
	patient_month INT DEFAULT 0,
	patient_day INT DEFAULT 0,
	suggest VARCHAR (200) DEFAULT NULL,
	note VARCHAR (200) DEFAULT NULL,
	case_tag VARCHAR (150) DEFAULT NULL,
	holter_load_date INT DEFAULT 0,
	handwritten_conclusion VARCHAR (200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
);

