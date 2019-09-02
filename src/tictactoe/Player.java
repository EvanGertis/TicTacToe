package tictactoe;

public class Player {
	public char isPlayerX;
	public char characterEncodedSymbol;
	public int score;
	
	public Player(){};
	public Player(char IsPlayerX, int Score) {
		this.isPlayerX = IsPlayerX;
		this.score = 0;
		
		if(IsPlayerX == 'X') {
			this.characterEncodedSymbol = 'X';
		}
		else {
			this.characterEncodedSymbol = 'Y';
		}
	}
}
