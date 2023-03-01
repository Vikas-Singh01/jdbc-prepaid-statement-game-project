package jdbc_prepaid_statement_game.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GameConnection 
{
	public static Connection gameConnection()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc-prepaid-statement-game";
			String user="root";
			String password="159357";
			Connection connection=DriverManager.getConnection(url, user, password);
			if(connection!=null)
			{
				return connection;
			}
			else
			{
				System.out.println("you have entered wrong url or user or password");	
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
