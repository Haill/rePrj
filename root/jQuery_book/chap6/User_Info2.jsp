<%@ page language="java" pageEncoding="utf-8"%>
<%@page import="java.net.URLDecoder"%>
<%
//	String strName = URLDecoder.decode(request.getParameter("name"), "utf-8");
//	String sex = URLDecoder.decode(request.getParameter("sex"), "utf-8");
//	String strEmail = request.getParameter("chkEmail");
	String strName = request.getParameter("txtName");
	String sex = request.getParameter("selSex");
	String strEmail = request.getParameter("checkbox");
	String strHTML = "<div class='clsShow'>";	
	
	if(strName.equals("陶国荣") && sex.equals("男")){
		strHTML += "姓名：陶国荣<br>";
		strHTML += "性别：男<br>";
		if("1".equals(strEmail)){
			strHTML += "邮箱：tao_guo_rong@163.com<br>";
		}
	} else if(strName.equals("李健洲") && sex.equals("女")){
		strHTML += "姓名：李健洲<br>";
		strHTML += "性别：女<br>";
		if("1".equals(strEmail)){
			strHTML += "邮箱：xiaoli@163.com<br>";
		}
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

