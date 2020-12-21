package mastermind.views.graphics;

import mastermind.controllers.PlayController;

public class PlayView {
	
	public boolean interact(PlayController playController) {
        CombinationProposedView combinationProposedView = new CombinationProposedView(playController);
        playController.addCombinationProposed(combinationProposedView.read());
        return playController.isFinish();
	}

	public void show(PlayController playController) {
	}
}
