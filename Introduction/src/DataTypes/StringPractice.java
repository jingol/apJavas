package DataTypes;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String user;
	static int lineCount;
	
	public static void main(String[] args) {
//		String text = new String("Hello World!");
		createAScanner();
		lineCount = 0;
		demonstrateStringMethods();
		promptName();
		talkForever();
	}
	
	private static void promptName() {
		print("Hello, human! I am a board covered with "
				+ "semi-conductors \nand other"
				+ " such electronic components.\n"
				+ "What is your name?");
		user = input.nextLine();
		print("Awesome! I will call you " + user 
				+ " until you terminate me.");
		
		
	}

	public static void talkForever(){
		while(true){
			promptInput();
		}
	}
		
	
	public static void createAScanner(){
		input = new Scanner(System.in);
	}
	
	public static void promptInput(){
		print(user + " ,try inputting a string!");
		String userInput = input.nextLine();
		print("You typed: " + userInput);
	}
	
	public static void print(String s){
		System.out.println("Line #" + lineCount + ": " + s);
		lineCount++;
		
	}
	
	public static void demonstrateStringMethods(){
		String text1 = "Hello World"; //same as above,shortcut
		String text2 = "Hello ";
		String text3 = "World";
		System.out.println("Hello World");
		if (text1 .equals (text2 + text3)) //cannot use == for string
		{
			System.out.println("These strings are equal.");
		}
		
		System.out.println(text1);
		System.out.println(text2 + text3);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzva";
		if(word1.compareTo(word2) < 0){
			System.out.println("Word1 is before word2," + 
					"lexicongraphically.");
	}
	
	}

}
