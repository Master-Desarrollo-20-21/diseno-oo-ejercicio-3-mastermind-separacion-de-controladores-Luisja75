package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.views.Message;
import mastermind.views.WithLogicView;
import utils.YesNoDialog;

public class ResumeView extends WithLogicView {
		
	public ResumeView(Logic logic) {
		super(logic);
	}

	public boolean interact() {
		return isResumed();
	}
	
	private boolean isResumed() {
		this.logic.reset();
        return new YesNoDialog(Message.RESUME.getMessage()).read();
	}
}
