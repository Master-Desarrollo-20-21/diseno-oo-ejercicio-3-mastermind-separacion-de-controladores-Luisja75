package mastermind;

import mastermind.controllers.PlayController;
import mastermind.controllers.ResumeController;
import mastermind.models.Board;
import mastermind.views.View;

public abstract class Mastermind { 

	private View view;
	private Board board;
	private PlayController playController;
	private ResumeController resumeController;
	
	public Mastermind() {
		this.board = new Board();
		this.playController = new PlayController(board);
		this.resumeController = new ResumeController(board);
		
		this.view = this.createView(playController, resumeController);
	}
	
	protected abstract View createView(PlayController playController, ResumeController resumeController);
	
	protected void play() {
		view.interact();
	} 
}