package jdbc_prepaid_statement_game.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc_prepaid_statement_game.connection.GameConnection;
import jdbc_prepaid_statement_game.dto.GameDto;

public class GameDao
{
	Connection connection=GameConnection.gameConnection();
	public void insertGame(GameDto game)
	{
		String insert="insert into game values(?,?,?,?)";
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(insert);
			preparedStatement.setInt(1,game.getGameId());
			preparedStatement.setString(2,game.getGameSize());
			preparedStatement.setString(3,game.getGameName());
			preparedStatement.setString(4,game.getGameDeveloper());
			preparedStatement.execute();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}
	public void updateGame(int id,String name,String size)
	{
		String update="update game set name=?,size=? where id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(update);
			preparedStatement.setString(1,name);
			preparedStatement.setString(2,size);
			preparedStatement.setInt(3,id);
			preparedStatement.executeUpdate();
			System.out.println("data updated");
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
