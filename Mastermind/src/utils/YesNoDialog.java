package utils;

public class YesNoDialog {

	private static final char AFIRMATIVE = 'y';
	private static final char NEGATIVE = 'n';
	private static final String QUESTION = "? ("+YesNoDialog.AFIRMATIVE+"/"+YesNoDialog.NEGATIVE+"): ";
	private static final String MESSAGE = "The value must be '" + YesNoDialog.AFIRMATIVE + "' or '" + YesNoDialog.NEGATIVE + "'";
	
	private String title;

	public YesNoDialog(String title) {
		this.title = title;
	}
	
	public boolean read() {
		assert title != null;
		
		char answer;
		boolean ok;
		do {
			answer = Console.getInstance().readChar(this.title + YesNoDialog.QUESTION);
			ok = YesNoDialog.isAfirmative(answer) || YesNoDialog.isNegative(answer);
			if (!ok) {
				Console.getInstance().writeln(YesNoDialog.MESSAGE);
			}
		} while (!ok);
		return YesNoDialog.isAfirmative(answer);
	}

	private static boolean isAfirmative(char answer) {
		return Character.toLowerCase(answer) == YesNoDialog.AFIRMATIVE;
	}

	private static boolean isNegative(char answer) {
		return Character.toLowerCase(answer) == YesNoDialog.NEGATIVE;
	}
}
