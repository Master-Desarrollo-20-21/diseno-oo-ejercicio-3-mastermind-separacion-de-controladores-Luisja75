package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.views.Message;
import mastermind.views.WithLogicView;
import utils.Console;

public class AttemptView extends WithLogicView {
	
	public AttemptView(Logic logic) {
		super (logic);
	}
	
	public void showCurrent() {
		Console.getInstance().writeln(Message.ATTEMPTS.getMessage().replace("#NumAttempt",  "" + this.logic.getCurrentAttempt()));
	}
	
	public void showResult(int numAttempt) {
        Console.getInstance().writeln(Message.RESULT.getMessage().replace("#blacks", "" + this.logic.getNumBlacksAttempt(numAttempt))
                .replace("#whites", "" + this.logic.getNumWhitesAttempt(numAttempt)));			
	}	
}
