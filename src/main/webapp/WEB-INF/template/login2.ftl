<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
<title>登陆</title>
<!-- Custom Theme files -->
<link href="${rootPath}${BasePath}/css/login_style.css" rel="stylesheet" type="text/css" media="all"/>
<script src="${rootPath}${BasePath}/js/jquery-3.2.0.min.js"></script>
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
</head>
<body>
<div class="login">
	<h2>登陆${ip !}</h2>
	<div class="login-top">
		<h1>${errorInfo !}</h1>
		<form id="loginForm" method="post"  action="login.do">
			<input type="text" name="loginName" value="用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '用户名';}">
			<input type="password" name="password" value="********" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '********';}">
	    </form>
	    <div class="forgot">
	    	<!--<a href="#">forgot Password</a>-->
	    	<input type="submit" value="登陆" onclick= "$('form').submit();" >
	    </div>
	</div>
	<div class="login-bottom">
	<!--<h3>New User &nbsp;<a href="#">Register</a>&nbsp Here</h3>-->
	</div>
</div>	
<div class="copyright">
	<p>Copyright &copy; 2017.Company name All rights reserved.<a target="_blank" href="#">&#x7F51;&#x9875;&#x6A21;&#x677F;</a> - More Templates <a href="#" target="_blank" title="COMPANY NAME HERE">COMPANY NAME HERE</a></p>
</div>
</body>
</html>