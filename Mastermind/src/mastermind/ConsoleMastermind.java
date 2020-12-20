package mastermind;

import mastermind.controllers.PlayController;
import mastermind.controllers.ResumeController;
import mastermind.views.View;
import mastermind.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind{

	@Override
	protected View createView(PlayController playController, ResumeController resumeController) {
		return new ConsoleView(playController, resumeController);
	}
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}	
}
