<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>用户管理</title>
	<#include "commonHead.ftl" />
</head>
<body>
    <table id="userInfo" style="width:100%;height:auto" > </table>
</body>
<script type="text/javascript">
	$(document).ready(function(){
		datagrid();
	}); 

	function datagrid(){
		var urls = "${rootPath}${BasePath}/user/getInfo.do";
		$('#userInfo').datagrid({
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
	        {field:'login_name',title:'登录账号',width:120,align:"center"},
	        {field:'password',title:'密码',width:120,align:"center"},
	        {field:'user_name',title:'用户名',width:120,align:"center"},
	        {field:'department',title:'部门',width:120,align:"center"},
	        {field:'user_rank',title:'等级',width:120,align:"center"},
	        {field:'user_type',title:'类型',width:120,align:"center"},
	        {field:'update_time',title:'修改时间',width:120,align:"center"},
	        {field:'create_time',title:'创建时间',width:120,align:"center"},
	        {field:'operator',title:'操作人',width:120,align:"center"},
	        ]],
			onLoadSuccess:function(data){
				//按钮格式化
		        $('.delCls').linkbutton({text:'删除',plain:true,iconCls:'icon-remove'});
		        $('.editCls').linkbutton({text:'编辑',plain:true,iconCls:'icon-edit'});
		        $('.viewCls').linkbutton({text:'查看',plain:true,iconCls:'icon-man'});
		        //调整表格宽高
		        $('#caseInfo').datagrid('resize', {
					width:function(){return document.body.clientWidth;},
					height:function(){return document.body.clientHeight;},
				});
		    } 
		});
	}
	function gridOperate(row){
		return '<a href="javascript:void(0);" class="delCls" onclick="delRow('+"'"+row.id+"'"+')"></a>'+
			'<a href="javascript:void(0);" class="viewCls" onclick="viewRow('+"'"+row.id+"'"+')"></a>'+
			'<a href="javascript:void(0);" class="editCls" onclick="editRow('+"'"+row.id+"'"+')"></a>';  
	}
	function delRow(id){
		$.messager.confirm('警告','即将删除这条用户记录',function(b){
		if(b){ 
			var data={id:id};		    						
			var url = "${rootPath}${BasePath}/user/delInfo.do";
			$.post(url,data,function(result){
			if(result.status>0){
				$.messager.show({title:'提示',msg:result.msg,timeout:2000});
				$('#caseInfo').datagrid('reload');
			}else{
				$.messager.show({title:'提示',msg:result.msg});
			}
			
			},'json');
		}		
	})
		
	}
	function editRow(id){
		alert(id);
	}
	function viewRow(id){
		alert(id);
	}
</script>
</html>