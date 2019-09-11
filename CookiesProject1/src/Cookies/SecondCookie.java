package Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondCookie
 */
@WebServlet("/SecondCookie")
public class SecondCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		
		response.setContentType("text/html");
		String name=request.getParameter("user");
		String pass=request.getParameter("pwd");
		
		if(pass.equals("123")) {
			Cookie c=new Cookie("username",name);
			response.addCookie(c);
			response.sendRedirect("CookiesTest");
		}
		
		
	}

}
