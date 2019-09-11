<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
String pn=request.getParameter("pn");
int price=Integer.parseInt(request.getParameter("tprice"));
out.println("Your product name is: <font color=green>"+pn+" and product price is: "+price);
%>
