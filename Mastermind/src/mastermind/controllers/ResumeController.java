package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.CombinationSecret;
import mastermind.models.State;

public class ResumeController extends Controller {
	public ResumeController(Board board, State state) {
		super(board, state);
	}
	
	public void resume(boolean newGame) {
		if (newGame) {
			this.board.reset();
			this.state.reset();
		} else {
			this.state.next();
		}
	}	
		
	public CombinationSecret getCombinationSecret() {
		return this.board.getCombinationSecret();	
	}
	
    @Override
    public void accept(ControllerVisitor controllerVisitor) {
    	controllerVisitor.visit(this);
    }	
}
