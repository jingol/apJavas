package guiScreens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import guiCompononets.Action;
import guiCompononets.Button;
import guiCompononets.Graphic;
import guiCompononets.TextArea;
import guiCompononets.TextLabel;
import guiCompononets.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{
	
	private Button theButton;
	private TextLabel text;
	private TextArea area;
	private Graphic cocoon;

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		theButton = new Button(20,100,80,40,
				"The Button with a long name",new Color(100,100,250),
				new Action() {
			
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		viewObjects.add(theButton);
		text = 
				new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
		
		area = 
				new TextArea(20, 240, 500, 40, "shamalamadingdong i have crippling depression kekt");
		viewObjects.add(area);
		
		cocoon = new Graphic(30,30,100,100, "resources/sampleImages/vicki.png");
		viewObjects.add(cocoon);
		
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
	
	
}
