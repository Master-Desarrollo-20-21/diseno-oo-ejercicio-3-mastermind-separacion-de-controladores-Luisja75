package mastermind.views.console;

import java.util.List;

import mastermind.controllers.Logic;
import mastermind.types.Color;
import mastermind.types.Error;
import mastermind.views.ErrorView;
import mastermind.views.Message;
import mastermind.views.WithLogicView;
import utils.Console;

public class CombinationProposedView extends WithLogicView {
		
	public CombinationProposedView(Logic logic) {
		super(logic);
	}
	
	public String read() {
        String characters = "";
        Error error;        
        do {
            error = Error.NULL;
            Console.getInstance().writeln("");
            Console.getInstance().write(Message.PROPOSED_COMBINATION.getMessage());
            characters = Console.getInstance().readString();

            if (characters.length() != logic.getNumColorsCombination()) {
                error = Error.WRONG_LENGTH;
            } else {
                for (int i = 0; i < characters.length(); i++) {
                	if (this.hasColorIncorrect(characters.charAt(i))){
                        error = Error.WRONG_CHARACTERS;
                    } 
                }
            	if (this.hasColorDuplicate(characters)){
            		error = Error.DUPLICATED;
            	}       		
            }

            if (!error.isNull()) {
            	new ErrorView(error).show();
            	characters = "";
            }
        } while (!error.isNull());
        
        return characters;
	}
		
	private boolean hasColorDuplicate(String stringColors)
	{
		assert stringColors != null;
		
		for (int i=0; i < stringColors.length(); i++) {
			char character = stringColors.charAt(i);
			for (int j=i+1; j < stringColors.length(); j++) {
				if (character == stringColors.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean hasColorIncorrect(char character)
	{
		Color color = Color.getColor(character);
		return color.isNull();
	}	
	
	public void show(int numAttempt) {
		assert numAttempt >= 0;
		
		List<Color> colors = this.logic.getCombinationProposedAttemp(numAttempt).getColors();
		String list = "";
		for (Color color: colors)
		{
			list += color.getKeyword();
		}
		Console.getInstance().write(list);
	}	
}
