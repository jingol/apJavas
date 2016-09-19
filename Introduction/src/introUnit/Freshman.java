package introUnit;

public class Freshman extends Student {
	
	private String hobby;

	public Freshman(String name,String hobby) {
		super(name);
		this.hobby = hobby;
		// TODO Auto-generated constructor stub
	}
	
	public void talk(){
		super.talk();//call teh super method
		System.out.println("...and I am a Freshman!");
		System.out.println("I like to " + hobby);
	}

}
