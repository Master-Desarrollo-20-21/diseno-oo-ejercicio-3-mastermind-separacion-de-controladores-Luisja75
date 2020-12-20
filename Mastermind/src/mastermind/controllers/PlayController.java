package mastermind.controllers;

import mastermind.models.Attempt;
import mastermind.models.Board;
import mastermind.models.CombinationProposed;
import mastermind.models.CombinationSecret;

public class PlayController extends Controller {
	
	public PlayController(Board board) {
		super(board);
	}
	
	public void addCombinationProposed(CombinationProposed combinationProposed) {
		this.board.addCombinationProposed(combinationProposed);
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
	
	private Attempt getAttempt(int i) {
		return this.board.getAttempt(i);
	}
	
	public CombinationProposed getCombinationProposedAttemp(int i) {
		Attempt attempt = this.getAttempt(i);
		return attempt.getCombinationProposed();
	}
	
	public int getNumBlacksAttemp(int i) {
		Attempt attempt = this.getAttempt(i);
		return attempt.getNumBlacks();
	}

	public int getNumWhitesAttemp(int i) {
		Attempt attempt = this.getAttempt(i);
		return attempt.getNumWhites();
	}
}
