<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>分组信息</title>
	<#include "commonHead.ftl" />
</head>
<body style="padding: 0px 0px 0px 0px;">
    <table id="groupInfo" style="width:100%;height:auto" > </table>
	<!--对话框-->
	<div id="tb" style="padding:2px 5px;">
        <a href="#" class="easyui-linkbutton" iconCls="icon-man" onclick="viewRow()" >详情</a>
		<!--分隔符--><span class="datagrid-btn-separator" style="vertical-align: middle;display:inline-block;float:none"></span>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="delRow()" >删除</a>
		<!--分隔符--><span class="datagrid-btn-separator" style="vertical-align: middle;display:inline-block;float:none"></span>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="editRow()" >编辑</a>
    </div>
</body>
<script type="text/javascript">
	$(document).ready(function(){
		datagrid();
	}); 

	function datagrid(){
		/group/toPage.do
		var urls = "${rootPath}${BasePath}/group/getInfo.do";
		$('#groupInfo').datagrid({
			rownumbers:true,
			pagination:true,
			fitColumns:true,
			toolbar:"#tb",
    		singleSelect: true, 
			pagePosition:'bottom',//bottom,top,both
			url:urls,
			columns:[[
			{field:'ck',checkbox:true},
	        {field:'id',title:'id',width:120,align:"center"},
	        {field:'desc',title:'姓名',width:120,align:"center"},
	        {field:'operatorId',title:'编号',width:120,align:"center"},
	        {field:'operator',title:'性别',width:120,align:"center"},
	        {field:'uptateTime',title:'年龄',width:120,align:"center"},
	        {field:'createTime',title:'身份证号',width:150,align:"center"}
	        ]],
			onLoadSuccess:function(data){
		        //调整表格宽高
		        $('#groupInfo').datagrid('resize', {
					width:function(){return document.body.clientWidth;},
					height:function(){return document.body.clientHeight;},
				});
		    } 
		});
	}
	function delRow(){
		var id = getSelected();
		if(!id){
			return;
		}
		$.messager.confirm('警告','即将删除这条病历记录',function(b){
			if(b){ 
				var data={id:id};		    						
				var url = "${rootPath}${BasePath}/case/delInfo.do";
				$.post(url,data,function(result){
				if(result.status>0){
					$.messager.show({title:'提示',msg:result.msg,timeout:2000});
					$('#groupInfo').datagrid('reload');
				}else{
					$.messager.show({title:'提示',msg:result.msg});
				}
				
				},'json');
			}
		});
	}
	function viewRow(){
		loadData("病例查看","view");
	}
	
	
	function editRow(id){
		loadData("病例编辑","edit");
	}
	
	function formSubmit(){
	    $('#caseForm').form('submit', 
			{
				url: "${rootPath}${BasePath}/case/editInfo.do",
				onSubmit: function() {
					return $(this).form('enableValidation').form('validate');
				},
				success: function(result) {
					result = $.parseJSON(result);
					if(result.status>0){
						$.messager.show({title:'提示',msg:result.msg,timeout:2000});
						$('#dlg').dialog('close');
						$('#groupInfo').datagrid('reload');
					}else{
						$.messager.show({title:'提示',msg:result.msg});
					}
				}
			}
		);
	}
	
	
	function loadData(title,type){
		var id = getSelected();
		if(!id){
			return;
		}
		$('#infoLayout').layout();
		$('#dlg').dialog({title: title});
		$('#dlg').dialog('open');
		$("#caseForm").form('clear');
		if(type == "edit"){
			//设置保存按钮不可编辑
			$("#saveBtn").linkbutton("enable");
		}
		if(type == "view"){
			$("#saveBtn").linkbutton("disable");
		}
		var data={id:id};		    						
		var url = "${rootPath}${BasePath}/case/viewInfo.do";
		$.post(url,data,function(result){
			if(result.status){
				$('#caseForm').form('load', result.msg);
			}else{
				$.messager.show({title:'提示',msg:result.msg});
			}
		},'json');		
	}
	
	function getSelected(){  
        var selected = $('#groupInfo').datagrid('getSelected');
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