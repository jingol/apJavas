package whackamole;

import guiCompononets.Action;
import guiCompononets.Clickable;

public interface MoleInterface extends Clickable {

	void setAppearanceTime(int screenTime);

	int getAppearanceTime();

	void setAction(Action action);

}
