package mastermind.views.console;

import mastermind.controllers.ResumeController;
import mastermind.views.Message;
import utils.Console;
import utils.YesNoDialog;

public class ResumeView {
	private ResumeController resumeController;
	
	public ResumeView(ResumeController resumeController) {
		this.resumeController = resumeController;
	}

	public boolean isResumed() {
		this.resumeController.reset();
        return new YesNoDialog(Message.RESUME.getMessage()).read();
	}
	
	public void showResult() {
		if (this.resumeController.isWin()) {
			Console.getInstance().writeln(Message.WINNER.getMessage());
		} else {
			Console.getInstance().writeln(Message.LOOSER.getMessage());
			Console.getInstance().write(Message.SECRET_COMBINATION.getMessage());
			new CombinationSecretView(this.resumeController.getCombinationSecret()).show();
		}
	}
}
