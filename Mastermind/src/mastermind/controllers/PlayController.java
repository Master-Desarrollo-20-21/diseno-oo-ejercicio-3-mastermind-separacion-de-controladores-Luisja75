package mastermind.controllers;

import mastermind.models.Attempt;
import mastermind.models.Board;
import mastermind.models.CombinationProposed;
import mastermind.models.CombinationSecret;

public class PlayController extends Controller {
	
	public PlayController(Board board) {
		super(board);
	}
	
	public void addCombinationProposed(String characters) {
		this.board.addCombinationProposed(new CombinationProposed(characters));
	}
	
	public boolean isFinish() {
		return this.board.isFinish();
	}
	
	public CombinationSecret getCombinationSecret() {
		return this.board.getCombinationSecret();
	}
	
	public int getCurrentAttempt() {
		return this.board.getCurrentAttempt();
	}
	
	private Attempt getAttempt(int numAttempt) {
		assert numAttempt >= 0;
		
		return this.board.getAttempt(numAttempt);
	}
	
	public CombinationProposed getCombinationProposedAttemp(int numAttempt) {
		Attempt attempt = this.getAttempt(numAttempt);
		return attempt.getCombinationProposed();
	}
	
	public int getNumBlacksAttemp(int numAttempt) {
		Attempt attempt = this.getAttempt(numAttempt);
		return attempt.getNumBlacks();
	}

	public int getNumWhitesAttemp(int numAttempt) {
		Attempt attempt = this.getAttempt(numAttempt);
		return attempt.getNumWhites();
	}	
}
