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
        <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="addGroup()" >添加</a>
		<!--分隔符--><span class="datagrid-btn-separator" style="vertical-align: middle;display:inline-block;float:none"></span>
		        <a href="#" class="easyui-linkbutton" iconCls="icon-save" onclick="saveGroup()" >保存</a>
		<!--分隔符--><span class="datagrid-btn-separator" style="vertical-align: middle;display:inline-block;float:none"></span>
        <a href="#" class="easyui-linkbutton" iconCls="icon-redo" onclick="redoGroup()" >取消</a>
		<!--分隔符--><span class="datagrid-btn-separator" style="vertical-align: middle;display:inline-block;float:none"></span>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="delGroup()" >删除</a>
    </div>
</body>
<script type="text/javascript">
	$(document).ready(function(){
		datagrid();
	}); 
	var editRow = undefined;//编辑的行

	function datagrid(){
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
	        {field:'description',title:'描述',width:120,align:"center",editor:"textbox"},
	        {field:'operatorId',title:'操作人ID',width:120,align:"center"},
	        {field:'operator',title:'操作人',width:120,align:"center"},
	        {field:'uptateTime',title:'修改时间',width:120,align:"center"},
	        {field:'createTime',title:'添加时间',width:150,align:"center"}
	        ]],
			onLoadSuccess:function(data){
		        //调整表格宽高
		        $('#groupInfo').datagrid('resize', {
					width:function(){return document.body.clientWidth;},
					height:function(){return document.body.clientHeight;},
				});
		    },
		    onAfterEdit:function(rowIndex, rowData, changes){//行索引，数据，原先的改变的数据
			/*
			var inserted = $('#groupInfo').datagrid('getChanges','inserted');//要么空 要么是行对象
			var updated = $('#groupInfo').datagrid('getChanges','updated');
			if(inserted.length > 0){
				//添加方法
				console.info("ADD");
			}
			if(updated.length > 0){
				//更新方法
				console.info("UPDATE");
			}
			*/
			
			var description = rowData.description;
			var id = rowData.id;
			var data={id:id,dec:description};
			var urlx = "${rootPath}${BasePath}/group/groupOpt.do";
			if(description.length>40){
				msgShow("描述长度控制在40字以内");
				$('#groupInfo').datagrid('rejectChanges');
				return false;
			}
			$.post(urlx,data,function(result){
				if(result.status>0){
					$.messager.show({title:'提示',msg:result.msg,timeout:2000});
					$('#groupInfo').datagrid('reload');
				}else{
					$.messager.show({title:'提示',msg:result.msg});
				}
				editRow=undefined;
				},'json');
			
			
			},onDblClickRow:function(rowIndex,rowData){//行的索引，行的数据
				if(editRow != undefined){
					$.messager.show({title:'提示',msg:'先 取消 或 保存 。'});
					//$('#groupInfo').datagrid('endEdit',editRow);
				}
				if(editRow == undefined){
					$('#groupInfo').datagrid('beginEdit',rowIndex);
					editRow = rowIndex;
				}
			}
		});
	}
	
	function delGroup(){
		var id = getSelected();
		if(!id){
			return;
		}
		console.info(id);
		$.messager.confirm('警告','即将删除这条病历记录',function(b){
			if(b){ 
				var data={id:id};		    						
				var url = "${rootPath}${BasePath}/group/delGroup.do";
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
	//保存
	function saveGroup(){
		$('#groupInfo').datagrid('endEdit',editRow);
	}
	
	//取消
	function redoGroup(){
		editRow=undefined;
		$('#groupInfo').datagrid('rejectChanges');
		$('#groupInfo').datagrid('unselectAll');
	}
	
	//添加
	function addGroup(){
		redoGroup();
		$('#groupInfo').datagrid('insertRow',
			{//插入第一行
			index:0,
			row:{}
			});
		$('#groupInfo').datagrid('beginEdit',0);
		editRow = 0;//记录索引
		$(".validatebox-text").removeClass("validatebox-invalid");//删除验证提示  
	}
	
	//保存
	function saveGroup(){
		$('#groupInfo').datagrid('endEdit',editRow);
	}
	
	//取消
	function redoGroup(){
		editRow=undefined;
		$('#groupInfo').datagrid('rejectChanges');
		$('#groupInfo').datagrid('unselectAll');
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