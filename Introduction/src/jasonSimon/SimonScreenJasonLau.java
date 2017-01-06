package jasonSimon;

import java.util.ArrayList;
import java.util.List;

import guiCompononets.TextLabel;
import guiCompononets.Visible;
import guiScreens.ClickableScreen;
import whackamole.MoleInterface;
import whackamole.PlayerInterface;

public class SimonScreenJasonLau extends ClickableScreen implements Runnable {
	
	public ProgressInterfaceJasonLau prog;
	public ArrayList<MoveInterfaceJasonLau> seq;
	public int round;
	public boolean inputAccepted;


	public SimonScreenJasonLau(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub

	}

}
