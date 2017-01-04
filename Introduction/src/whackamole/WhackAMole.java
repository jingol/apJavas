package whackamole;

import gui.GUIapp;

public class WhackAMole extends GUIapp {
	

	public WhackAMole(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		WhackScreen wams = new WhackScreen(getWidth(),getHeight());
		setScreen(wams);
	}

	public static void main(String[] args) {
		WhackAMole wam = new WhackAMole(800,500);
		Thread game = new Thread(wam);
		game.start();

	}

}
