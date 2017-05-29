<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
	<title>User list</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
	<#include "commonHead.ftl" />
</head>
<body>

    <table id="caseInfo" class="easyui-datagrid" style="width:700px;height:250px"
            title="病例信息" iconCls="icon-save"
            rownumbers="true" pagination="true">
        <thead>
            <tr>
                <th field="itemid" width="80">Item ID</th>
                <th field="productid" width="120">Product ID</th>
                <th field="listprice" width="80" align="right">List Price</th>
                <th field="unitcost" width="80" align="right">Unit Cost</th>
                <th field="attr1" width="200">Attribute</th>
                <th field="status" width="60" align="center">Stauts</th>
            </tr>
        </thead>
    </table>

</body>
<script type="text/javascript">
	$(document).ready(function(){
		datagrid();
	}); 

	function datagrid(){
        var dg = $('#caseInfo');
        console.info("123123");
        dg.datagrid('loadData',${rootPath}${BasePath}/case/getInfo.do);
        console.info("456");
        dg.datagrid({pagePosition:bottom});//bottom,top,both
        dg.datagrid('getPager').pagination({
            layout:['list','sep','first','prev','sep','manual','sep','next','last','sep','refresh']
        });
	}
</script>
</html>