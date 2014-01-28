<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@page import="java.net.*" %>
<%
//	String strName = URLDecoder.decode(request.getParameter("txtData"),"utf-8");
	String strName = request.getParameter("txtData");
	response.getWriter().write( strName );
%>