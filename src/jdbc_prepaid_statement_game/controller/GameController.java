package jdbc_prepaid_statement_game.controller;

import java.util.Scanner;

import jdbc_prepaid_statement_game.dto.GameDto;
import jdbc_prepaid_statement_game.service.GameService;

public class GameController 
{
	public static void main(String[] args) 
	{
		GameDto dto=new GameDto();
		GameService service=new GameService();
		Scanner sc=new Scanner(System.in);
		while(true) 
		{
			System.out.println("1.Insert\n2.Update\n3.Delete\n4.Display\n5.Batch\n6.exit");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				{
					System.out.println("Enter the GameId");
					dto.setGameId(sc.nextInt());
					System.out.println("Enter the GameSize");
					dto.setGameSize(sc.next());
					System.out.println("Enter the GameName");
					dto.setGameName(sc.next());
					System.out.println("Enter the GameDeveloper");
					dto.setGameDeveloper(sc.next());
					service.insertGame(dto);
				}
				break;
			}
			
		}
	}
}
