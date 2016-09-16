package introUnit;

public class Student {
	
	//fields
	private String name;
	
	//constructor(no return type. Creates students).
	public Student(String name){
		//initialize fields
		this.name = name;
	}
	
	public void talk(){
		System.out.println("Hi my name is " + name);
	}
}
