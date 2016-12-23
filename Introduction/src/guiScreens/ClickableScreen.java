package guiScreens;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import gui.Screen;
import guiCompononets.Clickable;
import guiCompononets.Visible;

public abstract class ClickableScreen extends Screen implements MouseListener {
	
	private ArrayList<Clickable> clickarray;

	public ClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);
		clickarray = new ArrayList<Clickable>();
		
		for(int i = 0; i < viewObjects.size(); i++){
			if(viewObjects.get(i) instanceof Clickable){
				clickarray.add((Clickable)viewObjects.get(i));
			}
		}
	}

	public abstract void initAllObjects(ArrayList<Visible> clickarray);

	@Override
	public void mouseClicked(MouseEvent arg0) {
		for(Clickable : clickarray){
			
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public MouseListener getMouseListener(){
		return this;
	}
	
	

}
