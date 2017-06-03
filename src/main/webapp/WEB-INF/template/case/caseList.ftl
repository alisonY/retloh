<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>病例信息</title>
	<#include "commonHead.ftl" />
</head>
<body>
    <table id="caseInfo" style="width:100%;height:auto" > </table></body>
<script type="text/javascript">
	$(document).ready(function(){
		datagrid();
	}); 

	function datagrid(){
		var urls = "${rootPath}${BasePath}/case/getInfo.do";
		$('#caseInfo').datagrid({
			rownumbers:true,
			pagination:true,
			fitColumns:true,  
    		singleSelect: true, 
			pagePosition:'bottom',//bottom,top,both
			url:urls,
			columns:[[
  	        {field:'operat',title:'操作',width:170,align:'center',
	        	formatter:function (value,row,index){
	        		return gridOperate(row);
	        	}
	        },
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
		        $('.delCls').linkbutton({text:'删除',plain:true,iconCls:'icon-remove'});
		        $('.editCls').linkbutton({text:'编辑',plain:true,iconCls:'icon-edit'});
		        $('.viewCls').linkbutton({text:'查看',plain:true,iconCls:'icon-man'});
		        $('#caseInfo').datagrid('resize', {
					width:function(){return document.body.clientWidth;},
					height:function(){return document.body.clientHeight;},
				});
		    } 
		});
	}
	function gridOperate(row){
		return '<a href="javascript:void(0);" class="delCls" onclick="delRow('+"'"+row.id+"'"+')"></a>'+
			'<a href="javascript:void(0);" class="viewCls" onclick="delRow('+"'"+row.id+"'"+')"></a>'+
			'<a href="javascript:void(0);" class="editCls" onclick="delRow('+"'"+row.id+"'"+')"></a>';  
	}
	function delRow(id){
		alert(id);
	}
	function editRow(id){
		alert(id);
	}
</script>
</html>