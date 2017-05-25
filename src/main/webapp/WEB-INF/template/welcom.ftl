<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
	<title>xxxftl tasdasdasest pagesdsd!</title>  
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
	asdfdf
	<#include "/template/commonHead.ftl">
	asd
</head>  
	<body>  
	Hello ${name}   C
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
	<a href="${rootPath}${BasePath}/auth/logout.do">logout</a>

	
        <h2>Nested Panel</h2>
        <p>The panel can be placed inside containers and can contain other components.</p>
        <div style="margin:20px 0 10px 0;"></div>
        <div class="easyui-panel" title="Nested Panel" style="width:700px;height:200px;padding:10px;">
            <div class="easyui-layout" data-options="fit:true">
                <div data-options="region:'west',split:true" style="width:100px;padding:10px">
                    Left Content
                </div>
                <div data-options="region:'east'" style="width:100px;padding:10px">
                    Right Content
                </div>
                <div data-options="region:'center'" style="padding:10px">
                    Center Content
                </div>
            </div>
        </div>
						
	</body>  
</html> 