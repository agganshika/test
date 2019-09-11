package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init()throws ServletException{
		super.init();
		System.out.println("inside init method");
	}
       
    
    public LifeCycle() {
      System.out.println("creating object of lifecycle");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	System.out.println("Lifecycle servlet get called");
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	out.println("<b>LifeCycle Servlet get called..");
	out.println("<br>Refresh the page");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	public void destroy() {
		System.out.println("Destroying....");
		super.destroy();
	}

}
