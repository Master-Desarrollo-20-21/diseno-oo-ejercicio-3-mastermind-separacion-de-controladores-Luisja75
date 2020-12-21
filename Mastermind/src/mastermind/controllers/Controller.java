package mastermind.controllers;

import java.util.List;

import mastermind.models.Board;
import mastermind.models.Combination;
import mastermind.models.State;
import mastermind.types.Color;

public abstract class Controller {

    protected Board board;
    protected State state;

    public Controller(Board board, State state) {
        this.board = board;
        this.state = state;
    }
    
    public List<Color> getCombinationSecretColors() {
    	return this.board.getCombinationSecret().getColors();
    }
    
    public int getNumColorsCombination() {
    	return Combination.NUMBER_COLORS;
    }
    
	public int getCurrentAttempt() {
		return this.board.getCurrentAttempt();
	}    
	
    public abstract void accept(ControllerVisitor controllerVisitor);	
}
