<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellpadding="0" cellspacing="0" width="70%">
		<tr>
			<th>编号</th>
			<th>用户名</th>
			<th>密码</th>
			<th>年龄</th>
		</tr>
		<s:iterator value="#list" var="u">
			<tr >
				<td><s:property value="#u.id"/></td>
				<td><s:property value="#u.username"/></td>
				<td><s:property value="#u.password"/></td>
				<td><s:property value="#u.age"/></td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>