<%@page import="com.regnant.customer.SchemeBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>your status</h2>
<table STYLE="border:3px solid gray">
<tr>
<th ><b>Id</b></th>
<th ><b>Name</b></th>
<th ><b>Scheme Type</b></th>
<th ><b>Months to be paid</b></th>
<th ><b>months pending</b></th>
<th ><b>Status</b></th>


</tr>
<%
List<SchemeBean> sl = (List<SchemeBean>) request.getAttribute("abcd");
for (SchemeBean s : sl) {
%>
<tr>

<td><%=s.getId()%></td>
<td><%=s.getName()%></td>
<td><%=s.getSchemeType()%></td>
<td><%=s.getMonthsPaid() %></td>
<td><%=s.getMonthsPending() %></td>
<td><%=s.getStatus() %></td>
</tr>
<%
}
%>

</table>

</body>
</html>