package guiSampleGames;

import java.awt.Color;
import java.util.ArrayList;

import gui.Screen;
import guiCompononets.Action;
import guiCompononets.Button;
import guiCompononets.Graphic;
import guiCompononets.Visible;

public class MyScreen extends Screen {
	
	private Graphic Vicki;
	private Button myButton;

	public MyScreen(int width, int height) {
		super(width, height);		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		Vicki = new Graphic(80,30,100,100, "resources/sampleImages/vicki.png");
		viewObjects.add(Vicki);
		
		myButton = new Button(20,200,200,40,
				"The Button",new Color(50,150,250),
				new Action() {
			
			public void act() {
				MouseFollower.game.setScreen(MouseFollower.cs);
				
			}
		});
		
		viewObjects.add(myButton);
	}

}
