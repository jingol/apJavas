package guiSampleGames;

import gui.GUIapp;
import gui.screens.CoordinateScreen;

public class MouseFollower extends GUIapp {
	
	public static CoordinateScreen cs;
	public static MouseFollower game;
	public static MyScreen myscreen;

	public MouseFollower(int width, int height){
		super(width,height);
	}

	public void initScreen(){
		cs = new CoordinateScreen(getWidth(),getHeight());
		setScreen(cs);
		myscreen = new MyScreen(getWidth(),getHeight());
	}
	
	public static void main(String[] args){
		game = new MouseFollower(800,600);	
		Thread app = new Thread(game);
		app.start();
	}



}
