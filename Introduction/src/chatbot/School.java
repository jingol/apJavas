package chatbot;

public class School implements Topic {

	private boolean inSchoolLoop;
	private String schoolsResponse;
	
	public void talk(){
		inSchoolLoop = true;
		while(inSchoolLoop){
			JasonMain.print("Tell me about school.");
			schoolsResponse = JasonMain.getInput();
			JasonMain.print("That's my favorite "
					+ "part about school too.");
		}
	}

}
