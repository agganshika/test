import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try (Connection conn = DriverManager.getConnection(
	               "jdbc:mysql://localhost:3306/niit", "root", "root")) 
			
				

				{ if (conn != null) {
	                Statement s=conn.createStatement();
					//s.execute("create table if not exist Student (Id integer)");
					System.out.println("Connected to the database!");
					s.execute("insert into Student values(101)");
				
	            } else {
	                System.out.println("Failed to make connection!");
	            }

	        
			}catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
   }
}