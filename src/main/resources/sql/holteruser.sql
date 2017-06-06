#FTPUserTable
#status： 
	0——未下载、
	1——已下载未回传、
	2——已回传(此时得验证pdfexport(报告文件不)不为空)
create table HolterUser 
(  
   id varchar(64) NOT NULL primary key,
   name varchar(64) not null,  
   password varchar(64),  
   homeDirectory varchar(128) not null,
   filePath varchar(128) default null,
   enabled boolean default true,  
   writePermission boolean default false,
   status int default 0,
   pdfexport varchar(128) default null,
   idletime int default 0,  
   uploadrate int default 0,  
   downloadrate int default 0,  
   maxloginnumber int default 0,  
   maxloginperip int default 0  
);  