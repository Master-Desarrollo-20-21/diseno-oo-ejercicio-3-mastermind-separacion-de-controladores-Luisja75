package mastermind.views.graphics;

import mastermind.controllers.Logic;
import mastermind.views.View;

public class GraphicsView extends View {

	private StartView startView;
	private PlayView playView;
	private ResultView resultView; 
	private ResumeView resumeView;

	public GraphicsView(Logic logic) {
		this.startView = new StartView();
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
