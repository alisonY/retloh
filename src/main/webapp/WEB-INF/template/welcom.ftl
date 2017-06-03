<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
	<title>系统首页</title>  
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
	<#include "commonHead.ftl" />
</head>  
	<body>  
    <div class="easyui-layout" style="width:100%;height:700px;">
        <div data-options="region:'north'" style="height:80px">
        	<div><img src="${rootPath}${BasePath}/images/logo_01.jpg" /></div>
        </div>
        
        <div data-options="region:'center'"  style="padding:5px">
            <div class="easyui-layout" data-options="fit:true">
                <div data-options="region:'north',split:true" title="菜单" style="height:70px">
					<div class="easyui-panel" data-options="fit:true" style="padding:5px;">
					
						<a href="javascript:void(0);" class="easyui-linkbutton"  data-options="iconCls:'icon-edit'" onclick="javascript:addPanel('用户管理','${rootPath}${BasePath}/user/toPage.do');">
		                    	用户管理
		                </a>
		                
						<a href="javascript:void(0);" class="easyui-linkbutton"  data-options="iconCls:'icon-edit'" onclick="javascript:addPanel('病例信息','${rootPath}${BasePath}/case/toPage.do');">
		                    	病例信息
		                </a>
					</div>
               </div>
                <div data-options="region:'center'">
            		<div id="tabs" class="easyui-tabs"  fit="true" border="false" >
					</div>
                </div>
            </div>
        </div>
        
        <div data-options="region:'south',split:true" style="height:50px;">
        	Copyright&copy;  2017，北京先锋众城医疗设备有限公司
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