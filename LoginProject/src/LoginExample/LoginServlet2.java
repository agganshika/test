package LoginExample;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServlet2
 */
@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {   
	String un = request.getParameter("un");
    String pw = request.getParameter("pw");
	Statement stmt = null;
	ResultSet rs = null;


//Connect to mysql(mariadb) and verify username password

    try {
    	
    	
    	Class.forName("com.mysql.jdbc.Driver"); 
//loads driver
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root", "root"); // gets a new connection
        String searchQuery = "select * from users where username='" + un + "' AND password='" + pw + "'";

    	stmt = c.createStatement();
		rs = stmt.executeQuery(searchQuery);
		
        //PreparedStatement ps = c.prepareStatement(searchQuery);
      /*  ps.setString(3, un);
        ps.setString(4, pw);

        ResultSet rs = ps.executeQuery();
        
*/
		/*if(un==rs.getNString(3) && pw==rs.getNString(4)) {
		
		while(rs.next()) {
			
			System.out.println("First Name:"+rs.getString(1));
			System.out.println("Last Name:"+rs.getString(2));
			System.out.println("username:"+rs.getString(3));
			System.out.println("password:"+rs.getString(4));
			  response.sendRedirect("userLogged.jsp");
			 return;
		}*/
		String name=null;
		/*if(un==rs.getString(3) && pw==rs.getString(4)) {*/
        while (rs.next()) {
        
			System.out.println("First Name:"+rs.getString(1));
			System.out.println("Last Name:"+rs.getString(2));
			System.out.println("username:"+rs.getString(3));
			System.out.println("password:"+rs.getString(4));
			name=rs.getNString(1);
        	
            response.sendRedirect("userLogged.jsp?un="+name);
            return;
        
        }
        response.sendRedirect("invalidLogin.jsp");
        return;
		
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }

}
}
