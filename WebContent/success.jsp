<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.conn.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.conn.CameraBean"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>
<%
int status=CameraDAO.insertCamera(obj);
if (status>0)
	out.println("Sucess");
else
	out.println("Fail");
%>
</body>
</html>