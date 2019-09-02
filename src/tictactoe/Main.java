package tictactoe;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		GameBoard gameBoard = new GameBoard();
		Scanner scanner = new Scanner(System.in);
		int turn = 0; 
		String choice = "";
		
		Player playerX = new Player('X', 0);
		Player playerY = new Player('Y', 0);
		
		System.out.println(gameBoard.toString());
		
		while(choice != "N") {
			do {
				
				if(turn == 0) {
					System.out.println("PlayerX-- score: " + playerX.score);
				} else {
					System.out.println("PlayerY-- score: " + playerY.score);
				}
				
				System.out.println("Please Enter the row: ");
				int row = Integer.parseInt(scanner.nextLine());
				System.out.println("Please Enter the column: ");
				int col = Integer.parseInt(scanner.nextLine());
				
				if(turn == 0) {
					gameBoard.place(row, col, playerX);
				} else {
					gameBoard.place(row, col, playerY);
				}
				System.out.println(gameBoard.toString());
				
				turn++;
				turn = turn % 2;
			}while(!gameBoard.isGameOver());
			
			System.out.println("Game over");
			System.out.println("Play again ? Y/N");
			choice = scanner.nextLine();
			
			if(turn == 0) {
				playerX.score++;
			} else {
				playerY.score++;
			}
			
			gameBoard.reset();
			turn++;
			turn = turn % 2;
		}
	}
}
