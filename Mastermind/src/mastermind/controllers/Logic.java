package mastermind.controllers;

import java.util.HashMap;
import java.util.Map;
import mastermind.models.Board;
import mastermind.models.State;
import mastermind.models.StateValue;

public class Logic {

	private State state;
    private Board board;
    private Map<StateValue, Controller> controllers;

    public Logic() {
		this.state = new State();
        this.board = new Board();
		this.controllers = new HashMap<>();
		this.controllers.put(StateValue.INITIAL, new StartController(this.board, this.state));
		this.controllers.put(StateValue.PLAY, new PlayController(this.board, this.state));
		this.controllers.put(StateValue.RESULT, new ResultController(this.board, this.state));
		this.controllers.put(StateValue.FINAL, new ResumeController(this.board, this.state));
		this.controllers.put(StateValue.EXIT, null);        
    }

	public Controller getController() {
		return this.controllers.get(this.state.getValueState());
	}
}
