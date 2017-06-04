/* 
 * 检测对象是否是空对象(不包含任何可读属性)。 //如你上面的那个对象就是不含任何可读属性
 * 方法只既检测对象本身的属性，不检测从原型继承的属性。 
 */
function isOwnEmpty(obj){ 
    for(var name in obj){ 
        if(obj.hasOwnProperty(name)){ 
            return false; 
        } 
    } 
    return true; 
}
 
/* 
 * 检测对象是否是空对象(不包含任何可读属性)。 
 * 方法既检测对象本身的属性，也检测从原型继承的属性(因此没有使hasOwnProperty)。 
 */
function isEmpty(obj){ 
    for (var name in obj) { 
        return false; 
    } 
    return true; 
}

/**
* 取得应用的完整路径
*/
function getBasePath(){
	var url = window.location.href;
	index = url.indexOf("/rest");
	if(index < 0){
		return "/";
	}
	return url.substring(0,index+1);
}

/**
 * form.reset()
 */
function reset(frm){
	if(getType(frm).toLowerCase().indexOf("form") > -1){
		frm.reset();
	}
	return false;		
}

/**
 * 数组转JSON
 * @param o
 * @returns
 */
function arrayToJson(o) { 
	var r = []; 
	if (typeof o == "string") return "\"" + o.replace(/([\'\"\\])/g, "\\$1").replace(/(\n)/g, "\\n").replace(/(\r)/g, "\\r").replace(/(\t)/g, "\\t") + "\""; 
	if (typeof o == "object") { 
	if (!o.sort) { 
	for (var i in o) 
	r.push(i + ":" + arrayToJson(o[i])); 
	if (!!document.all && !/^\n?function\s*toString\(\)\s*\{\n?\s*\[native code\]\n?\s*\}\n?\s*$/.test(o.toString)) { 
	r.push("toString:" + o.toString.toString()); 
	} 
	r = "{" + r.join() + "}"; 
	} else { 
	for (var i = 0; i < o.length; i++) { 
	r.push(arrayToJson(o[i])); 
	} 
	r = "[" + r.join() + "]"; 
	} 
	return r; 
	} 
	return o.toString(); 
}

/**
 * Check digit number
 */
function isDigit(obj) {
	var re = /^[0-9]*$/;
	var span;
	if(obj.nextElementSibling.tagName.toUpperCase() == 'SPAN'){
		span = obj.nextElementSibling;
	}else{
		span = document.createElement("span");				
		obj.parentNode.appendChild(span);
	}
	span.setAttribute("style","font-size:10px;color:#ff0000;");	
	if (!re.test(obj.value)){			
		span.innerHTML = "请输入阿拉伯数字";
		obj.focus();
		return false;
	}else{
		span.innerHTML = "";		
	}
}

/**
 * 是否阿拉伯数字
 */
function _isDigit(s) {
	var re = /^\d*$/;
	return re.test(s);
}
	
/**
 * 根据时间戳生成ID，需要控制在整型范围内。
 */
function getTimeIntId(){
	var tm = new Date();
	var tid = new String(tm.getTime());
	tid = tid.right(8);	
	tid = Math.abs(parseInt(tid));
    return tid;
}




// easy ui datatimebox时间格式
function dataTimeBoxFormat(time){
    var t = new Date(time);
    var tf = function(i){return (i < 10 ? '0' : '') + i};
    return 'yyyy-MM-dd HH:mm:ss'.replace(/yyyy|MM|dd|HH|mm|ss/g, function(a){
        switch(a){
            case 'yyyy':
                return tf(t.getFullYear());
                break;
            case 'MM':
                return tf(t.getMonth() + 1);
                break;
            case 'mm':
                return tf(t.getMinutes());
                break;
            case 'dd':
                return tf(t.getDate());
                break;
            case 'HH':
                return tf(t.getHours());
                break;
            case 'ss':
                return tf(t.getSeconds());
                break;
        }
    })
}

/**
 * 从easyUI 的datetimebox 组件中获得时间
 * @timeValue 控件值格式为yyyy-MM-dd HH:mm:ss
 * @return 返回date对象
 */
function date_from_dateTimeBox(timeValue){
	var dt=[];
	timeValue.replace(/\d{1,4}/g,function(val){
			dt[dt.length]=val;
		});
	return new Date(dt[0],dt[1]-1,dt[2],dt[3],dt[4],dt[5]).getTime();//获得时间值
}

/**
 * 公共消息 提示
 * @param msg 提示内容
 * @param title 弹出框 的title
 */
function msgShow(msg,title){
	$.messager.show({
		title:title||"提示信息",
		msg: msg,
		timeout:2000,
		showType:'slide'
	});       	
}

/**
 * 父级窗口公共消息 提示
 * @param msg 提示内容
 * @param title 弹出框 的title
 */
function parentMsgShow(msg,title){
	parent.$.messager.show({
		title:title||"提示信息",
		msg: msg,
		timeout:2000,
		showType:'slide'
	});       	
}

/**
 *  ajax 异步请求 error时调用的函数
 * 有以下三个参数：a:XMLHttpRequest 对象、b:textStatus 错误信息、c: errorThrown 捕获的异常对象。
 *   如果发生了错误，错误信息（第二个参数）除了得到null之外，
 * 还可能是"timeout", "error", "notmodified" 和 "parsererror"。
 * */
function AJAXError_fn(a,b,c,data){
	data=data||{};
	if(b=="error"){
		if(a.status==200){ //跳转到登陆页
			window.top.location.href=data.basePath||top.location.href||"http://paimai.suning.com/admin"; 
		}else{
			msgShow(data.errorMsg||"服务器异常");
		}
	}else if(b=="timeout"){
		msgShow(data.timeoutMsg||"请求超时");
	}else if(b=="parsererror"){
		msgShow(data.parserErrorMsg||"解析数据出错");
	}else{
		msgShow(data.requestMsg||"请求异常");
	}
}

/**
 *  ajax 异步请求 success 时调用的函数 
 *  
 * */
function AJAXSuccess_fn(data){
	data=data||{};
	if(data.sessionTimeout){ 
		//跳转到登陆页
		window.top.location.href=data.basePath||top.location.href||"http://paimai.suning.com/admin";
	}
}
/**
 * 获得 服务器的当前时间
 * @basePath  项目主路径
 * @return 获得服务器时间的秒值
 */
function getDbDate(basePath){
	var currdate=0;
	  $.ajax({url: basePath+'rest/topicMain/getDBDate?_='+Math.ceil(Math.random()*10000)+1, 
          type: 'GET', 
          dataType: 'json', 
          timeout: 1000,
          async:false,
          success: function(data){
        	  currdate=data;
          },
		  error:function(a,b,c){
			  AJAXError_fn(a,b,c,{"basePath":basePath});
		  }
	   });
	  return currdate;
} 

/**
 * 实现在dataGrid中鼠标移到所在列时，有悬浮的提示信息 来显示列的内容
 * @param value
 * @param row
 * @param index
 * @returns 带有title(提示信息)的span
 */
function showValueAndTitle(value,row,index){
	return '<span title="'+value+'">'+value+'</span>'; 
}

/**
 * 显示最大化窗体
 * 
 * @param data 扩展属性
 */
function showMaxWindow(data){
	var dt={
		 "maximized":true, //所有边界组件数据信息的窗体 全屏/最大化显示
		 "minimizable":false,//隐藏 最小化的按钮
		 "maximizable":false,//隐藏 最大化的按钮
		 "collapsible":false,//隐藏 收缩的按钮
		 "draggable":false   //禁止窗体拖拽
		 };
	dt=$.extend(dt,data); // 扩展自定义 属性
	$(this).window(dt).window("open");
}

/**
 * 
 * 选中dataGrid中 要移动的项进行移动
 * @param direction  移动的方向: up:向上移;   down:向下移;
 * @param target 目标对象
 */
function dataGridMove(direction,target ){
	//获取选中的行中的第一行
	var row = $(target).datagrid('getSelected');
	if(!row){//没有选中行
		msgShow("请选择要移动的行");
		return ;
	}
	//获得 行的索引
	var rowIndex=$(target).datagrid('getRowIndex',row);
	
	if(direction=="up"){
		if(rowIndex == 0){
  			msgShow("已是第一行了,不能继续往上了");
  			return ;
		}
		//新添加一行数据(数据值:为选中的行的数据值)
			$(target).datagrid('insertRow',{
			index: rowIndex-1,	
			row: row
		});
			//删除选中的行
	 	$(target).datagrid('deleteRow',rowIndex+1);
	 	//重新选中 新添加的行
	 	$(target).datagrid('selectRow',rowIndex-1);

	}else if(direction=="down"){
		var dataLength=$(target).datagrid('getRows').length-1;
		if(rowIndex == dataLength){
  			msgShow("已是最后一行了,不能再低了");
  			return ;
		}
		$(target).datagrid('insertRow',{
			index: rowIndex+2,	
			row:row
		});
	 	$(target).datagrid('deleteRow',rowIndex);
	 	$(target).datagrid('selectRow',rowIndex+1);

	}
  		 
}

/**
 * 隐藏 页面初始化时,easyui组件 自动验证的提示信息
 */
function hideValidate(){
	  $(".validatebox-invalid").removeClass("validatebox-invalid");//删除验证提示  
}

/**
 * 算字符串长度  一个中文 全角是2个字符        @王海霞
 */
function strlength(str){
	if(str=='' || str==null || typeof(str)=='undefined'){
			return 0;
		}
	var a = str.length;
	for(var i=0;i<a;i++){
		if(str.charCodeAt(i)>127){
				a++;
			}
	}
	return a;
}


/**
 * 判断一段时间是否是合法 后面时间是否大于前面时间     @王海霞
 */
function checkDateTime(d1, d2) {
	var t1, t2, d1_new, d2_new;
	var d1_array = d1.substring(0, 10).split('-');
	var d2_array = d2.substring(0, 10).split('-');
	d1_new = d1_array[1] + '/' + d1_array[2] + '/' + d1_array[0] + ' '
			+ d1.substring(10, 19);
	d2_new = d2_array[1] + '/' + d2_array[2] + '/' + d2_array[0] + ' '
			+ d2.substring(10, 19);
	t1 = Date.parse(d1_new);
	t2 = Date.parse(d2_new);
	if(d1!=null && d1!=""){
		if(isNaN(t1)){
			msgShow('起始时间不合法，请重新选择！',null);
		    return false;
		}
	}
	if(d2!=null && d2!=""){
		if(isNaN(t2)){
			msgShow('结束时间不合法，请重新选择！',null);
		    return false;
		}
	}
	if (d1 != null && d1 != '' && d2 != null && d2 != '') {
		if (t1 > t2) {
			$.messager.show({
				title : '提示',
				msg : '起始时间不能大于结束时间，请重新选择！'
			});
			return false;
		}
	}
	return true;
}

/**
 * 清除数字之外的字符
 */
function clearNoNum(obj)
{
	obj.value = obj.value.replace(/[^\d.]/g,"");
	obj.value = obj.value.replace(/^\./g,"");
	obj.value = obj.value.replace(/\.{2,}/g,".");
	obj.value = obj.value.replace(".","$#$").replace(/\./g,"").replace("$#$",".");
}