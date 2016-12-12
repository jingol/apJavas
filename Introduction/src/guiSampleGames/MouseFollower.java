package guiSampleGames;

import gui.GUIapp;
import guiScreens.CoordinateScreen;

public class MouseFollower extends GUIapp {
	
	private CoordinateScreen cs;

	public MouseFollower(int width, int height){
		super(width,height);
	}

	public void initScreen(){
		cs = new CoordinateScreen(getWidth(),getHeight());
		setScreen(cs);
	}
	
	public static void main(String[] args){
		new MouseFollower(800,600);	
	}



}
