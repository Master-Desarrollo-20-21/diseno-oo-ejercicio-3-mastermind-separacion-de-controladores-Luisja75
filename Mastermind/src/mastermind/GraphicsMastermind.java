package mastermind;

import mastermind.controllers.PlayController;
import mastermind.controllers.ResumeController;
import mastermind.views.View;
import mastermind.views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind{

	@Override
	protected View createView(PlayController playController, ResumeController resumeController) {
		return new GraphicsView(playController, resumeController);
	}
	
	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}	
}
