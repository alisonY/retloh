<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>详情统计</title>
	<#include "commonHead.ftl" />
</head>
<body>
			<div class="easyui-layout" data-options="fit:true">
			
				<!--顶部按钮框-->
				<div data-options="region:'north',split:true" title="" style="height:50px">
					<!--顶部按钮框 右侧-->
					<div data-options="region:'center'">
						<div class="easyui-panel" data-options="fit:true" style="padding:5px;">
						
							<input class="easyui-textbox" label="采集端账号:" labelPosition="left" style="width:20%;height:30px">
							<!--分隔符--><span class="datagrid-btn-separator" style="vertical-align: middle;display:inline-block;float:none"></span>
							<input class="easyui-textbox" label="分析端账号:" labelPosition="left" style="width:20%;height:30px">
							<!--分隔符--><span class="datagrid-btn-separator" style="vertical-align: middle;display:inline-block;float:none"></span>
							<input class="easyui-datetimebox" label="起始时间" labelPosition="left" style="width:20%;height:30px">
							<input class="easyui-datetimebox" label="结束时间" labelPosition="left" style="width:20%;height:30px">
							<!--分隔符--><span class="datagrid-btn-separator" style="vertical-align: middle;display:inline-block;float:none"></span>
							<a href="#" class="easyui-linkbutton" iconCls="icon-search" style="width:80px;height:30px">查询</a>
						</div>
					</div>
			   </div>
				<div data-options="region:'center'">
					<div id="main" style="width: 600px;height:400px;float:left;margin-left:10%"></div>
					<div id="main1" style="width: 600px;height:400px;float:left;margin-left:15%"></div>
				</div>
			</div>
	<script type="text/javascript">
		var myChart = echarts.init(document.getElementById('main'));
		var myChart1 = echarts.init(document.getElementById('main1'));
		var option = {
		    title : {
		        text: '上传与下载',
		        subtext: '上传量与下载量'
		    },
		    tooltip : {
		        trigger: 'axis'
		    },
		    legend: {
		        data:['上传量','下载量']
		    },
		    toolbox: {
		        show : true,
		        feature : {
		            mark : {show: true},
		            dataView : {show: true, readOnly: false},
		            magicType : {show: true, type: ['line', 'bar']},
		            restore : {show: true},
		            saveAsImage : {show: true}
		        }
		    },
		    calculable : true,
		    xAxis : [
		        {
		            type : 'category',
		            data : ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
		        }
		    ],
		    yAxis : [
		        {
		            type : 'value'
		        }
		    ],
		    series : [
		        {
		            name:'上传量',
		            type:'bar',
		            data:[2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3],
		            markPoint : {
		                data : [
		                    {type : 'max', name: '最大值'},
		                    {type : 'min', name: '最小值'}
		                ]
		            },
		            markLine : {
		                data : [
		                    {type : 'average', name: '平均值'}
		                ]
		            }
		        },
		        {
		            name:'下载量',
		            type:'bar',
		            data:[2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3],
		            markPoint : {
		                data : [
		                    {name : '年最高', value : 182.2, xAxis: 7, yAxis: 183, symbolSize:18},
		                    {name : '年最低', value : 2.3, xAxis: 11, yAxis: 3}
		                ]
		            },
		            markLine : {
		                data : [
		                    {type : 'average', name : '平均值'}
		                ]
		            }
		        }
		    ]
		};
		var option1 = {
            title: {
                text: '概况'
            },
            tooltip: {},
            legend: {
                data:['数量']
            },
            xAxis: {
                data: ["已上传","以下载","下载中","待分析","分析中","以分析","已回传"]
            },
            yAxis: {},
            series: [{
                name: '数量',
                type: 'bar',
                data: [5, 20, 36, 10, 10, 20]
            }]
        };
		
		myChart.setOption(option);
		myChart1.setOption(option1);
	</script>
</body>
</html>