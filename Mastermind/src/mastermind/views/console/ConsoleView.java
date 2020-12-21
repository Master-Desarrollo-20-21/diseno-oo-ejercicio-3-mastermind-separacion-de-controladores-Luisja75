package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.views.View;

public class ConsoleView extends View {

	private StartView startView;
	private PlayView playView;
	private ResultView resultView;
	private ResumeView resumeView;

	public ConsoleView(Logic logic) {
		this.startView = new StartView(logic);
		this.playView = new PlayView(logic);
		this.resultView = new ResultView(logic);
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
    protected void showResult() {
		this.resultView.interact();
	}
    
	@Override
    protected boolean isResumed() {
		return this.resumeView.interact();
	}	
}
