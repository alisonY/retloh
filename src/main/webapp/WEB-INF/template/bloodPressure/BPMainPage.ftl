<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>血压信息</title>
	<#include "commonHead.ftl" />
	<script type="text/javascript" src="${rootPath}${BasePath}/easyui/datagrid-groupview.js"></script>
</head>
<body style="padding: 0px 0px 0px 0px;">
    <div class="easyui-layout" style="width:100%;height:850px;">
        <div data-options="region:'west',split:true,iconCls:'icon-filter'" title="病例信息" style="width:800px;">
        	<!--查询条件-->
            <div id="tb" style="padding:2px 5px;">
		                身份证：<input class="easyui-textbox"  style="width:150px;height:28px">
		        <a href="#" class="easyui-linkbutton" iconCls="icon-search">查询</a>
		        <!--分隔符--><span class="datagrid-btn-separator" style="vertical-align: middle;display:inline-block;float:none"></span>
		        <a href="#" class="easyui-linkbutton" iconCls="icon-reload" onclick="viewInterval()" >重置</a>
		        <a href="#" class="easyui-linkbutton" iconCls="icon-man" onclick="viewInterval()" >时间段</a>
		    </div>
            <table id="bpInfo" style="width:100%;height:auto" > </table>
        </div>
        <div data-options="region:'center',title:'时间段',iconCls:'icon-man'">
        	<table id="bpInterval" style="width:100%;height:auto" > </table>
        </div>
        <div data-options="region:'east',split:true,iconCls:'icon-more'" title="详情" style="width:400px;">
        	<table id="bpData" style="width:100%;height:auto" > </table>
        </div>
    </div>
</body>
<script type="text/javascript">
	$(document).ready(function(){
		datagrid();
	}); 


	function datagrid(){
		var urls = "${rootPath}${BasePath}/bp/info/getList.do";
		$('#bpInfo').datagrid({
			pagination:true,
			fitColumns:true,
    		singleSelect: true, 
			pagePosition:'bottom',//bottom,top,both
			url:urls,
			toolbar:"#tb",
			columns:[[
			/*{field:'id',title:'id',width:10,align:"center"},*/
	        {field:'patientId',title:'患者ID',width:60,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'birthday',title:'生日',width:125,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'weight',title:'体重',width:35,align:"center"},
	        {field:'height',title:'身高',width:35,align:"center"},
	        {field:'bedNo',title:'床位号',width:45,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'code',title:'编号',width:60,align:"center"},
	        {field:'telephpne',title:'电话',width:85,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'socialNum',title:'社保号',width:80,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'idCard',title:'身份证号',width:120,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'boomNo',title:'病房号',width:40,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		}
	        ]],
			onLoadSuccess:function(data){
		        $('#bpInfo').datagrid('resize', {
					width:function(){return document.body.clientWidth;},
					height:function(){return document.body.clientHeight;},
				});
		    } 
		});
	}
	
	function loadInterval(id){
		var toolbar = [{
	        text:'重置',
	        iconCls:'icon-reload',
	        handler:function(){
	        editRow();
	        }
	    	},'-',{
	        text:'查看详情',
	        iconCls:'icon-more',
	        handler:function(){
	        viewDetail();
	        }
	    }];
		var urls = "${rootPath}${BasePath}/bp/info/getInterval.do?infoId="+id;
		$('#bpInterval').datagrid({
			pagination:true,
    		singleSelect: true, 
			pagePosition:'bottom',//bottom,top,both
			url:urls,
			toolbar:toolbar,
			/*fitColumns:true,*/
            view:groupview,
            groupField:'count',
            groupFormatter:function(value,rows){
                return 'count为:'+value + ',共' + rows.length + '条';
            },
			columns:[[
	        {field:'count',title:'count',width:45,align:"center"},
	        {field:'startDate',title:'开始时间',width:145,align:"center"},
	        {field:'dayStartTime',title:'白天开始时间',width:145,align:"center"},
	        {field:'dayInterval',title:'日间隔',width:45,align:"center"},
	        {field:'nightStartTime',title:'晚上开始时间',width:145,align:"center"},
	        {field:'nightInterval',title:'夜间隔',width:45,align:"center"},
	        {field:'totalCount',title:'总次数',width:50,align:"center"},
	        {field:'errorCount',title:'错误次数',width:55,align:"center"},
	        {field:'remark',title:'备注',width:40,align:"center"}
	        ]],
			onLoadSuccess:function(data){
		        $('#bpInterval').datagrid('resize', {
					width:function(){return document.body.clientWidth;},
					height:function(){return document.body.clientHeight;},
				});
		    } 
		});
	}
	
	function viewInterval(){
		var id = getSelected();
		if(!id){
			return;
		}
		loadInterval(id);
	}	
	
	function getSelected(){  
        var selected = $('#bpInfo').datagrid('getSelected');
        var id = "";
        if (selected){
            id = selected.id;
        }else{
        	$.messager.show({title:'提示',msg:'没有选择病例信息行。'});
        }
        return id;
    }
    /************************************************/
    
    
    
    function loadData(id){
		var urls = "${rootPath}${BasePath}/bp/info/getData.do?intervalId="+id;
		$('#bpData').datagrid({
			pagination:true,
    		singleSelect: true, 
			pagePosition:'bottom',//bottom,top,both
			url:urls,
			columns:[[
	        {field:'systole',title:'舒张压',width:60,align:"center"},
	        {field:'diastole',title:'收缩压',width:60,align:"center"},
	        {field:'hr',title:'心率',width:60,align:"center"},
	        {field:'dataNo',title:'顺序',width:60,align:"center"},
	        {field:'caijiDate',title:'采集日期',width:150,align:"center"}
	        ]],
			onLoadSuccess:function(data){
		        $('#bpData').datagrid('resize', {
					width:function(){return document.body.clientWidth;},
					height:function(){return document.body.clientHeight;},
				});
		    } 
		});
	}
    
    function viewDetail(){
		var id = getIntervalSelected();
		if(!id){
			return;
		}
		loadData(id);
	}
	
	function getIntervalSelected(){  
        var selected = $('#bpInterval').datagrid('getSelected');
        var id = "";
        if (selected){
            id = selected.id;
        }else{
        	$.messager.show({title:'提示',msg:'没有选择时间段行。'});
        }
        return id;
    }
</script>
</html>