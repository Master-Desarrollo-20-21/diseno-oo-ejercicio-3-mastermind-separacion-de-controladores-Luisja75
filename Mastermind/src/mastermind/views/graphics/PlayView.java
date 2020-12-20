package mastermind.views.graphics;

import mastermind.controllers.PlayController;

public class PlayView {
	private PlayController playController;
	
	public PlayView(PlayController playController) {
		this.playController = playController;
	}

	public boolean interact() {
        CombinationProposedView combinationProposedView = new CombinationProposedView(playController);
        this.playController.addCombinationProposed(combinationProposedView.read());
        return this.playController.isFinish();
	}

	public void show() {
		// TODO Auto-generated method stub
	}
}
