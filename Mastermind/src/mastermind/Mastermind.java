package mastermind;

import mastermind.controllers.Controller;
import mastermind.controllers.Logic;
import mastermind.views.View;

public abstract class Mastermind { 

	private View view;
	private Logic logic;
	
	public Mastermind() {
		this.logic = new Logic();
		this.view = this.createView(logic);
	}
	
	protected abstract View createView(Logic logic);
	
	protected void play() {
		Controller controller;
		do {
			controller = this.logic.getController();
			this.view.interact(controller);
		} while (controller != null);
	}
}