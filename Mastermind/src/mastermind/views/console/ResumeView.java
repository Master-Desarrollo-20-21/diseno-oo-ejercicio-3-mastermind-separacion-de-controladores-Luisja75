package mastermind.views.console;

import mastermind.controllers.ResumeController;
import mastermind.views.Message;
import utils.YesNoDialog;

public class ResumeView {
		
	public boolean interact(ResumeController resumeController) {
        boolean newGame = new YesNoDialog(Message.RESUME.getMessage()).read();
		resumeController.resume(newGame);
		return newGame;        
	}
}
