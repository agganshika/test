package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 String name=request.getParameter("user");
		 String pwd=request.getParameter("pwd");
		 
		 if(name.equals("monika")) {
			 out.print("welcome"+name);
			 HttpSession s=request.getSession(true);
			 
			 s.setAttribute("user",name);
			 s.setMaxInactiveInterval(30);
			 response.sendRedirect("Home.jsp");
		 }
		 else {
			 RequestDispatcher dispatcher=request.getRequestDispatcher("Login.html");
			 out.println("<font color=red> Either user name or password is wrong</font>");
			 dispatcher.include(request, response);
		 }
		 
	}

}
