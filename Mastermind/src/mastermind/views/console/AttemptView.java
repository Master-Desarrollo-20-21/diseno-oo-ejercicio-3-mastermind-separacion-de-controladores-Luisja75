package mastermind.views.console;

import mastermind.controllers.Controller;
import mastermind.controllers.PlayController;
import mastermind.views.Message;
import utils.Console;

public class AttemptView {
		
	public void showCurrent(Controller controller) {
		Console.getInstance().writeln(Message.ATTEMPTS.getMessage().replace("#NumAttempt",  "" + controller.getCurrentAttempt()));
	}
	
	public void showResult(PlayController playController, int numAttempt) {
        Console.getInstance().writeln(Message.RESULT.getMessage().replace("#blacks", "" + playController.getNumBlacksAttempt(numAttempt))
				.replace("#whites", "" + playController.getNumWhitesAttempt(numAttempt)));			
	}	
}
