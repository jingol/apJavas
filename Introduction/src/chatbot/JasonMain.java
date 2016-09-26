package chatbot;

import java.util.Scanner;

public class JasonMain {
	static Scanner input;
	static String user;
	static int lineCount;
	static boolean inLoop;
	static String response;
	static Topic school;
	
	public static void main(String[] args) {
//		String text = new String("Hello World!");
		createTopics();
		String s1 = "a";
		String s2 = "";
		System.out.println(s1.compareTo(s2));
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
			if(findKeyword(response,"good",0)){
				print("I'm so happy you're good.");
			}
			else if (response.indexOf("school") >= 0){
				inLoop = false; //exit loop
				school.talk();
			}
			
			else
			{
				print("I'm sorry, I don't understand you.");
			}
		}
	}
		
	
	public static boolean findKeyword(String searchString, String key, 
		int startIndex){
		//delete white space
		String phrase = searchString.trim();
		//set all letters to lowercase
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		//find position of key
		int psn = phrase.indexOf(key);
		//keep looking for word until right context found
		while(psn >= 0){
			String before = " ";
			String after = " ";
			if(psn + key.length() < phrase.length()){
				//if the phrase doesnt wend with this word
				after = phrase.substring(psn + key.length(),
						psn + key.length() + 1).toLowerCase();
			}
			// if the phrase does not begin with this word
			if(psn > 0){
				before = phrase.substring(psn -1 , psn).toLowerCase();
			}
			if(before.compareTo("a") < 0 &&
				after.compareTo("a") < 0){
					
		
		return false;
	}

	public static void createTopics(){
		input = new Scanner(System.in);
		school = new School();
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
}
