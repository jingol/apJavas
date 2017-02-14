package jasonSimon;

import java.util.ArrayList;

import gui.GUIApplication;

public class SimonGameJasonLau extends GUIApplication {
	
	public SimonGameJasonLau(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		SimonGameJasonLau sim = new SimonGameJasonLau(800,650);
		Thread game = new Thread(sim);
		game.start();
	}

	@Override
	public void initScreen() {
		SimonScreenJasonLau ss = new SimonScreenJasonLau(getWidth(),getHeight());
		setScreen(ss);
	}

}
