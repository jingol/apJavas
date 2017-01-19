package guiCompononets;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {

	private BufferedImage image;
	private boolean loadedImages;
	private int x;
	private int y;
	
	//full size graphics constructor
	public Graphic(int x,int y,String imageLocation) {
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation,0,0);
	}
	
	//custom size graphics constructor
	public Graphic(int x,int y,int w, int h, String imageLocation) {
		this.x = x;
		this.y = y;
		loadImages(imageLocation,w,h);
	}
	
	//scaled size graphics constructor
		public Graphic(int x,int y,double scale, String imageLocation) {
			this.x = x;
			this.y = y;
			loadedImages = false;
			loadImages(imageLocation,scale);
		}
		
	//for scaled
	private void loadImages(String imageLocation, double scale) {
		try{
			//get full size
			ImageIcon icon = new ImageIcon(imageLocation);
			int newWidth = (int)(icon.getIconWidth() * scale);
			int newHeight = (int)(icon.getIconHeight() * scale);
			image = new BufferedImage(newWidth,newHeight,BufferedImage.TYPE_INT_ARGB);
			Graphics2D g = image.createGraphics();
			g.drawImage(icon.getImage(),0,0, newWidth,newHeight,0,0,icon.getIconWidth(),icon.getIconHeight(),null);
			
		}catch(Exception e){
			
		}
	}

	private void loadImages(String imageLocation, int w, int h) {
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
	public BufferedImage getImage() {
		
		return image;
	}

	@Override
	public int getX() {
	
		return x;
	}

	@Override
	public int getY() {
		
		return y;
	}

	@Override
	public int getWidth() {
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		return image.getHeight();
	}

	@Override
	public boolean isAnimated() {	
		return false;
	}

	@Override
	public void update() {
		//dpes nothign image stays same

	}

}
