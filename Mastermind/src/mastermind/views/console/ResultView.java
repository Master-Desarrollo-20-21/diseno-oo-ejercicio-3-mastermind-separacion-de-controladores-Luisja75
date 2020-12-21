package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.views.Message;
import mastermind.views.WithLogicView;
import utils.Console;

public class ResultView extends WithLogicView {
	
	public ResultView(Logic logic) {
		super (logic);
	}

	public void interact() {
		show();
	}

	private void show() {
		if (this.logic.isWin()) {
			Console.getInstance().writeln(Message.WINNER.getMessage());
		} else {
			Console.getInstance().writeln(Message.LOOSER.getMessage());
			Console.getInstance().write(Message.SECRET_COMBINATION.getMessage());
			new CombinationSecretView(this.logic).show();
		}
	}	
}
