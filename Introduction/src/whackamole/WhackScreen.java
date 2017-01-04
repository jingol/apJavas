package whackamole;

import java.util.ArrayList;
import java.util.List;

import guiCompononets.TextLabel;
import guiCompononets.Visible;
import guiScreens.ClickableScreen;

public class WhackScreen extends ClickableScreen implements Runnable{

	private ArrayList<MoleInterface> moles;
	 private PlayerInterface player;
	 private TextLabel label;
	 private TextLabel timeLabel;
	 private double timeLeft;

	
	public WhackScreen(int width, int height) {
		super(width, height);
		timeLeft = 30.0;
	}

	

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(350,220,100,40,"yeas ");
		timeLabel = new TextLabel(360,40,80,40,"30.0");
//		viewObjects.add(player);
		viewObjects.add(timeLabel);
		viewObjects.add(label);
	}



	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		
	}
	
	public PlayerInterface getAPlayer(){
		return null;
		//placeholder until partner works
	}
	
	public MoleInterface getAMole(){
		return null;
	}



	@Override
	public void run() {
		changeText("Ready...");
		changeText("Set...");
		changeText("Go!");
		label.setText(" " );
	}
	
	public void changeText(String string){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	

}
