package tictactoe;

import java.util.ArrayList;

public class GameBoard {
	private int rowSize;
	private int colSize;
	public static char[][] board;
	
	public GameBoard() {
		this.rowSize = 3;
		this.colSize = 3;
		this.reset();
	}
	
	public void reset() {
		this.board = new char[rowSize][colSize];
		for(int i = 0; i < rowSize; i++) {
			for(int j = 0; j < colSize; j++) {
				this.board[i][j] = ' ';
			}
		}
	}
	
	public void place(int x, int y, Player player) {
		board[x][y] = player.characterEncodedSymbol;
	}
	
	@Override
	public String toString() {
		String stringVersionOfBoard = "";
		for(int i = 0; i < rowSize; i++) {
			stringVersionOfBoard += "| ";
			for(int j = 0; j < colSize; j++) {
				stringVersionOfBoard += this.board[i][j] + " | ";
			}
			stringVersionOfBoard += '\n';
		}
		
		return stringVersionOfBoard;
	}
	
	public boolean isGameOver() {
		
		//check horizontal rules
		if(board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][1] == board[0][2]) {
			if(board[0][0] != ' ' && board[0][1] != ' ' && board[0][2] != ' ')
				return true;
		} else if(board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][1] == board[1][2]) {
			if(board[1][0] != ' ' && board[1][1] != ' ' && board[1][2] != ' ')
				return true;
		} else if(board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][1] == board[2][2]) {
			if(board[2][0] != ' ' && board[2][1] != ' ' && board[2][2] != ' ')
				return true;
		}
		
		//check vertical rules
		if(board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[1][0] == board[2][0]) {
			if(board[0][0] != ' ' && board[1][0] != ' ' && board[2][0] != ' ')
				return true;
		} else if(board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[1][1] == board[2][1]) {
			if(board[0][1] != ' ' && board[1][1] != ' ' && board[2][1] != ' ')
				return true;
		} else if(board[0][2] == board[2][1] && board[0][2] == board[2][2] && board[2][1] == board[2][2]) {
			if(board[0][2] != ' ' && board[2][1] != ' ' && board[2][1] != ' ')
				return true;
		}
		
		//check diagonal rule
		if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] == board[2][2]) {
			if(board[0][0] != ' ' && board[1][1] != ' ' && board[2][2] != ' ')
				return true;
		}
		
		return false;							
	}
			
}
