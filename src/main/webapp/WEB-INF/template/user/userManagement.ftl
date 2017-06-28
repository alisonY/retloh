<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>用户管理</title>
	<#include "commonHead.ftl" />
</head>
<body style="padding: 0px 0px 0px 0px;">
    <table id="userInfo" style="width:100%;height:auto" ></table>
    
	<!--对话框-->
	<div id="dlg" class="easyui-dialog" title="添加用户" style="width:400px;height:440px;padding:10px"
		data-options="
			closed:'true',
			modal:'true',
			iconCls:'icon-edit',
			buttons: '#dlg-buttons'
		">

		<form id="userForm" method="post">
			<input type="hidden" id="userid" name="id" value="" />
			<div style="margin-bottom:20px">
				<input id="loginName" class="easyui-textbox" name="loginName" style="width:100%" data-options="label:'登录账号:',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="password" style="width:100%" data-options="label:'密码:',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="userName" style="width:100%" data-options="label:'用户名:',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="department" style="width:100%;" data-options="label:'部门:',required:true">
			</div>
			<div style="margin-bottom:20px">
	            <input id="groupIdSele" class="easyui-combobox" editable="false" name="groupId" style="width:100%;" data-options="
	            		url:'${rootPath}${BasePath}/user/allGroup.do',
	                    valueField: 'id',
	                    textField: 'text',
	                    label: '分组:',
	                    labelPosition: 'left',
	                    panelHeight:'auto'
	                    ">
			</div>
			<div style="margin-bottom:20px">
				<select id="selUserType" class="easyui-combobox" name="userType" editable="false" data-options="label:'类型:',panelHeight:'auto'" style="width:100%" editable="false">
					<option value="1">采集端</option>
					<option value="2">分析端</option>
					<option value="0">管理员</option>
				</select>
			</div>
			<div style="margin-bottom:20px">
				<select id="selUserRank" class="easyui-combobox" name="userRank"  data-options="label:'可登陆端:',panelHeight:'auto'" style="width:100%" editable="false">
					<option value="1">客户端</option>
					<option value="0">PC端</option>
					<option value="-1">PC&&客户端</option>
				</select>
			</div>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="formSubmit()">保存</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="javascript:$('#dlg').dialog('close')">取消</a>
	</div>
    
