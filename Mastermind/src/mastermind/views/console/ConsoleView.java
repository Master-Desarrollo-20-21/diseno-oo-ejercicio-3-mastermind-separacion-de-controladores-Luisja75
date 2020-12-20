package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.controllers.ResumeController;
import mastermind.views.View;

public class ConsoleView extends View {

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;

	public ConsoleView(PlayController playController, ResumeController resumeController) {
		this.startView = new StartView();
		this.playView = new PlayView(playController);
		this.resumeView = new ResumeView(resumeController);
	}
		
	@Override
    protected void start() {
		this.startView.interact();
	}

	@Override
    protected boolean interactBoard() {
		return this.playView.interact(); 	
	}
    
	@Override
    protected void showBoard() {
		this.playView.show();
	}

	@Override
    protected void showResult() {
		this.resumeView.showResult();
	}
    
	@Override
    protected boolean isResumed() {
		return this.resumeView.isResumed();
	}	
}
