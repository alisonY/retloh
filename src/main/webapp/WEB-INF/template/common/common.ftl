<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>项目信息</title>
	<#include "commonHead.ftl" />
</head>
<body style="padding: 0px 0px 0px 0px;">
    <table id="common" style="width:100%;height:auto" > </table>
    
	<!--工具栏-->
	<div id="tb" style="padding:2px 5px;">
		上传时间 : <input id="createTimeStart" class="easyui-datetimebox" style="width:150px">
        : <input id="createTimeEnd" class="easyui-datetimebox" style="width:180px">
                修改时间 : <input id="updateTimeStart" class="easyui-datetimebox" style="width:150px">
        : <input id="updateTimeEnd" class="easyui-datetimebox" style="width:180px">
                身份证号码：<input id="idCard" class="easyui-textbox"  style="width:250px;height:28px">
                患者姓名：<input id="patName" class="easyui-textbox"  style="width:150px;height:28px">
                项目：<input id="pgType" class="easyui-textbox"  style="width:150px;height:28px">
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="datagrid()" >条件查询</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-redo" onclick="resetParms()" >重置条件</a>
		<!--分隔符--><span class="datagrid-btn-separator" style="vertical-align: middle;display:inline-block;float:none"></span>
        <a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="delCommon()" >删除</a>
        </br>
		<a href="#" class="easyui-linkbutton" iconCls="icon-down" onclick="redoCommon()" >取消行编辑</a>
	    <a href="#" class="easyui-linkbutton" iconCls="icon-save" onclick="saveCommon()" >保存行编辑</a>
		<!--分隔符--><span class="datagrid-btn-separator" style="vertical-align: middle;display:inline-block;float:none"></span>
        <a href="#" class="easyui-linkbutton" iconCls="icon-man" onclick="viewCommonInfo()" >查看INFO字段</a>
        <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="editCommonInfo()" >编辑INFO字段</a>
    </div>
    
	<div id="dlg" class="easyui-dialog" title="项目详情" data-options="closed:'true',modal:'true',iconCls:'icon-edit',buttons: '#dlg-buttons'" style="width:30%;height:400px;padding:10px">
		<table id="pg" class="easyui-propertygrid" style="width:100%;height:auto" data-options=""></table>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:void(0)" id="editBtn" class="easyui-linkbutton" onclick="javascript:$('#dlg').dialog('close')">关闭</a>
	</div>
	
	
	
	<div id="dlgEdit" class="easyui-dialog" title="info修改" data-options="closed:'true',modal:'true',iconCls:'icon-edit',buttons: '#dlgEdit-buttons'" style="width:30%;height:400px;padding:10px">
		<input class="easyui-textbox" id="infoDetail" label="info信息:(exp：key1:value1#key2:value2#key3:value3)" labelPosition="top" multiline="true"  style="width:100%;height:100%">
	</div>
	<div id="dlgEdit-buttons">
		<a href="javascript:void(0)" id="editBtn" class="easyui-linkbutton" onclick="SaveCommonInfo()">保存</a>
		<a href="javascript:void(0)" id="editBtn" class="easyui-linkbutton" onclick="javascript:$('#dlgEdit').dialog('close')">关闭</a>
	</div>
	
	
	
	

