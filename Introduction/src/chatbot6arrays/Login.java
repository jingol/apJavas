package chatbot6arrays;

import java.util.Scanner;

public class Login {
	
	
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	//1 point for private4 or inaccessible
	//1 point for declaring data type
	private static String username = "test_user";
	private static String password = "test";

	//1 point correct method header
	public static void main(String[] args) {
		//1 point user has one chance to enter name
		if(correctUser()){
			askPassword();
		}
		else{
			System.out.println("Unknown user name, please contect network administrator");
		}
	}

	private static boolean correctUser() {
		//1 point for .equals
		if(waitForEntry().equals(username)){
			return true;
		}
		return false;
	}

	private static void askPassword() {
		boolean inLoop = true;
		int remainingTries = 3;
		//1 point using a loop
		while(inLoop){
			System.out.println("Enter your password.");
			//1 point for "waitForEntry"
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("You are in!");
				inLoop = false;
			}
			else{
				remainingTries--;
				//.5 3 tries max
				//.5 invalid passsword after 3
				if(remainingTries == 0){
					System.out.println("Invalid password.");
					inLoop = false;
				}
					else{
						//.5 printing a changing number
						//.5 correct number
						System.out.println("Incorrect password. You have " + remainingTries
								+ " tries left");
					}
				}
			}
		}
		
	}


