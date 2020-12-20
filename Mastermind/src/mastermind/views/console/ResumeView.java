package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.views.Message;
import mastermind.views.WithLogicView;
import utils.Console;
import utils.YesNoDialog;

public class ResumeView extends WithLogicView {
		
	public ResumeView(Logic logic) {
		super(logic);
	}

	public boolean isResumed() {
		this.logic.reset();
        return new YesNoDialog(Message.RESUME.getMessage()).read();
	}
	
	public void showResult() {
		if (this.logic.isWin()) {
			Console.getInstance().writeln(Message.WINNER.getMessage());
		} else {
			Console.getInstance().writeln(Message.LOOSER.getMessage());
			Console.getInstance().write(Message.SECRET_COMBINATION.getMessage());
			new CombinationSecretView(this.logic).show();
		}
	}
}
