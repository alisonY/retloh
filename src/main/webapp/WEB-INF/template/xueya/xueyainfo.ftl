<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>血压信息</title>
	<#include "commonHead.ftl" />
</head>
<body>
    <table id="caseInfo" style="width:100%;height:auto" > </table>
	<!--对话框-->
	<div id="dlg" class="easyui-dialog" title="血压信息" style="width:800px;height:600px;padding:10px"
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
		var urls = "${rootPath}${BasePath}/xueya/info/getInfo.do";
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
	        {field:'patientId',title:'患者id',width:120,align:"center"},
	        {field:'surName',title:'姓名',width:120,align:"center"},
	        {field:'firstName',title:'姓名',width:120,align:"center"},
	        {field:'birthday',title:'生日',width:120,align:"center"},
	        {field:'weight',title:'体重',width:120,align:"center"},
	        {field:'height',title:'身高',width:150,align:"center"},
	        {field:'sex',title:'性别',width:120,align:"center"},
	        {field:'bedNo',title:'床号',width:120,align:"center"},
	        {field:'boomNo',title:'房间号',width:120,align:"center"},
	        {field:'sectionOffice',title:'科室',width:120,align:"center"},
	        {field:'doctorName',title:'诊断医生',width:120,align:"center"},
	        {field:'code',title:'编号',width:120,align:"center"},
	        {field:'telephpne',title:'电话',width:120,align:"center"},
	        {field:'address',title:'地址',width:120,align:"center"},
	        {field:'country',title:'国籍',width:120,align:"center"},
	        {field:'idCard',title:'idcard',width:120,align:"center"},
	        {field:'socialNum',title:'社保号',width:120,align:"center"},
	        {field:'reserve1',title:'备注1',width:120,align:"center"},
	        {field:'reserve2',title:'备注2',width:120,align:"center"}
	        
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