package mastermind.controllers;

import java.util.List;

import mastermind.models.Board;
import mastermind.models.Combination;
import mastermind.models.CombinationProposed;
import mastermind.types.Color;

public class Logic {

    private Board board;
    private PlayController playController;
    private ResumeController resumeController;

    public Logic() {
        this.board = new Board();
        this.playController = new PlayController(this.board);
        this.resumeController = new ResumeController(this.board);
    }
    
    public void reset() {
    	this.resumeController.reset();
    }
    
    public Boolean isWin() {
    	return this.resumeController.isWin();
    }
    
    public List<Color> getCombinationSecretColors() {
    	return this.board.getCombinationSecret().getColors();
    }
    
    public int getNumColorsCombination() {
    	return Combination.NUMBER_COLORS;
    }
    
    public void addCombinationProposed(String characters) {
    	this.playController.addCombinationProposed(characters);
    }
    
    
    public Boolean isFinish() {
    	return this.playController.isFinish();
    }

    public int getCurrentAttempt() {
    	return this.playController.getCurrentAttempt();
    }

    public int getCurrentAttempt(int numAttempt) {
    	return this.playController.getNumWhitesAttemp(numAttempt);
    }
 
    public int getNumBlacksAttemp(int numAttempt) {
    	return this.playController.getNumBlacksAttemp(numAttempt);
    }
    
    public int getNumWhitesAttemp(int numAttempt) {
    	return this.playController.getNumWhitesAttemp(numAttempt);
    }
    
    public CombinationProposed getCombinationProposedAttemp(int numAttempt) {
    	return this.playController.getCombinationProposedAttemp(numAttempt);
    }
}
