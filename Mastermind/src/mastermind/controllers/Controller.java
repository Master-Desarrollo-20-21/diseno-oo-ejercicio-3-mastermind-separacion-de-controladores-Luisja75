package mastermind.controllers;

import java.util.List;

import mastermind.models.Board;
import mastermind.models.Combination;
import mastermind.types.Color;

public abstract class Controller {

    protected Board board;

    public Controller(Board board) {
        this.board = board;
    }
    
	public int getNumColorsCombination() {
		return Combination.NUMBER_COLORS;
	}
 
	public List<Color> getCombinationSecretColors() {
		return this.board.getCombinationSecret().getColors();
	}	
}
