<%@page import="com.regnant.organiser.SchemeBean"%>
<%@page import="com.regnant.organiser.DBCRUDOperations"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style>
th{border:1px solid black;color:#E67E22;border-radius:5;background-color:white;font-size: 20px;font-family:Consolas;padding: 20px;spacing:2px}
td{border:1px solid black;border-radius:5; color:black; font-size:20px;text-align:center;font-family:Consolas;padding: 20px}
tr{background-color:#ECECEC;}
table{margin-left:150px;}
body{background-color: #D4D6D7}
</style>


</head>
<body >
<nav class="navbar navbar-default" style="background-color:white">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="tscnew.html"><img src="TSClogonav.png" alt="LOGO"style="height:90px;width:400px;margin-top:-10px"></a>
    </div>
    <ul class="nav navbar-nav" style="float:right;margin-top:50px">
      <li><a href="tscnew.html" style= "color:#E67E22; font-size:16px">Home</a></li>
      <li><a href="#" style= "color:#E67E22; font-size:16px">Benifits</a></li>
      <li><a href="#" style= "color:#E67E22; font-size:16px">Schemes</a></li>
      <li><a href="#" style= "color:#E67E22; font-size:16px">Contact Us</a></li>
        </ul>
  </div>
</nav>
<form action="OrganiserLogout">
 <input Style="margin-left: 20px; background-color: white;border:1px solid gray;height:40px;width:150px;float:right;margin-right:20px;
 color:#E67E22;font-weight:bold; width:80px; border-radius: 20px;height"
			type="submit" value="logout"></form>
 
<h2 style="margin-left:630px">Customers in SCHEME-B</h2>
<br><br>

<table>

<tr>
<th ><b>&nbsp Id &nbsp</b></th>
<th ><b>&nbsp Name &nbsp</b></th>
<th ><b>&nbsp Scheme Type &nbsp</b></th>
<th ><b>&nbsp Months to be paid &nbsp</b></th>
<th ><b>&nbsp Months pending &nbsp</b></th>
<th ><b>&nbsp Status &nbsp</b></th>
<th ><b>&nbsp password &nbsp</b></th>


</tr>
<%
//List<SchemeBean> li = DBCRUDOperations.getSchemeTable();
 List<SchemeBean> sl = (List<SchemeBean>) request.getAttribute("SchemeB"); 
for (SchemeBean s : sl) {
%>
<tr>

<td><%=s.getId()%></td>
<td><%=s.getName()%></td>
<td><%=s.getSchemeType()%></td>
<td><%=s.getMonthsPaid() %></td>
<td><%=s.getMonthsPending() %></td>
<td><%=s.getStatus() %></td>
<td><%=s.getPassword()%></td>
</tr>
<%
}
%>

</table>

</body>
</html>