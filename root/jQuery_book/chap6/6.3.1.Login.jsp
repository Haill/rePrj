<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@page import="java.net.*" %>
<%
	String strName = URLDecoder.decode(request.getParameter("txtName"),"utf-8");
	String strPass = URLDecoder.decode(request.getParameter("txtPass"),"utf-8");
	String blnLogin = "fail"; 
	if("admin".equals(strName) && "123456".equals(strPass)){
		blnLogin = "succ";
	}
	response.getWriter().write("{\"succ\":\""+blnLogin+"\"}");
%>