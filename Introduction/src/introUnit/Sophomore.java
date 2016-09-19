package introUnit;

public class Sophomore extends Student {
	
	private String major; 

	public Sophomore(String name, String major) {
		super(name);
		this.major = major;
		// TODO Auto-generated constructor stub
	}

	
	public void talk(){
		super.talk();//call teh super method
		System.out.println("...and I am a Sophomore!");
		System.out.println("I am planning to join the " + major + " major");
	}
}
