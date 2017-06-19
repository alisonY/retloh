<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>项目信息</title>
	<#include "commonHead.ftl" />
</head>
<body>
    <table id="common" style="width:100%;height:auto" > </table>
	<!--对话框-->
	<div id="dlg" class="easyui-dialog" title="项目信息" style="width:800px;height:600px;padding:10px"
		data-options="
			closed:'true',
			modal:'true',
			iconCls:'icon-edit',
			buttons: '#dlg-buttons'
		">

		<form id="caseForm" method="post">
			    <div id="infoLayout" style="width:770px;height:500px;">
			    </div>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:void(0)" id="saveBtn" class="easyui-linkbutton" onclick="formSubmit()">保存</a>
		<a href="javascript:void(0)" id="editBtn" class="easyui-linkbutton" onclick="javascript:$('#dlg').dialog('close')">关闭</a>
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
		var urls = "${rootPath}${BasePath}/common/getInfo.do";
		$('#common').datagrid({
			rownumbers:true,
			pagination:true,
			fitColumns:true,
			toolbar:toolbar,
    		singleSelect: true, 
			pagePosition:'bottom',//bottom,top,both
			url:urls,
			columns:[[
			{field:'ck',checkbox:true},
	        {field:'id',title:'ID',width:120,align:"center"},
	        {field:'num',title:'编号',width:120,align:"center"},
	        {field:'patName',title:'患者姓名',width:120,align:"center"},
	        {field:'sex',title:'性别',width:120,align:"center"},
	        {field:'age',title:'年龄',width:120,align:"center"},
	        {field:'tell',title:'电话',width:150,align:"center"},
	        {field:'idCard',title:'身份证号码',width:120,align:"center"},
	        {field:'socialId',title:'社保号',width:120,align:"center"},
	        {field:'hsName',title:'医院名称',width:120,align:"center"},
	        {field:'patNo',title:'门诊号',width:120,align:"center"},
	        {field:'areaId',title:'区域编号',width:120,align:"center"},
	        {field:'pgType',title:'项目类型',width:120,align:"center"},
	        {field:'upId',title:'上传用户编号',width:120,align:"center"},
	        {field:'upName',title:'上传大夫名称',width:120,align:"center"},
	        {field:'anaId',title:'分析端编号',width:120,align:"center"},
	        {field:'anaName',title:'分析大夫名称',width:120,align:"center"},
	        {field:'upTime',title:'上传时间',width:120,align:"center"},
	        {field:'downTime',title:'分析端下载时间',width:120,align:"center"},
	        {field:'netFlag',title:'当前数据状态',width:120,align:"center"},
	        {field:'special',title:'病例特殊说明',width:120,align:"center"},
	        {field:'conclusion',title:'结论特点',width:120,align:"center"},
	        {field:'reportId',title:'报告文件',width:120,align:"center"},
	        {field:'analysedFile',title:'当分析生成的文件',width:120,align:"center"}
	        ]],
			onLoadSuccess:function(data){
		        //调整表格宽高
		        $('#common').datagrid('resize', {
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
						$('#caseInfo').datagrid('reload');
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

	function downPdf(path){
		window.open("${rootPath}${BasePath}/down/file.do?filePath="+path);
	}
	function viewPdf(path){
		window.open(path);
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