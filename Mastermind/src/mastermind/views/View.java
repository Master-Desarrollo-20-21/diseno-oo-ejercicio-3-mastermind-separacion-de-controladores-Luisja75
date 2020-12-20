package mastermind.views;

public abstract class View {
	
	public void interact() {
		do {
			this.start();
			this.showBoard();
			boolean finished;
			do {
				finished = this.interactBoard();
				this.showBoard();
			} while (!finished);
			this.showResult();					
		} while(this.isResumed());
	}
	
    protected abstract void start();

    protected abstract boolean interactBoard();
    
    protected abstract void showBoard();

    protected abstract void showResult();
    
    protected abstract boolean isResumed();
}
