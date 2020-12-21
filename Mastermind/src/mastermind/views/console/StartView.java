package mastermind.views.console;

import mastermind.controllers.StartController;
import mastermind.views.Message;
import utils.Console;

public class StartView  {
	
	public void interact(StartController startController) {
		startController.start();
		Console.getInstance().writeln(Message.TITLE.getMessage());	
		new AttemptView().showCurrent(startController);
		new CombinationSecretView().showSecret(startController);
	}
}
