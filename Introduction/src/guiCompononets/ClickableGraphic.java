package guiCompononets;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class ClickableGraphic implements Clickable,Visible{

	private BufferedImage image;
	private Action action;
	public int x;
	public int y;
	private int w;
	private int h;
	private boolean loadedImages;

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation, Action action) {
		this.x = getX();
		this.y = getY();
		this.action = action;
		loadedImages = false;
		loadImages(imageLocation,0,0);
	}

	private void loadImages(String imageLocation, int i, int j) {
		try{
			//fullsize image
			ImageIcon icon = new ImageIcon(imageLocation);
			
			if(w <= 0 && h <= 0){
				//use fullsize icon
				image = new BufferedImage(icon.getIconWidth(),icon.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
				//use the graphics 2d tool to copy the icon
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, null);
			}
			else{
				//use custome size icon
				image = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				//this is how to crop
				/** image to draw
				 * xCoord of destination
				 * yCoord of destination
				 * width of destination
				 * height of destination
				 * x of target
				 * ycoord of target
				 * width of targer
				 * height of target
				 * null
				 */
				
				g.drawImage(icon.getImage(),0,0, w,h,0,0,icon.getIconWidth(),icon.getIconHeight(),null);
			}
			loadedImages = true;
		}catch(Exception e){
			//this happens when u dont name image correctly
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean isHovered(int x, int y) {
		return x>getX() && x<getX()+getWidth() && 
				y > getY() && y<getY()+getHeight();
	}

	@Override
	public void act() {
		if(action != null){
			action.act();
		}
	}
	
	public void setAction(Action a){
		this.action = a;
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return w;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return h;
	}

}
