<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>用户管理</title>
	<#include "commonHead.ftl" />
</head>
<body>
    <table id="userInfo" style="width:100%;height:auto" ></table>
    
	<!--对话框-->
	<div id="dlg" class="easyui-dialog" title="添加用户" style="width:400px;height:400px;padding:10px"
		data-options="
			closed:'true',
			modal:'true',
			iconCls:'icon-edit',
			buttons: '#dlg-buttons'
		">

		<form id="userForm" method="post">
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="loginName" style="width:100%" data-options="label:'登录账号:',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="password" style="width:100%" data-options="label:'密码:',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="userName" style="width:100%" data-options="label:'用户名:',required:true">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="department" style="width:100%;" data-options="label:'部门:'">
			</div>
			<div style="margin-bottom:20px">
				<input class="easyui-textbox" name="userRank" style="width:100%;" data-options="label:'等级:'">
			</div>
			<div style="margin-bottom:20px">
				<select class="easyui-combobox" name="userType"  data-options="label:'类型:'" style="width:100%">
					<option value="2">分析段</option>
					<option value="1">采集端</option>
					<option value="0">管理员</option>
				</select>
			</div>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="formSubmit()">Save</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="javascript:$('#dlg').dialog('close')">Close</a>
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
	        {field:'userRank',title:'等级',width:120,align:"center"},
	        {field:'userType',title:'类型',width:120,align:"center"},
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
		$.messager.confirm('警告','即将删除这条病历记录',function(b){
			if(b){ 
				var data={id:id};		    						
				var url = "${rootPath}${BasePath}/user/deleteUser.do";
				$.post(url,data,function(result){
				if(result.status>0){
					$.messager.show({title:'提示',msg:result.msg,timeout:2000});
					$('#caseInfo').datagrid('reload');
				}else{
					$.messager.show({title:'提示',msg:result.msg});
				}
				
				},'json');
			}
		});
	}
	
	function editUser(){
		$('#dlg').dialog({title: "编辑用户"});
		$('#dlg').dialog('open');
	}
	function viewRow(id){
		alert(id);
	}
	function addUser(){
		$('#dlg').dialog({title: "添加用户"});
		$('#dlg').dialog('open');
	}
	function formSubmit() {
	    $('#userForm').form('submit', 
			{
				url: '${rootPath}${BasePath}/user/addUserAction.do',
				onSubmit: function() {
					return $(this).form('enableValidation').form('validate');
				},
				success: function(result) {
					result = $.parseJSON(result);
					if(result.status>0){
						$.messager.show({title:'提示',msg:result.msg,timeout:2000});
						$('#userInfo').datagrid('reload');
					}else{
						$.messager.show({title:'提示',msg:result.msg});
					}
				}
			}
		);
	}
	
	function getSelected(){  
        var selected = $('#caseInfo').datagrid('getSelected');
        var id = "";
        if (selected){  
            id = selected.id;
        }else{
        	$.messager.show({title:'提示',msg:'没有选择行。'});
        }
        return id;
    }
</script>
</html>