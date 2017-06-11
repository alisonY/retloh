<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>血压信息</title>
	<#include "commonHead.ftl" />
</head>
<body style="padding: 0px 0px 0px 0px;">
    <div class="easyui-layout" style="width:100%;height:850px;">
        <div data-options="region:'west',split:true,iconCls:'icon-filter'" title="病例信息" style="width:800px;">
            <table id="bpInfo" style="width:100%;height:auto" > </table>
        </div>
        <div data-options="region:'center',title:'时间段',iconCls:'icon-ok'">
        </div>
        <div data-options="region:'east',split:true,iconCls:'icon-more'" title="详情" style="width:500px;">
        </div>
    </div>
</body>
<script type="text/javascript">
	$(document).ready(function(){
	
		var toolbar = [{
	        text:'详情',
	        iconCls:'icon-man',
	        handler:function(){
	        viewRow();
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
		var urls = "${rootPath}${BasePath}/bp/info/getList.do";
		$('#bpInfo').datagrid({
			rownumbers:true,
			pagination:true,
			fitColumns:true,
			toolbar:toolbar,
    		singleSelect: true, 
			pagePosition:'bottom',//bottom,top,both
			url:urls,
			columns:[[
			{field:'id',title:'id',width:10,align:"center"},
	        {field:'patientId',title:'患者ID',width:60,align:"center",
				 formatter:function(value,row,index){
     				return showValueAndTitle(value,row,index);
     			}
     		},
	        {field:'birthday',title:'生日',width:120,align:"center",
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
	        {field:'telephpne',title:'电话',width:80,align:"center",
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
</script>
</html>