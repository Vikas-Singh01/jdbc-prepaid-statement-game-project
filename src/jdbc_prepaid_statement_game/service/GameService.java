package jdbc_prepaid_statement_game.service;

import jdbc_prepaid_statement_game.dao.GameDao;
import jdbc_prepaid_statement_game.dto.GameDto;

public class GameService 
{
	GameDao dao=new GameDao();
	public void insertGame(GameDto game)
	{
		dao.insertGame(game);
	}
	public void updateGame(int id,String name,String size)
	{
		dao.updateGame(id, name, size);
	}
}
