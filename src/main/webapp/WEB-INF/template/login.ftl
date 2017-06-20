<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
<meta charset="utf-8">
<title>登录</title>
<link href="${rootPath}${BasePath}/css/login.css" rel="stylesheet" type="text/css" media="all"/>
<script src="${rootPath}${BasePath}/js/jquery-3.2.0.min.js"></script>
</head>
<body>
<div id="login">
<h1>登录管理</h1>	
	<form id="loginForm" method="post"  action="login.do">
		<p><input type="text" name="loginName" id="loginName" value="用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '用户名';}"></p>
		<p><input type="password" name="password" id="password" value="********" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '********';}"></p>
		<p><input type="submit" id="submit" value="登陆" onclick= "$('form').submit();" ></p>
	</form>
</div>
<script>
document.onkeydown = function(e){
	var ev = document.all ? window.event : e;
	if(ev.keyCode==13) {
		$("form").click();
	}
};
</script>
</body>
</html>