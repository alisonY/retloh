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
<form>
    <div class="Login">
        <img src="/images/contp-ai.png">
        <div class="entry">
            <input type="text" name="username" maxlength="20" placeholder="请输入您的用户名" class="ipt-name" onblur="needimgcode(this.value);">
            <input type="password" name="password" style="border-bottom: none;" maxlength="20" placeholder="请输入密码" class="ipt-lock">
        </div>
        <a href="javascript:;" class="login-btn">登录</a>
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

    $(".login-btn").click(function(){
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
        $.ajax({
            url : 'login.do', // 请求url
            type : "post", // 提交方式
            dataType : "json", // 数据类型
            data : $("form").serialize(),// 参数序列化
            beforeSend:function(){
                $(".login-btn").text('登录中...');
                $(".login-btn").attr("disabled", true);
            },
            success : function(data) { // 提交成功的回调函数
                $(".login-btn").removeAttr('disabled');
                // 成功删除后刷新页面
                if (data.status == 'n') {
                    /*$(".login-btn").text('登录');
                    if (data.info == 'code' || data.info == '验证码不正确！') {
                        codes = 'code';
                        $("#code").show();
                        $("#imgCheck").show();
                        if (data.info == '验证码不正确！') {
                            $('.tips').html(data.info);
                        } else {
                            data.info = '请输入验证码';
                        }

                    }
                    $("#imgCheck").click();
                    $('.tips').show();
                    $('.tips').html(data.info);*/
                } else {
                    $(".login-btn").text('跳转中...');
                    $('.tips').css('display', 'none');
                    window.location.href='/home/index/';
                }
            },
            error : function(){
                $(".login-btn").text('登录');
                $(".login-btn").removeAttr('disabled');
                $('.tips').show();
                $('.tips').html("服务器繁忙,请重试!");
            }
        });
    }
    document.onkeydown = function(e){
        var ev = document.all ? window.event : e;
        if(ev.keyCode==13) {
            //监控回车事件
            $(".login-btn").click();
        }
    };
</script>

</body>
<!--[if lte IE 6]>
<script src="https://s.xinstatic.com/xin/js/common/DD_belatedPNG.js"></script>
<![endif]-->
</html>