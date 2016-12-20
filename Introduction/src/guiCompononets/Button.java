package guiCompononets;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public  class Button extends TextLabel implements Clickable {
	
	private Color color;
	private Action action;

	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		this.color = color;
		this.action = action;
		update();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(color);
		g.fillRoundRect(0,0, getWidth(), getHeight(), 30,25);
		g.setColor(Color.black);
		g.drawRoundRect(1, 1, getWidth()-1, getHeight()-1, 30, 25);	
		g.setFont(new Font(getFont(),Font.PLAIN,getSize()));
		FontMetrics fm = g.getFontMetrics();
		
		if(getText()!= null){
			g.setColor(Color.white);
			String t = getText();
			//just i ncase cast ext is too wide, cut off
			int cutoff = t.length();
			while(cutoff > 0 && fm.stringWidth(t) > getWidth()){
				cutoff--;
				t = t.substring(0, cutoff);
			}
			g.drawString(t, (getWidth()-fm.stringWidth(t))/2, (getHeight()+fm.getHeight()-fm.getDescent()));
		}
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

}
