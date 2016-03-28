<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>签章服务器webservice接口测试</title>
<script type="text/javascript" src="./script/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		alert("122");
		$.get(
			"/keyinfo.action",{name:"xupeng"},
			function (data){
				alert(data);	
			}
		);
	});
</script>
</head>
<body>
	<!-- 头部 -->
	<div class="head">
		<ul>
			<li><a href="javascript:void(0);">密钥信息接口</a></li>
			<li><a href="/signinfo.jsp">签章信息接口</a></li>
			<li><a>证书接口</a></li>
			<li><a>打印份数接口</a></li>
			<li><a>注册密钥接口</a></li>
			<li><a>机构接口</a></li>
		</ul>
	</div>
</body>
</html>