package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.views.WithLogicView;

public class PlayView extends WithLogicView {
	
	public PlayView(Logic logic) {
		super(logic);
	}
	
	public boolean interact() {
        CombinationProposedView combinationProposedView = new CombinationProposedView(logic);
        this.logic.addCombinationProposed(combinationProposedView.read());
        this.show();
        return this.logic.isFinish();
	}

	public void show() {
		AttemptView attemptView = new AttemptView(this.logic);
		attemptView.showCurrent();
		new CombinationSecretView(this.logic).showSecret();
		for (int i=0; i<=this.logic.getCurrentAttempt()-1; i++) {
			new CombinationProposedView(this.logic).show(i);
			attemptView.showResult(i);
		}
	}
}
