package product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class productController
 */
@WebServlet("/productController")
public class productController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String pname= request.getParameter("proname");
		int quant=Integer.parseInt(request.getParameter("quantity"));
		//int price= Integer.parseInt(request.getParameter("price"));
		int price=0;
		if((quant)!=0) {
			
			 switch (pname) {
	         case "Soap":
	           price = 50*quant;
	           break;
	         case "Tooth Paste":
	        	 price = 50*quant;
		   break;
	         case "Pen":
	          price = 50*quant;
	           break;
	         case "Copy":
	           price = 50*quant;
	           break;
	         case "Book":
	           price = 50*quant;
	           break;
	         
			 }  
			RequestDispatcher rs= request.getRequestDispatcher("productcal.jsp?pn="+pname+"&tprice="+price);
			rs.include(request, response);
			 
		}
		else {
			RequestDispatcher rd= request.getRequestDispatcher("productinfo.html");
			out.println("<font color=RED> Fields can not be empty");
			rd.include(request, response);
		}
	}

}
