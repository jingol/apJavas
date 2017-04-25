package array2d;

import java.util.Arrays;

public class TwoDArrays {
	/**
	 * 1) Given a 2 dimensional array of unique ints write a method that will return the maximum distance between any 2 ints in the 2D array.
	 * 
	 * EXAMPLE 1
	    int[][] g1 ={{9, 8, 7, 6},           
	        	{5, 4, 12, 1},
	   	        {3, 19, 2, 13}};

	    maxDistBetweenAny2(g1)returns 18
	    
	    EXAMPLE 2
	    int[][] g2 ={{-3, 4, -8, 16},           
	   	            {15, 14, 2, 21},
	            	{5, 19, 32, -1}};

	    maxDistBetweenAny2(g2)  returns 40
	    
	*/
	    public static int maxDistBetweenAny2(int[][] nums){
	        int smallest = nums[0][0];
	        int temp = 0;
	        int largest = nums[nums.length-1][nums[0].length-1];
	        for(int r = 0; r < nums.length; r++ ){
	            for(int c = 0; c < nums[0].length; c++){
	                if(nums[r][c] <= smallest ){
	                    smallest = nums[r][c];
	                }
	                else{
	                	temp = nums[r][c];
	                	if(temp > largest){
	                		largest = temp;
	                	}
	                }
	               
	            }
	        }
	        if(smallest < 0){
	        	return Math.abs(smallest) + largest;
	        }
	        else{
	        	return largest - smallest;
	        }
	    }
	    
	    /**
	     * Given a 2D array of Strings and a non-empty array of 
	     * Strings where each string is of length 2 or more.  
	     * Write a method that will place the first 2 chars of each 
	     * String into a 2D array in row major order.  If the 1D array 
	     * runs out of strings then fill in the rest of the elements with "$$".  
	       (This method is definitely an AP level question)


	     *   String[][] t = new String[2][3];						        //This is a 2d Array
	     *   twoCharsTo2D(t, {"hello", "blah",  "boom", "elephant"})  ?       "he", "bl", "bo"
			                                								 "el", "$$", "$$"


	//Preconditions:  1.  words.length > 0
//			  2.  words.length<=(table.length * table[0].length)
//			  3.  Each element in words will be a string of length 2 or more
	*/

	    public static String[][] twoCharsTo2D(String[][] table, String[] words){
	    	int index = 0;
	    	for(int i = 0; i < words.length; i++){
	    		words[i] = words[i].substring(0, 2);
	    	}
	    	for(int r = 0; r < table.length; r++){
	    		for(int c = 0 ; c < table[0].length; c++){
	    			if(index != words.length){
	    				table[r][c] = words[index];
	    				index++;
	    			}
	    			else{
	    				table[r][c] = "$$";
	    			}
	    		}
	    	}
	        return table;
	    }

	/**
	 * 3)  Given an array of Strings containing unique names, and a 2D array of ints where each row 
	 * represents the test grades of the person at a specific index, write the method that will return 
	 * the name of the person with the greatest test average(mean).

	String[] r = {"Joe", "Kim", "Chris"};
	int[][] g = {{80, 90, 90, 100, 70},
			 {90, 60, 75, 80, 80},
			 {100, 90, 96, 98, 99}};

	bestAverage(r, g) returns "Chris"

	Preconditions:  
	1.  roster.length > 0
	2.  roster.length == grades.length
	*/
	    public static String bestAverage(String[] roster, int[][] grades){
	    	int bestavg = 0;
	    	int student = 0;
	    	int avg = 0;
	    	int added = 0;
	    	for(int r = 0; r < grades.length; r++){
	    		for(int c = 0; c < grades[0].length; c++){
	    			avg += grades[r][c];
	    			added++;
	    		}
	    		avg = avg/added;
	    		
	    		if(avg > bestavg){
	    			student = r;
	    			bestavg = avg;
	    		}
	    		avg = 0;
	    		added = 0;
	    	}
	        return roster[student];
	    }
	    
	    /**
	     * Given a non-empty 2D array of ints and 2 ints that represent a row and a column that 
	     * exists in the 2D array return a 2D array without the given row and without the given column.  
	     * 
	     * Example 1
	     * int[][] g1 ={{9, 8, 7, 6},           
	     *              {5, 4, 12, 1},
	     *              {3, 19, 2, 13}};
	     * 
	     * removeRowCol(g1, 0, 1) returns {{5, 12, 1},
	                                        {3, 2, 13}};
	                             
	    *Example 2
	    *int[][] g2 ={{-3, 4, -8},           
	    *          	{14, 2, 21},
	   	*          {3, 32, -3}};

	    * removeRowCol(g2, 1, 1) returns {{-3, -8},
	   	                                {3, -3}};


	        Preconditions:  
	          1.  mat.length >=3
			  2.  mat[0].length>=3
			  3.  0 <= row <= mat.length-1 and 0 <= col <= mat[0].length-1
	*/
	    public static int[][] removeRowCol(int[][] mat, int row, int col){
	        int[][] nothing = new int[mat.length-1][mat[0].length-1];
	        int[][] mirror = new int[mat.length][mat[0].length];
	        for(int r = 0; r < mat.length; r++){
	        	for(int c = 0; c < mat[0].length;c++){
	        		if(r != row && c != col){
	        			mirror[r][c] = mat[r][c];
	        		}
	        	}
	        }
	        
	        
	        int addrow = 0;
	        int addcol = 0;
	        for(int r = 0; r < mirror.length; r++){
	        	for(int c = 0; c < mirror[0].length;c++){
	        		if(mirror[r][c] != 0) {
	        			nothing[addrow][addcol] = mirror[r][c];
	        			addcol++;
	        		}
	        	}
	        	if(addcol == nothing[0].length){
	        		addrow++;
	        	}
	        	addcol = 0;
	        	
	        }
	        
	      
	        
	     
	        return nothing;
	    }


	/**
	 * Given a non-empty 2D array of ints and 2 ints that represent a row and a column that 
	 * exists in the 2D array return an array of all the neighboring elements to the 
	 * element located at (row, col).  A neighboring element is an element that is 
	 * next to another element horizontally, vertically OR DIAGONALLY.  
	 * 
	 * (Note: if this sounds like something similar (but not identical) to an assignment you have done in the past, then you are right!)


	 int[][] g ={{9, 8, 7, 6},           
	   	         {5, 4, 2, 1},
	   	         {3, 9, 2, 3}};

	    getNeighbors(g, 0, 0) returns {8, 5, 4}
	    getNeighbors(g, 1, 1) returns {9, 8, 7, 5, 2, 3, 9, 2}
	    getNeighbors(g, 0, 2) returns {8, 6, 4, 2, 1}
	    getNeighbors(g, 2, 3) returns {2, 1, 2}
	    getNeighbors(g, 2, 2) returns {4, 2, 1, 9, 3}
	*/
	    public static int[] getNeighbors(int[][] grid, int row, int col){
	        int[] nothing = new int[9];
	        int[] mirror = new int[9];
	        int index = 0;
	        if(row == 0){
	        	if(col == 0){
	        		for(int r = row; r < row+2 ; r++){
		        		for(int c = col; c < col+2; c++){
		        			mirror[index] = grid[r][c];
		        		}
		        	}
	        	}
	        	else{
	        		for(int r = row; r < row+2 ; r++){
		        		for(int c = col-1; c < col+2; c++){
		        			mirror[index] = grid[r][c];
		        		}
		        	}
	        	}
	        }
	        
	        
	        
	        return nothing;
	    }
}
