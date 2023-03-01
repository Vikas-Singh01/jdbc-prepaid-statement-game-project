package jdbc_prepaid_statement_game.dto;

public class GameDto 
{
	private int gameId;
	private String gameSize;
	private String gameName;
	private String gameDeveloper;
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameSize() {
		return gameSize;
	}
	public void setGameSize(String gameSize) {
		this.gameSize = gameSize;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameDeveloper() {
		return gameDeveloper;
	}
	public void setGameDeveloper(String gameDeveloper) {
		this.gameDeveloper = gameDeveloper;
	}
	
	
}
