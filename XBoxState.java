/*
 * Copyright Douglas Wendel 2020
 * The xbox state class is just like the nintendo state class that stores the games on the xbox,
 * allos you to go to the home screen, startup the nintendo device, and to select the game
 * youd like to play. 
 */
public class XBoxState implements State {
	private GameConsole gameConsole;

	String[] games = {" Call of Duty "," GTA5 "," Sonic The Hedge Hog "," Surfing ", " Fortnite "};
	
	public XBoxState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	public void pressHomeButton() {
		System.out.println("Display Home Screen.");
		gameConsole.setState(gameConsole.getHomeState());
	}
	
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo...\n");
		gameConsole.setState(gameConsole.getNintendoState());
	}

	public void pressXBoxButton() {
		System.out.println("You are already viewing xBox....\n");
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
