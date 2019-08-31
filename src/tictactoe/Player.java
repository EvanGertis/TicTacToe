package tictactoe;

public class Player {
	public boolean isPlayerX;
	public char characterEncodedSymbol;
	public int score;
	
	public Player(){};
	public Player(boolean IsPlayerX, int Score) {
		this.isPlayerX = IsPlayerX;
		this.score = 0;
		
		if(IsPlayerX) {
			this.characterEncodedSymbol = 'X';
		}
		else {
			this.characterEncodedSymbol = 'Y';
		}
	}
}
