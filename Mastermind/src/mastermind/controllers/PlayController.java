package mastermind.controllers;

import mastermind.models.Attempt;
import mastermind.models.Board;
import mastermind.models.CombinationProposed;
import mastermind.models.CombinationSecret;
import mastermind.models.State;

public class PlayController extends Controller {
	
	public PlayController(Board board, State state) {
		super(board, state);
	}
	
	public void addCombinationProposed(String characters) {
		this.board.addCombinationProposed(new CombinationProposed(characters));
	}
	
	public boolean isFinish() {
		boolean isFinish = this.board.isFinish();
		if (isFinish) {
			this.state.next();
		}
		return isFinish;
	}
	
	public CombinationSecret getCombinationSecret() {
		return this.board.getCombinationSecret();
	}
		
	private Attempt getAttempt(int numAttempt) {
		assert numAttempt >= 0;
		
		return this.board.getAttempt(numAttempt);
	}
	
	public CombinationProposed getCombinationProposedAttemp(int numAttempt) {
		Attempt attempt = this.getAttempt(numAttempt);
		return attempt.getCombinationProposed();
	}
	
	public int getNumBlacksAttempt(int numAttempt) {
		Attempt attempt = this.getAttempt(numAttempt);
		return attempt.getNumBlacks();
	}

	public int getNumWhitesAttempt(int numAttempt) {
		Attempt attempt = this.getAttempt(numAttempt);
		return attempt.getNumWhites();
	}	
}
