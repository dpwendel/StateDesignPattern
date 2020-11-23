/*
 * Copyright Douglas Wendel 2020
 * The GameConsole basically is a class that creates new states, starts the console
 * and has the getters and setters for the program.
 */

public class GameConsole {
	
	private State homeState;
	private State nintendoState;
	private State xBoxState;
	private State state;
	
	public GameConsole() {
		homeState = new HomeState(this);
		nintendoState = new NintendoState(this);
		xBoxState = new XBoxState(this);
		state = homeState;
		System.out.println("Starting up the Game Console.\n");
	}
	public void pressHomeButton() {
		state.pressHomeButton();
		System.out.println();
	}
	public void pressNintendoButton() {
		state.pressNintendoButton();
	}
	
	public void pressXBoxButton() {
		state.pressXBoxButton();
	}
	public void pressGameButton() {
		state.pressGameButton();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	public State getHomeState() {
		return this.homeState;
	}
	
	public State getNintendoState() {
		return this.nintendoState;	
	}
	
	public State getXBoxState() {
		return this.xBoxState;
	}

}