</body>
<script type="text/javascript">
	$(document).ready(function(){
		datagrid();
	}); 
	var editRow = undefined;//编辑的行
	
	function datagrid(){
		var urls = "${rootPath}${BasePath}/common/getInfo.do";
		$('#common').datagrid({
			queryParams:{
					"createTimeStart":$('#createTimeStart').datetimebox('getValue'),
					"createTimeEnd":$('#createTimeEnd').datetimebox('getValue'),
					"updateTimeStart":$('#updateTimeStart').datetimebox('getValue'),
					"updateTimeEnd":$('#updateTimeEnd').datetimebox('getValue'),
					"patName":$.trim($("#patName").textbox('getValue')),
					"pgType":$.trim($("#pgType").textbox('getValue')),
					"idCard":$.trim($("#idCard").textbox('getValue'))
			},
			//rownumbers:true,
			pagination:true,
			fitColumns:false,
			toolbar:"#tb",
    		singleSelect: true, 
			pagePosition:'bottom',//bottom,top,both
			url:urls,
			columns:[[
			{field:'ck',checkbox:true},
	        {field:'id',title:'ID',width:120,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'num',title:'编号',width:120,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'sex',title:'性别',width:120,align:"center"},
	        {field:'patName',title:'患者姓名',width:120,align:"center",editor:"textbox"},
	        {field:'age',title:'年龄',width:120,align:"center",editor:"numberbox"},
	        {field:'tell',title:'电话',width:150,align:"center",editor:"numberbox"},
	        {field:'idCard',title:'身份证号码',width:120,align:"center",editor:"textbox"},
	        {field:'socialId',title:'社保号',width:120,align:"center",editor:"textbox"},
	        {field:'hsName',title:'医院名称',width:120,align:"center",editor:"textbox"},
	        {field:'patNo',title:'门诊号',width:120,align:"center",editor:"textbox"},
	        {field:'areaId',title:'区域编号',width:120,align:"center",editor:"textbox"},
	        {field:'special',title:'病例特殊说明',width:120,align:"center",editor:"textbox",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'conclusion',title:'结论特点',width:120,align:"center",editor:"textbox",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'pgType',title:'项目类型',width:120,align:"center"},
	        {field:'upId',title:'上传用户编号',width:120,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'upName',title:'上传大夫名称',width:120,align:"center"},
	        {field:'anaId',title:'分析端编号',width:120,align:"center"},
	        {field:'anaName',title:'分析大夫名称',width:120,align:"center"},
	        {field:'upTime',title:'上传时间',width:120,align:"center"},
	        {field:'downTime',title:'分析端下载时间',width:120,align:"center"},
	        /*{field:'netFlag',title:'当前数据状态',width:120,align:"center"},*/
	        {field:'status',title:'状态',width:140,align:"center",
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
	        		if (val==6)
	        			{return '已回传报告';}
	        		if (val==7)
	        			{return '上传原始数据中';}
	        		if (val==8)
	        			{return '已回传报告和分析结果';}
	        		else{
	        			return val;
	        			}
	        	}
	        },
	        {field:'reportId',title:'报告文件',width:130,align:"center",
			formatter:function(value, row, index){
				var path = row.reportId;
				if (! !path){
					var directUrl = "${rootPath}${BasePath}"+"/data/"+row.id+"/"+row.reportId;
					var str = '<a href="#" name="pdfDown" class="easyui-linkbutton" onclick="downPdf('+"'"+path+"'"+')" ></a>'+
							  '<a href="#" name="pdfView" class="easyui-linkbutton" onclick="viewPdf('+"'"+directUrl+"'"+')" ></a>';
					return str;  
				}
			}},
	        {field:'analysedFile',title:'当分析生成的文件',width:120,align:"center"},
	        {field:'createTime',title:'上传时间',width:120,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'updateTime',title:'修改时间',width:120,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		}
	        ]],
			onLoadSuccess:function(data){
				$("a[name='pdfDown']").linkbutton({text:'下载',iconCls:'icon-down'});
				$("a[name='pdfView']").linkbutton({text:'预览',iconCls:'icon-more'});
		        //调整表格宽高
		        $('#common').datagrid('resize', {
					width:function(){return document.body.clientWidth;},
					height:function(){return document.body.clientHeight;},
				});
		    },
		    onAfterEdit:function(rowIndex, rowData, changes){//行索引，数据，原先的改变的数据
			
				var updated = $('#common').datagrid('getChanges','updated');
				if(updated.length > 0){
					//更新方法
					console.info(changes);
					
						$.messager.confirm('警告','即将保存这条记录',function(b){
						if(b){
							changes.id = rowData.id;
							console.info(changes);
							var url = "${rootPath}${BasePath}/common/saveCommon.do";
							$.post(url,changes,function(result){
							if(result.status>0){
								$.messager.show({title:'提示',msg:result.msg,timeout:2000});
								$('#common').datagrid('reload');
							}else{
								$.messager.show({title:'提示',msg:result.msg});
							}
							
							},'json');
							editRow=undefined;
						}
					});
				}

			},onDblClickRow:function(rowIndex,rowData){//行的索引，行的数据
				if(editRow != undefined){
					$.messager.show({title:'提示',msg:'先 取消 或 保存 。'});
					//$('#common').datagrid('endEdit',editRow);
				}
				if(editRow == undefined){
					$('#common').datagrid('beginEdit',rowIndex);
					editRow = rowIndex;
				}
			}
		});
	}
	
	function resetParms(){
		$('#createTimeStart').datetimebox('setValue','');
		$('#createTimeEnd').datetimebox('setValue','');
		$('#updateTimeStart').datetimebox('setValue','');
		$('#updateTimeEnd').datetimebox('setValue','');
		$("#patName").textbox('setValue','');
		$("#idCard").textbox('setValue','');
	}
	
	function saveCommon(){
		$('#common').datagrid('endEdit',editRow);
	}
	
	function delCommon(){
		var id = getSelected();
		if(!id){
			return;
		}
		$.messager.confirm('警告','即将删除这条病历记录',function(b){
			if(b){ 
				var data={id:id};		    						
				var url = "${rootPath}${BasePath}/common/delInfo.do";
				$.post(url,data,function(result){
				if(result.status>0){
					$.messager.show({title:'提示',msg:result.msg,timeout:2000});
					$('#common').datagrid('reload');
				}else{
					$.messager.show({title:'提示',msg:result.msg});
				}
				
				},'json');
			}
		});
	}
	
	function viewCommonInfo(){
		loadData("INFO详情查看",0);
	}

	function loadData(title,type){
		var id = getSelected();
		if(!id){
			return;
		}
		var url = "${rootPath}${BasePath}/common/viewInfo.do";
		if(type == 1){
			$('#infoDetail').textbox('setValue', '');
			$('#dlgEdit').dialog({title: title});
			$('#dlgEdit').dialog('open');
			var data={id:id,type:type};		    						
			$.post(url,data,function(result){
				if(result.status){
					console.info(result.msg);
					$('#infoDetail').textbox('setValue', result.msg);
				}else{
					$.messager.show({title:'提示',msg:result.msg});
				}
			},'json');
		}
		if(type == 0){
			$('#dlg').dialog({title: title});
			$('#dlg').dialog('open');
			var data={id:id,type:type};		    						
			$.post(url,data,function(result){
				if(result.status){
					console.info(result.msg);
				
					$('#pg').propertygrid(
					{
						method:'get',
						showGroup:false,
						showHeader:false,
						scrollbarSize:0
			        });
			         $('#pg').propertygrid('loadData', result.msg);
				
				
				}else{
					$.messager.show({title:'提示',msg:result.msg});
				}
			},'json');
		}
	
	}
	
	

	
	//取消
	function redoCommon(){
		editRow=undefined;
		$('#common').datagrid('rejectChanges');
		$('#common').datagrid('unselectAll');
	}
	
	
	function editCommonInfo(){
		loadData("INFO详情编辑",1);
	}	
	
	function SaveCommonInfo(){
		var editedInfo = $('#infoDetail').textbox('getValue');
		var id = getSelected();
		var url = "${rootPath}${BasePath}/common/saveCommonInfo.do";
		var data={id:id,editedInfo:editedInfo};		    						
		$.post(url,data,function(result){
			if(result.status){
				$.messager.show({title:'提示',msg:result.msg,timeout:2000});
				$('#dlgEdit').dialog('close');
			}else{
				$.messager.show({title:'提示',msg:result.msg});
			}
		},'json');	
	}
	
	
	function downPdf(path){
		window.open("${rootPath}${BasePath}/common/file.do?filePath="+path);
	}
	function viewPdf(path){
		window.open(path);
	}		
	
	
	function getSelected(){  
        var selected = $('#common').datagrid('getSelected');
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