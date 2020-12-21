package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.views.Message;
import mastermind.views.WithLogicView;
import utils.Console;

public class StartView extends WithLogicView {
	
	public StartView(Logic logic) {
		super(logic);
	}
	
	public void interact() {
		Console.getInstance().writeln(Message.TITLE.getMessage());	
		new AttemptView(this.logic).showCurrent();
		new CombinationSecretView(this.logic).showSecret();
	}
}
