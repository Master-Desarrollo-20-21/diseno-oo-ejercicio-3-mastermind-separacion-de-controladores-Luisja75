package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.views.View;

public class ConsoleView extends View {

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;

	public ConsoleView(Logic logic) {
		this.startView = new StartView();
		this.playView = new PlayView(logic);
		this.resumeView = new ResumeView(logic);
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
