package whackamole;

import java.util.ArrayList;
import java.util.List;

import guiCompononets.Action;
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
		Thread play = new Thread(this);
		play.start();
	}

	

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(350,220,100,40,"yeas ");
		timeLabel = new TextLabel(360,40,80,40,"30.0");
		viewObjects.add(player);
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
		//since this a timed game, we will use while loop
		//not necessary for untiemd games
		while(timeLeft > 0){
			updateTimer();
			updateAllMoles();
			appearNewMole();
		}
	}
	
	private void appearNewMole() {
		double chance = .1 *(60-timeLeft)/60;
		if(Math.random() < chance){
			 final MoleInterface mole = getAMole();
			 mole.setAppearanceTime((int)(500 + Math.random()*2000));
			 //tell then mole what to do when clicked
			 mole.setAction(new Action(){

				@Override
				public void act() {
					player.increaseScore(1);
					remove(mole);
					moles.remove(mole);
				}
			 });
			 addObject(mole);
			 moles.add(mole);
		}
		
	}



	private void updateAllMoles() {
		for(int i = 0; i < moles.size(); i++){
			MoleInterface m = moles.get(i);
			int screenTime = m.getAppearanceTime() - 100;
			m.setAppearanceTime(screenTime);
			if(m.getAppearanceTime() <= 0){
				remove(m); //remove from screen
				moles.remove(m);
				i--;
			}
		}
	}



	private void updateTimer() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timeLeft -= .1;
		//.1 is nto a clean number in binary
		//to fix output, use this formuula to round to nearrest 10th
		timeLabel.setText("" + (int)(timeLeft * 10)/10.0 );
	}



	public void changeText(String string){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	

}
