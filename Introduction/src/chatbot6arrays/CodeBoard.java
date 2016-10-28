package chatbot6arrays;

import java.util.Arrays;

public class CodeBoard {


	    public static void main(String[] args) {
	    
	     /**
	      * IMPORTANT NOTE: 
	      * This homework assignment will be weighted 4x.
	      * DO NOT ASSUME my tests are perfect! If you have code that you think should work, 
	      * but you keep failing the tests PLEASE bring it to my attention so that I can fix the tests
	      * DO NOT spend hours and hours trying to fix perfect code just because my test
	      * says that it isn't perfect!
	      * */
	    	int[] sortedArray = {1,2,3,4,5};
	    	double[] randomDoub = {4,7,1};
	    	isSorted(sortedArray);
	    	getStats(randomDoub);
	    	
	    	 
	    	
	    }
	    
	    public static int searchUnsorted(int[] arrayToSearch, int key){
	    /**
	     * this method take an unsorted int array (arrayToSearch) and returns an 
	     * int corresponding to the index of a key, if it is in the array
	     * if the key is not in the array, this method returns -1
	     * */
	     return -1;
	    }
	    
	    public static int searchSorted(int[] sortedArrayToSearch, int key){
	    /**
	     * this method is exactly like the one above, except the parameter sortedArrayToSearch will
	     * always be sorted in DESCENDING order. Again return the index of the key or return -1
	     * if the key is not in the array
	     * 
	     * Note: You should attempt to write a method that is more efficient that searchUnsorted
	     * */
	     return -1;
	    }
	    
	    public static boolean isSorted(int[] array){
	        int trueCount = 0;
	        int greater = array[0];
	        for(int i = 0; i < array.length; i++){	        	
	        	if(greater < array[i]){
        			trueCount++;
        			if(i+1 == array.length && trueCount == array.length - 1){
    	        		return true;
    	        	}
        		}
	        	
	        }
	        return false;
	    }
	    
	    //helper
	    public static boolean isSortedDoub(double[] array){
	        int trueCount = 0;
	        double greater = array[0];
	        for(int i = 0; i < array.length; i++){	        	
	        	if(greater < array[i]){
        			trueCount++;
        			if(i+1 == array.length && trueCount == array.length - 1){
    	        		return true;
    	        	}
        		}
	        	
	        }
	        return false;
	    }
	    
	    
	    public static double[] getStats(double[] array){
	    	double[] stats = new double[6];
	    	double sum = 0;
	    	int aboveCtr = 0;
	    	int belowCtr = 0;
	    	for (int i = 0; i < array.length; i++) {
	    		sum += array[i];
	    	}
	    	stats[0] = sum/array.length;
	    	for (int i = 0; i < array.length; i++) {
	    		if (array[i] > stats[1]) {
	    			stats[1] = array[i];
	    		}
	    	}
	    	
	    	double min = array[0];
	        for(int i = 0; i < array.length; i++){
	        	 if(array[i] < min){
	        		 stats[i] = array[i];
	        	 }
	        	 if(array.length - 1 == i){
	        		 System.out.println("Min:" + stats[2]);
	        	 }
	 
	         }
	    	for (int i = 0; i < array.length; i++) {
	    		if (array[i] >= sum/array.length) {
	    			aboveCtr++;
	    		}
	    		else {
	    			belowCtr++;
	    		}
	    	}
	    	stats[4] = aboveCtr;
	    	stats[5] = belowCtr;
	    	
	    	for (int i = 0; i < array.length - 1; i++) {    		
				for (int x = 0; x < array.length - 1; x++) {
				    double current = array[x];
		    		double next = array[x + 1];
		    		if (current > next) { 
		    			array[x + 1] = current;
		    			array[x] = next;
		    		}
				}
	    	}
	    	if (array.length % 2 == 0) {
	    		double first = array[array.length/2];
	    		double second = array[(array.length/2) - 1];
	    		stats[3] = (first + second)/2;
	    	}
	    	else {
	    		stats[3] = array[(int) (array.length/2)];
	    	}
	    	System.out.println(Arrays.toString(stats));
	    	return stats;
	    }
	    public static void reverseOrder(int[] array){
	        /**
	         * this method reverses the order of the array passed to it.
	         * Not that this method does not have a return type. You do not need to copy the array first
	         * Furthermore, note that the array is not necessarily in any *particular* order. It may be 
	         * in a random order, though you still need to reverse whatever order it is in
	         * 
	         * Example:
	         * array = {5, 1, 9, 10, 16, -6}
	         * after calling this method
	         * array = {-6, 16, 10, 9, 1, 5}
	         * 
	         * */
	    }
	   
	    
	    public static int countDifferences(int[] array1, int[] array2){
	        /**Here, you will write an method that returns the number of values in two arrays 
	         * that are NOT the same (either in value OR location).
	         * The arrays ALWAYS have the same length
	         * Examples:
	         * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
	         * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
	         * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
	         * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
	         * 
	         * */
	    	
	    	int count = array1.length;
	    	for(int i = 0; i < array1.length; i++){
	    		if(array1[i] == array2[i]){
	    			count++;
	    		}
	    		
	    	}
	         return count;
	    }
	    

	    public static int longestConsecutiveSequence(int[] array1){
	        /**This method counts the longest consequtive sequence in an array.
	         * It does not matter where the sequence begins
	         * If there are no consecutive numbers, the method should return '1'
	         * 
	         * Examples:
	         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
	         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
	         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
	         * */
	        
	        return 0;
	    }

	    public static int longestSharedSequence(int[] array1, int[] array2){
	        /**This method counts the longest unbroken, shared sequence in TWO arrays.
	         * The sequence does NOT have to be a consecutive sequence
	         * It does NOT matter where the sequence begins, the arrays might not be the same length
	         * 
	         * Examples:
	         * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
	         * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
	         *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
	         * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
	         * */
	        int sequenceCount = 0;
	            for(int i = 0; i <array1.length; i++){
	                for(int a = 0; i < array2.length; i++){
	                    
	                }
	            }
	        
	        return 0;
	    }

	    public static int[] generateDistinctItemsList(int n){
	        /**
	         * This method needs to generate an int[] of length n that contains distinct, random integers
	         * between 1 and 2n 
	         * The method will be tested by verifying that the array you return is n items long,
	         * contains only entries between 1 and 2n (inclusive) and has no duplicates
	         * 
	         * */
	        return null; 
	    }
	    
	    
	    public static void cycleThrough(int[] array, int n){
	        /** This problem represents people moving through a line.
	         * Once they get to the front of the line, they get what they've been waiting for, then they 
	         * immediately go to the end of the line and "cycle through" again.
	         * 
	         * This method reorders the array so that it represents what the array would look like
	         * after it had been cycled through an n number of times.
	         * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
	         * because '2' (the person at the front of the line) cycled through and is now at the end of the line
	         * 
	         * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
	         * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
	         * 
	         * Likewise,
	         * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
	         * and the most interesting case, 
	         * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
	         * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
	         * was able to go through one more time than anyone else
	         * 
	         * CHALLENGE
	         * For extra credit, make your method handle NEGATIVE n
	         * */
	    }
	    

	

}
