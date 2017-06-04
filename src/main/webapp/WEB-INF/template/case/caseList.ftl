<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>病例信息</title>
	<#include "commonHead.ftl" />
</head>
<body>
    <table id="caseInfo" style="width:100%;height:auto" > </table>
	<!--对话框-->
	<div id="dlg" class="easyui-dialog" title="病例信息" style="width:800px;height:600px;padding:10px"
		data-options="
			closed:'true',
			modal:'true',
			iconCls:'icon-edit',
			buttons: '#dlg-buttons'
		">

		<form id="userForm" method="post">
			    <div id="infoLayout" style="width:770px;height:500px;">
			        <div data-options="region:'north'" style="height:50px">
			        </div>
			        <div data-options="region:'south'" style="height:50px;">
			        </div>
			        <div data-options="region:'west'" style="width:385px;">
			        </div>
			        <div data-options="region:'center'" style="padding:20px">
			        </div>
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
	        text:'删除',
	        iconCls:'icon-remove',
	        handler:function(){
	        delRow();
	        }
	    },'-',{
	        text:'详情',
	        iconCls:'icon-man',
	        handler:function(){
	        viewRow();
	        }
	    },'-',{
	        text:'编辑',
	        iconCls:'icon-edit',
	        handler:function(){
	        editRow();
	        }
	    },'-',{
	        text:'查询',
	        iconCls:'icon-search',
	        handler:function(){
	        getSelected();
	        }
	    }];
	
		datagrid(toolbar);
	}); 

	function datagrid(toolbar){
		var urls = "${rootPath}${BasePath}/case/getInfo.do";
		$('#caseInfo').datagrid({
			rownumbers:true,
			pagination:true,
			fitColumns:true,
			toolbar:toolbar,
    		singleSelect: true, 
			pagePosition:'bottom',//bottom,top,both
			url:urls,
			columns:[[
			{field:'ck',checkbox:true},
	        {field:'id',title:'id',width:120,align:"center"},
	        {field:'name',title:'姓名',width:120,align:"center"},
	        {field:'operationDoctor',title:'操作医生',width:120,align:"center"},
	        {field:'diagnosticDoctor',title:'诊断医生',width:120,align:"center"},
	        {field:'serialNumber',title:'编号',width:120,align:"center"},
	        {field:'holterLoadDate',title:'回放时间',width:120,align:"center"},
	        {field:'sex',title:'性别',width:120,align:"center"},
	        {field:'age',title:'年龄',width:120,align:"center"},
	        {field:'serialNumber',title:'身份证号',width:120,align:"center"}
	        ]],
			onLoadSuccess:function(data){
		        //调整表格宽高
		        $('#caseInfo').datagrid('resize', {
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
					$('#caseInfo').datagrid('reload');
				}else{
					$.messager.show({title:'提示',msg:result.msg});
				}
				
				},'json');
			}
		});
	}
	
	function editRow(id){
		alert(id);
	}
	function viewRow(){
		var id = getSelected();
		if(!id){
			return;
		}
		$('#infoLayout').layout();
		$('#dlg').dialog({title: "查看病例"});
		$('#dlg').dialog('open');
		
		alert(id);
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