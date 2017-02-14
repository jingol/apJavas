package whackamole;

import gui.components.Action;
import gui.components.Clickable;

public interface MoleInterface extends Clickable {

	void setAppearanceTime(int screenTime);

	int getAppearanceTime();

	void setAction(Action action);

}
