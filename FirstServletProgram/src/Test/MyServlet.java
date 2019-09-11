package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		System.out.println("Get method called");
		doPost(req,res);
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		/*String str=req.getParameter("name");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("<Welcome page>");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Welcome "+str+" </h1>");
		out.println("</body>");
		out.println("</html>");
		System.out.println("Post method called");*/
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		int sum=a+b;
		out.println("<h1>SuM IS "+sum+" </h1>");
	}
}
