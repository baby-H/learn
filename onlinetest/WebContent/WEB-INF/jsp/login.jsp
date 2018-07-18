<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>登陆</title>


<script src="/online_learning/js/jquery-1.11.3.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	function check() {

		var username = $("#username").val();
		var password = $("#password").val();

		if (username == "" || password == "") {
			alert("用户名或者密码不能为空");
			return false;
		} else {
			return true;
		}
	}
</script>

</head>
<body leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
	<font color="red">
			 <%-- 提示信息--%>
			 <span id="message">${msg}</span>
	</font>
	<div class="Page" id="login_page" align="center">
		<h2>用户登录</h2>
		<div class="login_Container">
			<form action="${pageContext.request.contextPath}/check"
				onsubmit="return check()">
				用户名：<input type="text" name="username" id="username" /><br> <br>
				密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"
					id="password" /><br> <br>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
					type="submit" value="确认" />
			</form>
		</div>
	</div>



</body>
</html>