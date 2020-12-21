package mastermind.views.console;

import mastermind.controllers.ResultController;
import mastermind.views.Message;
import utils.Console;

public class ResultView {

	public void interact(ResultController resultController) {
		show(resultController);
	}

	private void show(ResultController resultController) {
		if (resultController.isWin()) {
			Console.getInstance().writeln(Message.WINNER.getMessage());
		} else {
			Console.getInstance().writeln(Message.LOOSER.getMessage());
			Console.getInstance().write(Message.SECRET_COMBINATION.getMessage());
			new CombinationSecretView().show(resultController);
		}
	}	
}
