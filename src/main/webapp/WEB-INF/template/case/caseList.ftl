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

		<form id="caseForm" method="post">
			    <div id="infoLayout" style="width:770px;height:500px;">
			    	<!--
			        <div data-options="region:'north'" style="height:50px">
			        </div>
			    	-->
			        <div data-options="region:'south'" style="height:50px;">
			        </div>
			        <div data-options="region:'west'" style="width:385px;padding:20px;">
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="name" style="width:100%" data-options="label:'姓名:',required:true">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="clinicNumber" style="width:100%" data-options="label:'住院号:',required:true">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="bedNumber" style="width:100%" data-options="label:'床号:',required:true">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="age" style="width:100%;" data-options="label:'年龄:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="sex" style="width:100%;" data-options="label:'性别:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="serialNumber" style="width:100%;" data-options="label:'编号:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="department" style="width:100%;" data-options="label:'性别:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="hospitalNumber" style="width:100%;" data-options="label:'门诊号:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="daolianshu" style="width:100%;" data-options="label:'导联数:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="sumHours" style="width:100%;" data-options="label:'记录小时数:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="recordYear" style="width:100%;" data-options="label:'年:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="recordDay" style="width:100%;" data-options="label:'日:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="recordMounth" style="width:100%;" data-options="label:'月:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="recordMinutes" style="width:100%;" data-options="label:'分:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="holterLoadDate" style="width:100%;" data-options="label:'回放时间:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="pacemakerParameter" style="width:100%;" data-options="label:'起搏器参数:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="offset" style="width:100%;" data-options="label:'文件偏移量:'">
							</div>
			        </div>
			        <div data-options="region:'center'" style="padding:20px">
			        		<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="citizenNumber" style="width:100%" data-options="label:'身份证号:',required:true">
							</div>
			        		<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="holterLoadDate" style="width:100%;" data-options="label:'回放时间:'">
							</div>
			        		<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="defaultHospitalName" style="width:100%;" data-options="label:'默认医院名:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="hospitalAddress" style="width:100%;" data-options="label:'医院地址:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="hospitalPhonenum" style="width:100%;" data-options="label:'医院电话:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="hospitalFax" style="width:100%;" data-options="label:'医院传真:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="conclusion" style="width:100%" data-options="label:'结论:',required:true">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="operationDoctor" style="width:100%" data-options="label:'操作医生:',required:true">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="diagnosticDoctor" style="width:100%" data-options="label:'诊断医生:',required:true">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="department" style="width:100%;" data-options="label:'科室:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="yongyaoshuoming" style="width:100%;" data-options="label:'用药说明:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="suggest" style="width:100%;" data-options="label:'建议:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="note" style="width:100%;" data-options="label:'注意:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="caseTag" style="width:100%;" data-options="label:'病例库标记语:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="handwrittenConclusion" style="width:100%;" data-options="label:'医生手写结论:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="patientDay" style="width:100%;" data-options="label:'患者日:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="patientMonth" style="width:100%;" data-options="label:'患者月:'">
							</div>
							<div style="margin-bottom:20px">
								<input class="easyui-textbox" name="patientYear" style="width:100%;" data-options="label:'患者年:'">
							</div>
							<input  type="hidden" name="id" />
			        </div>
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
	        {field:'status',title:'状态',width:100,align:"center",
	        	formatter:function(val,rec){
	        		if (val==0)
	        			{return '待上传数据包';}
	        		if (val==1)
	        			{return '已上传待分析';}
	        		if (val==2)
	        			{return '待分析下载中';}
	        		if (val==3)
	        			{return '已下载待分析';}
	        		if (val==4)
	        			{return '已分析回传中';}
	        		if (val==5)
	        			{return '已回传';}
	        	}
	        },
	        {field:'name',title:'姓名',width:120,align:"center"},
	        {field:'serialNumber',title:'编号',width:120,align:"center"},
	        {field:'sex',title:'性别',width:120,align:"center"},
	        {field:'age',title:'年龄',width:120,align:"center"},
	        {field:'citizenNumber',title:'身份证号',width:150,align:"center"},
	        {field:'operationDoctor',title:'操作医生',width:120,align:"center"},
	        {field:'diagnosticDoctor',title:'诊断医生',width:120,align:"center"},
	        {field:'pdfexportFilepath',title:'pdf报告',width:120,align:"center",
				formatter:function(value, row, index){
					var path = row.pdfexportFilepath
					if (! !path)
						var str = '<a href="#" name="opera" class="easyui-linkbutton" onclick="downPdf('+"'"+row.pdfexportFilepath+"'"+')" ></a>';  
						return str;  
					}
				}
	        }
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