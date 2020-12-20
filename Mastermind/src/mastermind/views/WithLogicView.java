package mastermind.views;

import mastermind.controllers.Logic;

public abstract class WithLogicView {

    protected Logic logic;

    public WithLogicView(Logic logic) {
        this.logic = logic;
    }
}
