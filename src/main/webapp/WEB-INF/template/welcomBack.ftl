<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
	<title>系统首页</title>  
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
	<#include "commonHead.ftl" />
</head>  
	<body>  
		<!--测试顶部留空-->
		<!--
			<div style="margin:20px 0;"></div>
    	-->
    	<div class="easyui-layout" style="width:100%;height:760px;">
		    <div data-options="region:'north'" border="true" style="height:80px;">
					<div><img src="${rootPath}${BasePath}/images/logo_01.jpg" /></div>
			</div>
	        <div id="menu" split="true"  data-options="region:'west'" title="导航菜单" style="width:10%;padding:0px">
	        	<ul class="easyui-tree" data-options="animate:true">
			        <li>
		                <span>主菜单</span>
		                <ul>
		                    <li data-options="state:'closed'">
		                        <span>展开demo</span>
		                        <ul>
		                            <li>
		                                <span>测试1</span>
		                            </li>
		                            <li>
		                                <span>测试2</span>
		                            </li>
		                        </ul>
		                    </li>
		                    <li>
		                    	<a href="javascript:void(0);" 
		                    		onclick="javascript:addPanel('病例信息','${rootPath}${BasePath}/case/toPage.do');">
		                    		病例信息
		                    	</a>
		                    </li>
		                    <li>
		                    	<a href="javascript:void(0);" 
		                    		onclick="javascript:addPanel('测试','${rootPath}${BasePath}/muser/listUser.do');">
		                    		添加tab\
		                    	</a>
		                    </li>
		                    
		                    
		                    <li><a href="javascript:void(0);" onclick="javascript:addPanel('测试','${rootPath}${BasePath}/muser/listUser.do');">添加tab</a></li>
		                    <li><a href="${rootPath}${BasePath}/main/idiot.do">测试ajax</a></li>
		                    <li><a href="${rootPath}${BasePath}/muser/getJson.do">测试json</a></li>
		                    <li><a href="${rootPath}${BasePath}/muser/listUser.do">测试表</a></li>
		                    <li><a href="${rootPath}${BasePath}/auth/logout.do">退出登录</a></li>
		                </ul>
		            </li>
	        	</ul>
	        </div>
	        <div id="mainPanel" data-options="region:'center'" style="padding:0px">
	        	<div id="tabs" class="easyui-tabs"  fit="true" border="false" >
				</div>
	        </div>
	        <div data-options="region:'south'" border="false">Copyright&copy;  2017，xxxxxxxxxx有限公司</div>
        </div>
    </div>
	</body>

<script type="text/javascript">
	$(document).ready(function(){
		center();
	}); 

    function center(){
        $.messager.show({
            title:'测试通知窗',
            msg:'welcom.ftl中有树形demo,树形中的'+"'"+'添加tab'+"'"+'用来给右侧框中添加一个新的tab',
            showType:'fade',
            style:{
                right:'',
                bottom:''
            }
        });
    }

	//添加窗体
    function addPanel(title, url){
    	if ($('#tabs').tabs('exists', title)){
			$('#tabs').tabs('select', title);//选中并刷新
			var currTab = $('#tabs').tabs('getSelected');
		} else {
			var content = createFrame(url);
			$('#tabs').tabs('add',{
				title:title,
				content:content,
				closable:true
			});
		}
    }
    function createFrame(url) {
		var s = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
		return s;
	}
</script>	
	
</html> 