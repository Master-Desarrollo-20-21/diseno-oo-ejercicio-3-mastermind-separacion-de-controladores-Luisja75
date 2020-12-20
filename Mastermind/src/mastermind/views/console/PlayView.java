package mastermind.views.console;

import mastermind.controllers.PlayController;
import mastermind.views.Message;
import utils.Console;

public class PlayView {
	
	private PlayController playController;
	
	public PlayView(PlayController playController) {
		this.playController = playController;
	}

	public boolean interact() {
        CombinationProposedView combinationProposedView = new CombinationProposedView();
        this.playController.addCombinationProposed(combinationProposedView.read());
        return this.playController.isFinish();
	}

	public void show() {
		Console.getInstance().writeln(Message.ATTEMPTS.getMessage().replace("#NumAttempt",  "" + this.playController.getCurrentAttempt()));
		new CombinationSecretView(this.playController.getCombinationSecret()).showSecret();
		for (int i=0; i<=this.playController.getCurrentAttempt()-1; i++) {
			new CombinationProposedView(this.playController.getCombinationProposedAttemp(i)).show();
	        Console.getInstance().writeln(Message.RESULT.getMessage().replace("#blacks", "" + this.playController.getNumBlacksAttemp(i))
	                .replace("#whites", "" + this.playController.getNumWhitesAttemp(i)));			
		}
	}
}
