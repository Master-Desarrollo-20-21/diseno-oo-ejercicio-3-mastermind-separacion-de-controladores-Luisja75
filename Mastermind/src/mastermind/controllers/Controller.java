package mastermind.controllers;

import mastermind.models.Board;

public abstract class Controller {

    protected Board board;

    public Controller(Board board) {
        this.board = board;
    }    
}
