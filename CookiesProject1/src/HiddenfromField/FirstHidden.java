package HiddenfromField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstHidden
 */
@WebServlet("/FirstHidden")
public class FirstHidden extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		out.println("<form action='SecondHidden'>");
		out.println(" <input type='hidden' name='user' value='"+user+"'>");
		out.println("<input type='submit' value='submit'>");
		out.println("</form>");
	}

}
