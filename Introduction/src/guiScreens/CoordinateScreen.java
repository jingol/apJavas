package guiScreens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import guiCompononets.Action;
import guiCompononets.Button;
import guiCompononets.TextLabel;
import guiCompononets.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{
	
	private Button theButton;
	private TextLabel text;

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		theButton = new Button(20,100,80,40,"Button",new Color(100,100,250), new Action() {
			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		TextLabel text = new TextLabel(20, 200, 500, 40, "Some Text");
		viewObjects.add(text);
		viewObjects.add(theButton);
	}

	@Override
	public void mouseDragged(MouseEvent e){
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mx = e.getX(); //get mouse x coord
		int my = e.getY(); //get moust y coord
		text.setText("Mouse at " + mx + ", " + my);
		
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	
	
}
