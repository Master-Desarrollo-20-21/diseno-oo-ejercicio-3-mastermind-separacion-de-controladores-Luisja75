package mastermind.controllers;

import mastermind.models.Board;
import mastermind.models.State;

public class ResultController extends Controller {

	public ResultController(Board board, State state) {
		super(board, state);
	}
	
	public boolean isWin() {
		this.state.next();
		return this.board.isWin();
	}
	
    @Override
    public void accept(ControllerVisitor controllerVisitor) {
    	controllerVisitor.visit(this);
    }		
}
