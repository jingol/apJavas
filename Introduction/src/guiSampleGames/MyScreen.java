package guiSampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.ClickableGraphic;
import gui.components.Graphic;
import gui.components.Visible;

public class MyScreen extends Screen implements MouseListener,MouseMotionListener {
	
	private Graphic Vicki;
	private Button myButton;
	private ClickableGraphic clicks;

	public MyScreen(int width, int height) {
		super(width, height);		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		Vicki = new Graphic(80,30,100,100, "resources/sampleImages/vicki.png");
		viewObjects.add(Vicki);
		
//		clicks = new ClickableGraphic(100,70,100,150, "resources/sampleImages/downn.jpg", new Action() {
//			
//			@Override
//			public void act() {
//				int xmove = (int) (Math.random() * 10);
//				int ymove = (int) (Math.random() * 10);
//				int dir = (int) (Math.random() * 2);
//				if(dir == 0){
//					clicks.x =- xmove;
//					clicks.y =- ymove;
//				}
//				else{
//					clicks.x =+ xmove;
//					clicks.y =+ ymove;
//				}
//			}
//		});
//		viewObjects.add(clicks);
		

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(clicks.isHovered(e.getX(),e.getY())){
			clicks.act();
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
