### 如何启动

tomcat启动参数 VM arguments添加  `-Dspring.profiles.active` 

开发环境		`dev` 
线上环境		`prod` 

### 如何部署

打包 `mvn clean install -Dmaven.test.skip=true` 
