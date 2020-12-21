package mastermind.views.console;

import mastermind.controllers.PlayController;

public class PlayView {

	public boolean interact(PlayController playController) {
        CombinationProposedView combinationProposedView = new CombinationProposedView(playController);
        playController.addCombinationProposed(combinationProposedView.read());
        this.show(playController);
        return playController.isFinish();
	}

	public void show(PlayController playController) {
		AttemptView attemptView = new AttemptView();
		attemptView.showCurrent(playController);
		new CombinationSecretView().showSecret(playController);
		for (int i=0; i<=playController.getCurrentAttempt()-1; i++) {
			new CombinationProposedView(playController).show(i);
			attemptView.showResult(playController, i);
		}
	}
}
