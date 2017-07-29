<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <!--Head-->
    <head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>先锋众诚系统 - 登录页</title>
        <link rel="shortcut icon" href="${rootPath}${BasePath}/images/favicon.png" type="image/x-icon">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
        <meta content="yes" name="apple-mobile-web-app-capable">
        <meta content="black" name="apple-mobile-web-app-status-bar-style">
        <meta content="telephone=no" name="format-detection">
        <meta http-equiv="Cache-Control" content="no-transform ">
        <link rel="stylesheet" href="${rootPath}${BasePath}/css/login-nb.css?v=2016112910">
        <link rel="stylesheet" href="${rootPath}${BasePath}/css/base.css?v=2016112910">
        <script src="${rootPath}${BasePath}/js/jquery-3.2.0.min.js?v=2016112910"></script>
    </head>
<!--Head Ends-->
<!--Body-->
<body class="Sybg" style="height: 566px;width: 100%;overflow: hidden;">
<form id='loginForm' method="post"  action="login.do">
    <div class="Login">
        <img style="max-width:550px" src="${rootPath}${BasePath}/images/logo_text.png">
        <div class="entry">
            <input type="text" name="loginName" maxlength="20" placeholder="请输入您的用户名" class="ipt-name">
            <input type="password" name="password" style="border-bottom: none;" maxlength="20" placeholder="请输入密码" class="ipt-lock">
        </div>
        <a href="javascript:;" id="login-btn" class="login-btn">登录</a>
        <a href="${rootPath}${BasePath}/down/toPage.do" class="login-btn">报告查询</a>
        <span class="pro tips" style="display: none;"></span>
    </div>
</form>
<script>
    $(function(){
        codes = '';
        pageHeight();
        //设置page高度
        function pageHeight() {
            $('.Sybg').height($(window).height());
        }
        $(window).bind('resize',function(){
            pageHeight();
        });

    });

    $("#login-btn").click(function(){
        login();
    });
    function login() {
        if ($('.ipt-name').val() == '')
        {
            $('.tips').show();
            $('.tips').html('请输入用户名');
            return false;
        }
        if ($('.ipt-lock').val() == '')
        {

            $('.tips').show();
            $('.tips').html('请输入密码');
            return false;
        }
        $("#loginForm").submit();
    }
    document.onkeydown = function(e){
        var ev = document.all ? window.event : e;
        if(ev.keyCode==13) {
            //监控回车事件
            $("#login-btn").click();
        }
    };
</script>

</body>
<!--[if lte IE 6]>
<script src="https://s.xinstatic.com/xin/js/common/DD_belatedPNG.js"></script>
<![endif]-->
</html>