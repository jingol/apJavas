package DataTypes;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String user;
	static int lineCount;
	static boolean inLoop;
	static String response;
	
	public static void main(String[] args) {
//		String text = new String("Hello World!");
		createAScanner();
		demonstrateStringMethods();
		promptName();
		talkForever();
	}
	
	private static void promptName() {
		print("Hello, human! I am a board covered with "
				+ "semi-conductors and other"
				+ " such electronic components."
				+ "What is your name?");
		user = input.nextLine();
		print("Awesome! I will call you " + user 
				+ " until you terminate me.");
		
		
	}

	public static void talkForever(){
		inLoop = true;
		while(inLoop){
			print("Greetings, " + user + "How are you?");
			response = getInput();
			if(response.indexOf("good") >= 0){
				print("I'm so happy you're good.");
			}
			else
			{
				print("I'm sorry, I don't understand you.");
			}
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
	
	public static String getInput(){
		return input.nextLine();
	}
	
	public static void print(String s){
		System.out.println("Line #" + lineCount + ": " + s);
		//create a multi line string
		String printString = "";
		int cutoff = 35;
		//check to see if there are words to add
		//iow, is the length of s>0
		while(s.length() > 0){
			String currentLine = "";
			String nextWord = "";
			//while the currentLine and nextWord are
			//less than the cutoff,AND there are still words
			//to add,do the following loop
			while(currentLine.length() + nextWord.length()
				<= cutoff && s.length() > 0);
			//add the next word to the line
			currentLine += nextWord;
			s = s.substring(nextWord.length());	
			//get the following word
			int endOfWord = s.indexOf("");
			//check to see if this is the last word
			if(endOfWord == -1){
				endOfWord = s.length() - 1;
			}
			
			nextWord = s.substring(0, endOfWord + 1);
			printString += currentLine + "\n";
		}
		
		System.out.println(printString);
		
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
