package mastermind.views.graphics;

import mastermind.controllers.Logic;
import mastermind.views.WithLogicView;

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
		// TODO Auto-generated method stub
	}
}
