package mastermind.views;

public abstract class View {
	
	public void interact() {
		do {
			this.start();
			this.play();
			this.showResult();					
		} while(this.isResumed());
	}

	private void play() {
		boolean finished;
		do {
			finished = this.interactBoard();
		} while (!finished);
	}

	protected abstract void start();

    protected abstract boolean interactBoard();
    
    protected abstract void showResult();
    
    protected abstract boolean isResumed();
}
