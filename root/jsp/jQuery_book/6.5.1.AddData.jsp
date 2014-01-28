<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@page import="java.net.*" %>
<%
	String strName = URLDecoder.decode(request.getParameter("txtData"),"utf-8");
	String strContent = URLDecoder.decode(request.getParameter("content"),"utf-8");
	String strFileName = "";
	
	// 定义XML文档变量
	XMLDocume
	response.getWriter().write( strName );
%>