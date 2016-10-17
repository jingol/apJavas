package chatbot6arrays;

public class ArraysMain {
	
	static int[] exerciseArray = new int[50]; 
	static String[] deck = new String[52];

	public static void main(String[] args) {
		//this is how you time how quickly a computer processes
		long startTime = System.currentTimeMillis();
		
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample element has a number equal to " + sample.getNumber());
		
		long endTime = System.currentTimeMillis();
		System.out.println("completed method in " + (endTime-startTime + " milliseconds"));
		
		cardList();
	}
	
	public static void popArray(){
		for(int i = 1; i < 50; i++){
			exerciseArray[i] = i + 1;
			System.out.println(exerciseArray[i]);
		}
		
	}
	
	public static void randomPopArray(){
		for (int i = 0; i < exerciseArray.length; i++){
			double rand = Math.random() * 50;
			exerciseArray[i] = (int) rand;
			System.out.println(exerciseArray[i]);
		}
		
	}
	
	public static void rollPopulate(){
		for (int i = 0; i < exerciseArray.length; i++){
			double roll1 = Math.random() * 6 + 1;
			double roll2 = Math.random() * 6 + 1;
			
			exerciseArray[i] = (int)(roll1 + roll2);
			System.out.println(exerciseArray[i]);
		}
	}
	
	public static void cardList(){
		String[] suits = {"Diamond","Clubs","Heart","Spade"};
		String[] rank = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen"
				,"King"};
		int cardIndex = 0;
		for(int i = 0; i < rank.length; i++){
			for(int s = 0; i < suits.length; i++){
				deck[cardIndex + 1] = rank[i] + "of" + suits[s];
				cardIndex++;
			}
			
		}
		
		printArray(deck);
	}
	
	private static void passByValueDemonstration(){
		String[] someStrings = new String[100];
		populateArray(someStrings);
		
		//no change
		changeString(someStrings[99]);
		//no change
		changeArray(someStrings);
		//yes change
		changeArrayElement(someStrings, 99);
		System.out.println(someStrings[99]);
	}
	
	
	
	private static void changeArrayElement(String[] someStrings, int i) {
		someStrings[i] = "new item " + (i+1);
		
	}



	private static void changeArray(String[] someStrings) {
		someStrings = new String[100];
		for(int i = 0; i < someStrings.length; i++){
			someStrings[i] = "new item "+ (i+1);
		}
		
	}



	private static void changeString(String s){
		s = "This string has been changed";
	}

	private static void printArray(String[] a) {
		for(String s: a){
			System.out.println(s);
		}
		
	}

	private static void populateArray(String[] a) {
		
		for (int index = 0; index < a.length; index++){
			a[index] = "value  " + (index + 1);
		}
		
	}

	public static void arrayIntroMethod(){
		// construct 2 integer arrays
				// these two methods do the same thing
				//primitive type arrays filled with zeroes.
				int[] zeros1 = {0,0,0,};
				int[] zeros2 = new int [3];
				//example
				boolean[] booleans = new boolean[3];
				//iterate (2 ways)
				for(int index = 0; index < booleans.length; index++){
					System.out.println(index + " )" +  booleans[index]);
				}
				
				//SECOND METHOD (For-each)
				//always goes in order, doesn't keep index order
				//easier to type
				for(boolean b: booleans){
					System.out.println("" + b);
				}
				
				//these two constructors are different because the second one
				// creates nulls
				String[] strings1 = {"","",""};
				String[] strings2 = new String[3];
				
				
				
	}
}
