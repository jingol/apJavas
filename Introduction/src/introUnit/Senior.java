package introUnit;

public class Senior extends Student {
	
	private String internship;

	public Senior(String name, String internship) {
		super(name);
		this.internship = internship;
		//calling the constructor. constructor call must be the 1st statement.
		//because senior is a student, senior cannot exist without student existing first
	}
	
	public void talk(){
		super.talk();//call teh super method
		System.out.println("...and I am a Senior!");
		System.out.println("I intern as a " + internship);
	}

}
