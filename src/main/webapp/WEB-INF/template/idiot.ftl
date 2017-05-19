<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
	<title>ftl test page!</title>  
	<script src="${rootPath}${BasePath}/js/jquery-3.2.0.min.js"></script>
</head>  
	<body>
	<div style="font-size:180px" class="textC" id ="textC">
		${name}  
	</div>
	<div style="font-size:90px" onclick="call()">
		点我换一个
		<BR>
	</div>
	</body>


	<script type="application/javascript">
    function call(){
	   $.ajax({
				type:"GET",
				url: "${rootPath}${BasePath}/random.do",
				datatype: "text",       
				success:function(data){
				var htmlContent = $("#textC");
				
				htmlContent.empty();
				
          		htmlContent.append(data);
				
				}       
			 });

	}
	</script>

</html> 