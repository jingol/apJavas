package guiScreens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import guiCompononets.Action;
import guiCompononets.Button;
import guiCompononets.Graphic;
import guiCompononets.MovingComponent;
import guiCompononets.TextArea;
import guiCompononets.TextLabel;
import guiCompononets.Visible;
import guiSampleGames.MouseFollower;

public class CoordinateScreen extends Screen implements MouseMotionListener,MouseListener{
	
	private Button theButton;
	private TextLabel text;
	private TextArea area;
	private Graphic cocoon;

	public CoordinateScreen(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		theButton = new Button(20,60,200,40,
				"The Button",new Color(100,50,250),
				new Action() {
			
			public void act() {
				MouseFollower.game.setScreen(MouseFollower.myscreen);
				
			}
		});
		viewObjects.add(theButton);
		text = 
				new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
		
		area = 
				new TextArea(20, 240, 500, 40, "shamalamadingdong i have crippling depression kekt");
		viewObjects.add(area);
		
		MovingComponent c = new MovingComponent(20,20,100,100);
		viewObjects.add(c);
		c.setVx(2);
		c.setVy(3);
		c.play();
		
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();//get mouse X coordinate
		int my = e. getY();//get Y coord
		text.setText("Mouse at: "+mx +", "+my);
	}

	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	
	@Override
	public MouseListener getMouseListener(){
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(theButton.isHovered(e.getX(),e.getY())){
			theButton.act();
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
