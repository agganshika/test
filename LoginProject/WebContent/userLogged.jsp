<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

      <head>
         <meta http-equiv="Content-Type" 
            content="text/html; charset=windows-1256">
         <title>   User Logged Successfully   </title>
      </head>
	
      <body>

         <center>
         <tr><td>
	<% String username = request.getParameter("un"); %>
<a>Welcome   <% out.println(username); %> User!!!! You have logged in.</a></td></tr>
         
         </center>

      </body>
	
   </html>