package tictactoe;

import java.util.ArrayList;

public class GameBoard {
	private int rowSize;
	private int colSize;
	public static boolean[][] board;
	
	public GameBoard() {
		this.rowSize = 3;
		this.colSize = 3;
		this.reset();
	}
	
	public void reset() {
		this.board = new boolean[rowSize][colSize];
	}
	
	public void place(Coordinates coordinates, Player player) {
		board[coordinates.x][coordinates.y] = player.isPlayerX;
	}
	
	@Override
	public String toString() {
		String stringVersionOfBoard = "";
		for(int i = 0; i < rowSize; i++) {
			stringVersionOfBoard += '|';
			for(int j = 0; j < colSize; j++) {
				stringVersionOfBoard += convertToPlayerType(this.board[i][j]) + " | ";
			}
			stringVersionOfBoard += '\n';
		}
		
		return stringVersionOfBoard;
	}
	
	private char convertToPlayerType(boolean playerSymbol) {
		return playerSymbol ? 'X' : 'Y';
	}
	
	private static class Coordinates{
		public int x;
		public int y;
		
		public Coordinates() {};
		public Coordinates(int X, int Y) {
			this.x = X;
			this.y = Y;
		};
		
	}
}
