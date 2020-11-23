//Copyright Douglas Wendel 2020
public class HomeState implements State {
	
	private GameConsole gameConsole;
	public HomeState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
		
	}
	public void pressHomeButton() {
		System.out.println("You are already on the home screen.");
		gameConsole.setState(gameConsole.getHomeState());
		
	}
	
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
		
	}
	
	public void pressXBoxButton() {
		System.out.println("Starting XBox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	
	public void pressGameButton() {
		System.out.println("You have to pick a console to play");
	}

}
