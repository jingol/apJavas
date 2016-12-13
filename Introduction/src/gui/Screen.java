package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import guiCompononets.Visible;

public abstract class Screen {
	
	private BufferedImage image;
	private ArrayList<Visible> viewObjects;

	public Screen(int width,int height) {
		initImage(width,height);
		initObjects(viewObjects);
		viewObjects = new ArrayList<Visible>();
	}
	
	public abstract void initObjects(ArrayList<Visible> viewObjects);


	public void initImage(int width, int height) {
		image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		update();
	}
	
	public BufferedImage getImage(){
		return image;
	}

	public int getWidth(){
		return image.getWidth();
	}
	
	public int getHeight(){
		return image.getHeight();
	}
	
	public void update() {
		Graphics2D g = image.createGraphics();
		
		//smooth the graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.setColor(Color.pink);
		g.fillRect(0, 0,image.getWidth(),image.getHeight());
		g.setColor(Color.black);
		g.drawString("Hello world!" , 40, 100);
		g.drawOval(20, 70, 100, 50);
//		for(int i = 0; i < viewObjects.size(); i++){
//			
//		}
		for(Visible v: viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
		
	}
	
//	//			ABSTRACTION
//	// interface - implement as many interfaces as you want
//		description of methods
//		
//		Abstract class- extends only one class. 
//		Description of methods
//		methods- only useful to subclasses that inherit the class.
//	

}
