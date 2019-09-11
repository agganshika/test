package LoginExample;


	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;



	public class Connect {

	
		 public static Connection getConnection ()
		{
		try(Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root",""))
		{Class.forName("com.mysql.jdbc.Driver"); 
		System.out.println("database");
			if(conn !=null)
			{
				System.out.println("Connected to the database");
			}
			else {
				System.out.println("failed to make connection");
			}
		}catch(SQLException e)
		{
			System.err.format("sql Status: %s\n%S",e.getSQLState(),e.getMessage());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		}
		
	}
	
