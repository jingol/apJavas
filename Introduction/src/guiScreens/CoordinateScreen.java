package guiScreens;

import java.util.ArrayList;

import gui.Screen;
import guiCompononets.Button;
import guiCompononets.TextLabel;
import guiCompononets.Visible;

public class CoordinateScreen extends Screen {
	
	private Button theButton;

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		TextLabel text = new TextLabel(20, 200, 500, 40, "Some Text");
		viewObjects.add(text);
		viewObjects.add(theButton);
	}
	
	
}
