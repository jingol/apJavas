package chatbot;

public class JasonLike implements Topic {
	private boolean inLikeLoop;
	private String likeResponse;

	@Override
	public void talk() {
		JasonMain.print("What are some things you like?");
		inLikeLoop = true;
		while(inLikeLoop){
			likeResponse = JasonMain.getInput();
			int likePsn = (JasonMain.findKeyword(likeResponse, "like" , 0));
			
			if(likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn + 5);
				JasonMain.print("You are such an interesting person because"
						+ "you like " + thingsLiked);
				
				if(JasonMain.findKeyword(thingsLiked, "school", 0 ) >= 0){
					inLikeLoop = false;
					JasonMain.school.talk();
				}
			}
			else{
				JasonMain.print("I don't understand you.");
			}
		}
	}

	@Override
	public boolean isTriggered(String userInput) {
		String[] triggers = {"school","class","teacher"};
		//could use for loop to iterate through array
		if(JasonMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if(JasonMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		
		return false;
	}
}
