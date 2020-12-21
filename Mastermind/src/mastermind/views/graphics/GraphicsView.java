package mastermind.views.graphics;

import mastermind.controllers.Controller;
import mastermind.controllers.Logic;
import mastermind.controllers.PlayController;
import mastermind.controllers.ResultController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.views.View;

public class GraphicsView extends View {

	private StartView startView;
	private PlayView playView;
	private ResultView resultView; 
	private ResumeView resumeView;

	public GraphicsView(Logic logic) {
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resultView = new ResultView();
		this.resumeView = new ResumeView();
	}
	
	@Override
	public void interact(Controller controller) {
		if (controller instanceof StartController) {
			this.startView.interact((StartController) controller);
		} else if (controller instanceof PlayController) {
			this.playView.interact((PlayController) controller);
		} else if (controller instanceof ResultController) {
			this.resultView.interact((ResultController) controller);
		} else if (controller instanceof ResumeController) {
			this.resumeView.interact((ResumeController) controller);
		}
	}	
}
