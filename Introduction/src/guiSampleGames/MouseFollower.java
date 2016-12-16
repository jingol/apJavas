package guiSampleGames;

import gui.GUIapp;
import guiScreens.CoordinateScreen;

public class MouseFollower extends GUIapp {
	
	private CoordinateScreen cs;
	public static MouseFollower game;

	public MouseFollower(int width, int height){
		super(width,height);
	}

	public void initScreen(){
		cs = new CoordinateScreen(getWidth(),getHeight());
		setScreen(cs);
	}
	
	public static void main(String[] args){
		game = new MouseFollower(800,600);	
		Thread app = new Thread(game);
	}



}