</body>
<script type="text/javascript">
	$(document).ready(function(){
	
	   var toolbar = [{
	        text:'添加',
	        iconCls:'icon-add',
	        handler:function(){
	        addUser();
	        }
	    },'-',{
	        text:'删除',
	        iconCls:'icon-remove',
	        handler:function(){
	        delUser();
	        }
	    },'-',{
	        text:'编辑',
	        iconCls:'icon-edit',
	        handler:function(){
	        editUser();
	        }
	    },'-',{
	        text:'查询',
	        iconCls:'icon-search',
	        handler:function(){
	        searchUser();
	        }
	    }];
		datagrid(toolbar);
	}); 



	function datagrid(toolbar){
		var urls = "${rootPath}${BasePath}/user/getInfo.do";
		$('#userInfo').datagrid({
			rownumbers:true,
			pagination:true,
			fitColumns:true,  
    		singleSelect: true, 
			pagePosition:'bottom',//bottom,top,both
			url:urls,
			toolbar:toolbar,
			columns:[[
  	        {field:'ck',checkbox:true},
	        {field:'id',title:'id',width:120,align:"center"},
	        {field:'loginName',title:'登录账号',width:120,align:"center"},
	        {field:'password',title:'密码',width:120,align:"center"},
	        {field:'userName',title:'用户名',width:120,align:"center"},
	        {field:'department',title:'部门',width:120,align:"center"},
	        {field:'userRank',title:'可登陆端',width:120,align:"center",
	        	formatter:function(val,rec){
	        		if (val==-1)
	        			{return 'PC&&客户端';}
	        		if (val==0)
	        			{return 'PC端';}
	        		if (val==1)
	        			{return '客户端';}
	        	}},
	        {field:'groupDesc',title:'组描述',width:120,align:"center"},
	        {field:'userType',title:'类型',width:120,align:"center",
	        	formatter:function(val,rec){
	        		if (val==0)
	        			{return '管理员';}
	        		if (val==1)
	        			{return '采集端';}
	        		if (val==2)
	        			{return '分析端';}
	        	}},
	        {field:'updateTime',title:'修改时间',width:120,align:"center"},
	        {field:'createTime',title:'创建时间',width:120,align:"center"},
	        {field:'operator',title:'操作人',width:120,align:"center"},
	        ]],
			onLoadSuccess:function(data){
				console.info("loadsuccss");
		    }
		});
	}
	
	function searchUser(){
		alert("adduser");
	}
	
	function delUser(){
		var id = getSelected();
		if(!id){
			return;
		}
		$.messager.confirm('警告','即将删除这条用户记录',function(b){
			if(b){ 
				var data={id:id};		    						
				var url = "${rootPath}${BasePath}/user/deleteUser.do";
				$.post(url,data,function(result){
				if(result.status>0){
					$.messager.show({title:'提示',msg:result.msg,timeout:2000});
					$('#userInfo').datagrid('reload');
				}else{
					$.messager.show({title:'提示',msg:result.msg});
				}
				
				},'json');
			}
		});
	}
	
	function editUser(){
		var id=getSelected();
		if(!id){
			return;
		}
		$("#dlg").form('clear');
		$('#dlg').dialog({title: "编辑用户"});
		$('#dlg').dialog('open');
		loadLocal(id)
	}
	function viewRow(id){
		alert(id);
	}
	function addUser(){
		$('#dlg').form('clear');
		$('#dlg').dialog({title: "添加用户"});
		$('#dlg').dialog('open');
		/*
		$('#selUserType').combobox('select', 1);
		$('#selUserRank').combobox('select', 1);
		*/
	}
	
	
	function formSubmit() {
		var url='${rootPath}${BasePath}/user/userInfoOpt.do';
	    $('#userForm').form('submit', 
			{
				url: url,
				onSubmit: function() {
					return $(this).form('enableValidation').form('validate');
				},
				success: function(result) {
					result = $.parseJSON(result);
					if(result.status>0){
						$.messager.show({title:'提示',msg:result.msg,timeout:2000});
						$('#userInfo').datagrid('reload');
						$('#dlg').dialog('close');
						$("#dlg").form('clear');
						$('#loginName').textbox('textbox').attr('readonly',false); 
					}else{
						$.messager.show({title:'提示',msg:result.msg});
					}
				}
			}
		);
	}
	
	function getSelected(){  
        var selected = $('#userInfo').datagrid('getSelected');
        var id = "";
        if (selected){  
            id = selected.id;
        }else{
        	$.messager.show({title:'提示',msg:'没有选择行。'});
        }
        return id;
    }
    
    function loadLocal(id){
    	console.info(id);
		var data={id:id};
		var url = "${rootPath}${BasePath}/user/getUserInfo.do";
		$.post(url,data,function(result){
			console.info(result);
					if(result.status){
						var jsonT = $.parseJSON(result.msg);
						
					        $('#dlg').form('load',{
					        	id:jsonT.id,
					            loginName:jsonT.loginName,
					            password:jsonT.password,
					            userName:jsonT.userName,
					            department:jsonT.department,
					        });
					        $('#loginName').textbox('textbox').attr('readonly',true); 
					        $('#selUserType').combobox('select', jsonT.userType);
							$('#selUserRank').combobox('select', jsonT.userRank);
							$('#groupIdSele').combobox('select', jsonT.groupId);
							
					}else{
						$.messager.show({title:'提示',msg:result.msg});
					}
		
		},'json');
     }
     
</script>
</html>