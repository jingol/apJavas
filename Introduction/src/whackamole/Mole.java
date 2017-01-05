package whackamole;

import guiCompononets.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	private int appearanceTime;

	public Mole(int x, int y){
		super(x, y, .9,"resources/sampleImages/download.jpg");
	}

	public Mole(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
	}

	@Override
	public void setAppearanceTime(int screenTime) {
		appearanceTime = screenTime;
	}

	@Override
	public int getAppearanceTime() {
		return appearanceTime;
	}

}
