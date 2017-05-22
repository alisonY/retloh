#FTPUserTable
create table HolterUser 
(  
   name varchar(64) not null primary key,  
   password varchar(64),  
   homeDirectory varchar(128) not null,  
   enabled boolean default true,  
   writePermission boolean default false,
   idletime int default 0,  
   uploadrate int default 0,  
   downloadrate int default 0,  
   maxloginnumber int default 0,  
   maxloginperip int default 0  
);  