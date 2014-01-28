<%@ page language="java" pageEncoding="utf-8"%>
<%@page import="java.net.URLDecoder"%>
<%
	String strName = URLDecoder.decode(request.getParameter("name"), "utf-8");
	String strHTML = "<div class='clsShow'>";	
	
	if(strName.equals("陶国荣")){
		strHTML += "姓名：陶国荣<br>";
		strHTML += "性别：男<br>";
		strHTML += "邮箱：tao_guo_rong@163.com<br>";
	} else if(strName.equals("李健洲")){
		strHTML += "姓名：李健洲<br>";
		strHTML += "性别：女<br>";
		strHTML += "邮箱：xiaoli@163.com<br>";
	}else{
		strHTML += "姓名：陶国荣<br>"+strName;
		strHTML += "性别：男<br>";
		strHTML += "邮箱：tao_guo_rong@163.com<br>";
		strHTML += "姓名：李健洲<br>";
		strHTML += "性别：女<br>";
		strHTML += "邮箱：xiaoli@163.com<br>";
	}
	strHTML += "</div>";
	response.getWriter().print(strHTML);
%>

