package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.CombinationSecret;

public class ResumeController extends Controller {
	public ResumeController(Board board) {
		super(board);
	}
	
	public void reset() {
		board.reset();
	}
	
	public boolean isWin() {
		return this.board.isWin();
	}
	
	public CombinationSecret getCombinationSecret() {
		return this.board.getCombinationSecret();	
	}	
}
