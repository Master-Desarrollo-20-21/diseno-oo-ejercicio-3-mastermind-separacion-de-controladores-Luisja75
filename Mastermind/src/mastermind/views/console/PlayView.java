package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.views.Message;
import mastermind.views.WithLogicView;
import utils.Console;

public class PlayView extends WithLogicView {
	
	public PlayView(Logic logic) {
		super(logic);
	}

	public boolean interact() {
        CombinationProposedView combinationProposedView = new CombinationProposedView(logic);
        this.logic.addCombinationProposed(combinationProposedView.read());
        return this.logic.isFinish();
	}

	public void show() {
		Console.getInstance().writeln(Message.ATTEMPTS.getMessage().replace("#NumAttempt",  "" + this.logic.getCurrentAttempt()));
		new CombinationSecretView(this.logic).showSecret();
		for (int i=0; i<=this.logic.getCurrentAttempt()-1; i++) {
			new CombinationProposedView(this.logic).show(i);
	        Console.getInstance().writeln(Message.RESULT.getMessage().replace("#blacks", "" + this.logic.getNumBlacksAttemp(i))
	                .replace("#whites", "" + this.logic.getNumWhitesAttemp(i)));			
		}
	}
}
