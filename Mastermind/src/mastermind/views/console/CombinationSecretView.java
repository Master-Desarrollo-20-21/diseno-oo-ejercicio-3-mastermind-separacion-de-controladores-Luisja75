package mastermind.views.console;

import mastermind.controllers.Logic;
import mastermind.types.Color;
import mastermind.views.Message;
import mastermind.views.WithLogicView;
import utils.Console;

public class CombinationSecretView extends WithLogicView {
	
	public CombinationSecretView(Logic logic) {
		super (logic);
	}
	
	public void show() {
		String list = "";
		for (Color color: logic.getCombinationSecretColors())
		{
			list += color.getKeyword();
		}
		Console.getInstance().writeln(list);
	}
	
	public void showSecret() {
		for (int i=0; i<logic.getNumColorsCombination(); i++)
		{
			Console.getInstance().write(Message.SECRET.getMessage());
		}
		Console.getInstance().writeln("");
	}
}
