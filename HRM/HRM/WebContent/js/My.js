		//创建XMLHttpRequest对象
		var xhr = new XMLHttpRequest();
		//事件处理，当下拉选择改变的时候触发
		function change(id,s,fun){
			//设置请求相应头
			var uri = s;
			//设置处理响应的回调函数，应该利用匿名函数的
			xhr.onload = fun;
			//打开连接
			xhr.open("POST",uri,true);
			//设置请求头的信息
			xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			//发送请求
			xhr.send("Id="+id);
		}
		//定义二级回调函数
		function showSecond(){
			if(xhr.status==200){
				//获取对应的下拉列表
				var secondSelect = document.getElementById('second');
				//清空下拉列表的内容
				secondSelect.innerHTML="";
				//重新添加option
				var options = xhr.responseText;
				secondSelect.innerHTML=options;
				change((secondSelect.value),'showThirdO.action',showThird);
			}else{
				window.alert("您所请求的页面有异常！");
			}
		}
		//定义三级回调函数
		function showThird(){
			if(xhr.status==200){
				//获取对应的下拉列表
				var secondSelect = document.getElementById('third');
				//清空下拉列表的内容
				secondSelect.innerHTML="";
				//重新添加option
				var options = xhr.responseText;
				secondSelect.innerHTML=options;
			}else{
				window.alert("您所请求的页面有异常！");
			}
		}
		//定义职位回调函数
		function showPosition(){
			if(xhr.status==200){
				//获取对应的下拉列表
				var secondSelect = document.getElementById('ppp');
				//清空下拉列表的内容
				secondSelect.innerHTML="";
				//重新添加option
				var options = xhr.responseText;
				secondSelect.innerHTML=options;
			}else{
				window.alert("您所请求的页面有异常！");
			}
		}