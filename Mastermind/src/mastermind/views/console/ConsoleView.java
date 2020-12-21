package mastermind.views.console;

import mastermind.controllers.Controller;
import mastermind.controllers.Logic;
import mastermind.controllers.PlayController;
import mastermind.controllers.ResultController;
import mastermind.controllers.ResumeController;
import mastermind.controllers.StartController;
import mastermind.views.View;

public class ConsoleView extends View {

	private StartView startView;
	private PlayView playView;
	private ResultView resultView;
	private ResumeView resumeView;

	public ConsoleView(Logic logic) {
		this.startView = new StartView();
		this.playView = new PlayView();
		this.resultView = new ResultView();
		this.resumeView = new ResumeView();
	}

    @Override
    public void interact(Controller controller) {
        controller.accept(this);
    }
    
	public void visit(StartController startController) {
		this.startView.interact(startController);
	}

	public void visit(PlayController playController) {
		this.playView.interact(playController);
	}

	public void visit(ResultController resultController) {
		this.resultView.interact(resultController);
	}

	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}
}
