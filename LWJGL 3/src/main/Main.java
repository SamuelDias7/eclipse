package main;

public class Main {
	public Thread game;
	
	public void start() {
		game = new Thread("game");
		game.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().start();

	}

}
