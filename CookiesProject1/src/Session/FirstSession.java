package Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class FirstSession
 */
@WebServlet("/FirstSession")
public class FirstSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		response.setContentType("text/html");
		String name=request.getParameter("user");
		String pass=request.getParameter("pwd");
		
		if(pass.equals("1234")) {
			HttpSession sc=request.getSession();
			sc.setAttribute("user", name);
			response.sendRedirect("SecondSession");
		}
	}

}
