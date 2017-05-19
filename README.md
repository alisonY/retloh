### 如何启动
修改config.properties

tomcat启动参数 VM arguments添加  `-Dspring.profiles.active` 

开发环境		`dev` 
线上环境		`prod` 
举例	->	`-Dspring.profiles.active="dev"`

访问 	`http://127.0.0.1:8080/retloh/`

### 如何部署

打包 `mvn clean install -Dmaven.test.skip=true` 


### 测试表sql

```SQL
CREATE TABLE `muser` (
  `id` varchar(64) NOT NULL DEFAULT '',
  `name` varchar(128) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  `age` int(32) DEFAULT NULL,
  `plus_warehouse` varchar(40) DEFAULT NULL COMMENT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

