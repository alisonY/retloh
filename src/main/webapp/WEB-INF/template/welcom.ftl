<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
	<title>xxxftl tasdasdasest pagesdsd!</title>  
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
	<#include "commonHead.ftl" />
</head>  
	<body>  
		<div style="margin:20px 0;"><!--测试顶部留空--></div>
    	<div class="easyui-layout" style="width:100%;height:500px;">
		    <div data-options="region:'north'" border="true">
					<div>logo is here___logo is here___logo is here___</div>
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
		                                <span>爹</span>
		                            </li>
		                            <li>
		                                <span>娘</span>
		                            </li>
		                            <li>
		                                <span>老婆</span>
		                            </li>
		                            <li>
		                                <span>娃</span>
		                            </li>
		                        </ul>
		                    </li>
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
	        
	        
	        		帮助IS here
	        		</BR>
	                Hello ${name}
					</BR>
					rootPath is ${rootPath}
					</BR>
					BasePath is ${BasePath}
					</BR>
					<img src = ${rootPath}${BasePath}/images/guidance.jpg />
					</BR>
					<a href="${rootPath}${BasePath}/muser/listUser.do">User List</a>
					</BR>
					<a href="${rootPath}${BasePath}/muser/getJson.do">Json List</a>
					</BR>
					<a href="${rootPath}${BasePath}/idiot.do">idiot</a>
					</BR>
					</BR>
					

					
	        </div>
	        <div data-options="region:'south'" border="false">Copyright&copy;  2017，xxxxxxxxxx有限公司</div>
        </div>
    </div>
	</body>  
</html> 