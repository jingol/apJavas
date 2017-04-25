package array2d;

import java.util.Arrays;

public class Main {
	
	
	
	 public static void main(String[] args) {
	        
	        // we print a heading and make it bigger using HTML formatting
	        System.out.println("<h4>-- 2 Dimensional Arrays (Practice Methods) --</h4>");
	        
	        // create the finder and call the function to find the maximum element
	        int[][] diff  ={{-3, 4, -8, 16},           
	   	            {15, 14, 2, 21},
	            	{5, 19, 32, -1}};
	        int maxDis = TwoDArrays.maxDistBetweenAny2(diff);
	        System.out.println("The maximum distance between any two elements in g1 is: " + maxDis);
	         System.out.println("You can perform other tests by editing the code in the Main.java class");
	        
	        String[][] temp;
	     	String[] words = {"hello", "blah",  "boom", "elephant"};
	        temp = new String[2][3];
	        temp = TwoDArrays.twoCharsTo2D(temp, words);

	        
	        String[] r = {"Joe", "Kim", "Chris"};
	    	int[][] g = {{80, 90, 90, 100, 70},
	    			 {90, 60, 75, 80, 80},
	    			 {100, 90, 96, 98, 99}};

	
	    	
	    	int[][] remove ={{9, 8, 7, 6},           
	    				{5, 4, 12, 1},
	    				{3, 19, 2, 13}};
	    	
	    	TwoDArrays.removeRowCol(remove,0,1);
	        
	        
	       
	    }
}
