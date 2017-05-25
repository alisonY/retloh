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

create table CaseInfo 
(  
   daolianshu int default 0,  
   sum_hours int default 0,  
   pacemaker_parameter int default 0,  
   offset int default 0,
   record_minutes int default 0,
   record_mounth int default 0,
   record_day int default 0,
   record_year int default 0,  
   name varchar(20) default null,  
   hospital_number int default 0,  
   serial_number int default 0,  
   sex varchar(10) default null,
   operation_doctor varchar(20) default null,
   diagnostic_doctor varchar(20) default null,
   age int default 0,
   clinic_number int default 0,
   bed_number int default 0,
   department varchar(50) default null,
   yongyaoshuoming varchar(150) default null,
   conclusion varchar(150) default null,
   hospital_name varchar(150) default null,
   default_hospital_name varchar(150) default null,
   hospital_address varchar(150) default null,
   hospital_phonenum int default 0,
   hospital_fax int default 0,
   patient_year int default 0,
   patient_month int default 0,
   patient_day int default 0,
   suggest varchar(200) default null,
   note varchar(200) default null,
   case_tag varchar(150) default null,
   holter_load_date int default 0,
   handwritten_conclusion varchar(200) default null
);  