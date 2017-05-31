<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>CaseInfoList</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
	<#include "commonHead.ftl" />
</head>
<body>

    <table id="caseInfo" style="width:100%;height:auto" >
        <thead>
            <tr>
                <th field="id" width="80">ID</th>
                <th field="name" width="120">姓名</th>
                <th field="serialNumber" width="120">编号</th>
                <th field="sex" width="70" align="right">性别</th>
                <th field="age" width="70" align="right">年龄</th>
                <th field="operationDoctor" width="70" align="right">操作医生</th>
                <th field="diagnosticDoctor" width="70">诊断医生</th>
                <th field="daolianshu" width="70">导联数</th>
                <th field="sumHours" width="70">记录小时数</th>
                <th field="pacemakerParameter" width="120">起搏器参数</th>
                <th field="offset" width="120">文件偏移量</th>
                <th field="recordYear" width="70">年</th>
                <th field="recordMounth" width="70">月</th>
                <th field="recordDay" width="70">日</th>
                <th field="recordMinutes" width="70">分</th>
                <th field="hospitalNumber" width="60">住院号</th>
                <th field="clinicNumber" width="120">门诊号</th>
                <th field="bedNumber" width="120">床号</th>
                <th field="department" width="200">科室</th>
                <th field="yongyaoshuoming" width="200">用药说明</th>
                <th field="hospitalName" width="200">医院名称</th>
                <th field="defaultHospitalName" width="200">默认医院名</th>
                <th field="hospitalAddress" width="200">医院地址</th>
                <th field="hospitalPhonenum" width="100">医院电话</th>
                <th field="hospitalFax" width="100" align="center">医院传真</th>
                <th field="patientYear" width="60" align="center">患者年</th>
                <th field="patientMonth" width="60" align="center">患者月</th>
                <th field="patientDay" width="60" align="center">患者日</th>
                <th field="suggest" width="200" align="center">建议</th>
                <th field="note" width="200" align="center">注意</th>
                <th field="caseTag" width="200" align="center">病例库标记语</th>
                <th field="holterLoadDate" width="100" align="center">回放时间</th>
                <th field="handwrittenConclusion" width="200" align="center">手写结论</th>
            </tr>
        </thead>
    </table>

</body>
<script type="text/javascript">
	$(document).ready(function(){
		datagrid();
	}); 

	function datagrid(){
		var urls = "${rootPath}${BasePath}/case/getInfo.do";
		$('#caseInfo').datagrid({
			rownumbers:true,
			pagination:true,
			pagePosition:'bottom',//bottom,top,both
			url:urls
		});
	}
</script>
</html>