package chatbot6arrays;

public class ArraysMain {

	public static void main(String[] args) {
		//this is how you time how quickly a computer processes
		long startTime = System.currentTimeMillis();
		arrayIntroMethod();
		long endTime = System.currentTimeMillis();
		System.out.println("completed method in" + (endTime-startTime + "milliseconds"));
		
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
				
				for(String s: strings2){
					System.out.println(s);
				}
	}
}
