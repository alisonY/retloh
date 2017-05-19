<<<<<<< HEAD
#FTP用户信息表  
create table HolterUser 
(  
   userid varchar(64) not null primary key,  
   userpassword varchar(64),  
   homedirectory varchar(128) not null,  
   enableflag boolean default true,  
   writepermission boolean default false,  
=======
#FTPUserTable
create table HolterUser 
(  
   name varchar(64) not null primary key,  
   password varchar(64),  
   homeDirectory varchar(128) not null,  
   enabled boolean default true,  
   writePermission boolean default false,  
>>>>>>> e5ed094e326dc7784ca527071b5c049a4eb23602
   idletime int default 0,  
   uploadrate int default 0,  
   downloadrate int default 0,  
   maxloginnumber int default 0,  
   maxloginperip int default 0  
);  