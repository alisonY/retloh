<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>报告查询X</title>
	<#include "commonHead.ftl" />
</head>
<body style="padding: 0px 0px 0px 0px;">
    <table id="common" style="width:100%;height:auto" > </table>
    
	<!--工具栏-->
	<div id="tb" style="padding:2px 5px;">
                身份证号码：<input id="idCard" class="easyui-textbox"  style="width:300px;height:28px">
                患者姓名：<input id="patName" class="easyui-textbox"  style="width:300px;height:28px">
                社保号：<input id="socialId" class="easyui-textbox"  style="width:300px;height:28px">
                门诊号(?住院号)：<input id="patNo" class="easyui-textbox"  style="width:300px;height:28px">
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="doSearch()" >条件查询</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-redo" onclick="resetParms()" >重置条件</a>
		<!--分隔符--><span class="datagrid-btn-separator" style="vertical-align: middle;display:inline-block;float:none"></span>
    </div>

</body>
<script type="text/javascript">
	$(document).ready(function(){
		datagrid("");
	}); 
	var editRow = undefined;//编辑的行
	
	function datagrid(url){
		var urls = url;
		
		var patName = $.trim($("#patName").textbox('getValue'));
		var socialId = $.trim($("#socialId").textbox('getValue'));
		var patNo = $.trim($("#patNo").textbox('getValue'));
		var idCard = $.trim($("#idCard").textbox('getValue'));
		patName="赵婷婷";
		patNo="888888";
		var nc = 0;
		if(!patName){
			nc = nc+1;
		}
		if(!socialId){
			nc = nc+1;
		}
		if(!patNo){
			nc = nc+1;
		}
		if(!idCard){
			nc = nc+1;
		}
		if(!!url){
			if(nc>=3){
				$.messager.show({title:'提示',msg:"请至少填写两个查询条件",timeout:2000});
				return;
			}
		}
		
		$('#common').datagrid({
			queryParams:{
					"patName":patName,
					"socialId":socialId,
					"patNo":patNo,
					"idCard":idCard
			},
			rownumbers:true,
			pagination:true,
			fitColumns:false,
			toolbar:"#tb",
    		singleSelect: true, 
			url:urls,
			columns:[[
	        {field:'reportId',title:'报告文件',width:130,align:"center",
			formatter:function(value, row, index){
				var path = row.reportId;
				if (! !path){
					var directUrl = "${rootPath}${BasePath}"+"/data/"+row.id+"/"+row.reportId;
					console.info(directUrl);
					var str = '<a href="#" name="pdfDown" class="easyui-linkbutton" onclick="downPdf('+"'"+path+"'"+')" ></a>'+
							  '<a href="#" name="pdfView" class="easyui-linkbutton" onclick="viewPdf('+"'"+directUrl+"'"+')" ></a>';
							  
					return str;  
				}
			}},
	        {field:'num',title:'编号',width:180,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'sex',title:'性别',width:150,align:"center"},
	        {field:'patName',title:'患者姓名',width:120,align:"center"},
	        {field:'age',title:'年龄',width:120,align:"center"},
	        {field:'tell',title:'电话',width:200,align:"center"},
	        {field:'hsName',title:'医院名称',width:200,align:"center"},
	        {field:'patNo',title:'门诊号',width:200,align:"center"},
	        {field:'analysedFile',title:'分析生成的文件',width:120,align:"center"},
	        {field:'createTime',title:'上传时间',width:160,align:"center"},
	        {field:'updateTime',title:'修改时间',width:160,align:"center"
     		}
	        ]],
			onLoadSuccess:function(data){
		        //调整表格宽高
		        $('#common').datagrid('resize', {
					width:function(){return document.body.clientWidth;},
					height:function(){return document.body.clientHeight;},
				});
				$("a[name='pdfDown']").linkbutton({text:'下载',plain:false,iconCls:'icon-down'});
				$("a[name='pdfView']").linkbutton({text:'预览',plain:false,iconCls:'icon-more'});
		    }
		});
	}
	
	function doSearch(){
		console.info("12123");
		var urls = "${rootPath}${BasePath}/down/search.do";
		datagrid(urls);
	}
		
	function resetParms(){
		$("#patName").textbox('setValue','');
		$("#socialId").textbox('setValue','');
		$("#patNo").textbox('setValue','');
		$("#idCard").textbox('setValue','');
	}
	
	function downPdf(path){
		window.open("${rootPath}${BasePath}/down/file.do?filePath="+path);
	}
	function viewPdf(path){
		window.open(path);
	}		
</script>
</html>