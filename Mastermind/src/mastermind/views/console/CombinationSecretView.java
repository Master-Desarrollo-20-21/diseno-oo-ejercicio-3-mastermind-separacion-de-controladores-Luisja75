package mastermind.views.console;

import mastermind.controllers.Controller;
import mastermind.types.Color;
import mastermind.views.Message;
import utils.Console;

public class CombinationSecretView {
		
	public void show(Controller controller) {
		String list = "";
		for (Color color: controller.getCombinationSecretColors())
		{
			list += color.getKeyword();
		}
		Console.getInstance().writeln(list);
	}
	
	public void showSecret(Controller controller) {
		for (int i=0; i<controller.getNumColorsCombination(); i++)
		{
			Console.getInstance().write(Message.SECRET.getMessage());
		}
		Console.getInstance().writeln("");
	}
}
