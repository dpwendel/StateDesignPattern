/*
 * Copyright Douglas Wendel 2020
 * The NintendoState class is the class that stores the games on the nintendo device and allows you to press the home button to display
 * the home screen, to initiate the nintendo console and start it, to then start the xbox by pressing that button, and to print the games
 * that are on the device.
 */
public class NintendoState implements State {
	private GameConsole gameConsole;
	
	String[] games = {" Super Smash Bros "," Super Mario Bros "," Pokemon "," Kirby ", " Tetris "};
	
	public NintendoState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	public void pressHomeButton() {
		System.out.println("Display Home Screen");
		gameConsole.setState(gameConsole.getHomeState());
	}
	
	public void pressNintendoButton() {
		System.out.println("You are already viewing Nintendo.");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	
	public void pressXBoxButton() {
		System.out.println("Starting xBox....");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	
	public void pressGameButton() {
		int size = games.length;
		System.out.println("You have the following games: ");
		for(int i = 0; i < size; ++i) {
			System.out.println(games[i]);
		}
		System.out.println();
	}

}
