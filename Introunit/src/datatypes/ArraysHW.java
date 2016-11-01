package datatypes;

import java.util.Arrays;

public class ArraysHW {

	public static void main(String[] args) {
	    
	     /**
	      * IMPORTANT NOTE: 
	      * This homework assignment will be weighted 4x.
	      * DO NOT ASSUME my tests are perfect! If you have code that you think should work, 
	      * but you keep failing the tests PLEASE bring it to my attention so that I can fix the tests
	      * DO NOT spend hours and hours trying to fix perfect code just because my test
	      * says that it isn't perfect!
	      * */
	    	int[] sortedArray = {1,2,3,4,5,6,7,8};
	    	int[] unsortedArray = {5,1,3,7,10};
	    	int[] sortedDesc = {5,4,3,2,1};
	    	double[] randomDoub = {4,7,1,8,2,10,12};
	    	isSorted(sortedDesc);
	    	getStats(randomDoub);
	    	searchUnsorted(unsortedArray,3);
	    	longestConsecutiveSequence(sortedArray);
	    	countDifferences(sortedDesc,unsortedArray);
	    	cycleThrough(sortedArray, 3);
	    }
	    
	    public static int searchUnsorted(int[] arrayToSearch, int key){
	    /**
	     * this method take an unsorted int array (arrayToSearch) and returns an 
	     * int corresponding to the index of a key, if it is in the array
	     * if the key is not in the array, this method returns -1
	     * */
	    	for(int i = 0; i < arrayToSearch.length;i++){
	    		if(arrayToSearch[i] == key){
	    			return i;
	    		}
	    	}
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
	        double greater = array[0];
	        for(int i = 0; i < array.length; i++){	        	
	        	if(greater > array[i]){
      			trueCount++;
      			if(trueCount == array.length - 1){
      				System.out.println(true);
  	        		return true;
  	        	}
      		}
	        	
	        }
	        return false;
	    }

	    
	    //helper
	    public static boolean isSortedAsc(double[] array){
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
	        /** 
	         * This method return a double[] contain a WHOLE BUNCH of stats
	         * The double array must keep the following stats about the array parameter:
	         * index 0 = the mean
	         * index 1 = the max
	         * index 2 = the min
	         * index 3 = the median
	         * index 4 = the number of values greater than or equal to the mean
	         * index 5 = the number of values below the mean
	         * */
	         double[] stats = new double[6];
	         for(int i = 0; i < array.length; i++){
	        	 stats[0] += array[i];
	             if(i +1 == array.length){
	            	stats[0] /= array.length;
	            	System.out.println("Mean:" + stats[0]);
	             }
	         }
	         
	         
	         for(int i = 0; i < array.length; i++){
	        	 if(array[i] > stats[1]){
	        		 stats[1] = array[i];
	        	 }
	        	 if(array.length - 1 == i){
	        		 System.out.println("Max:" + stats[1]);
	        	 }
	 
	         }
	         
	         double mincount = array[0];
	         for(int i = 0; i < array.length; i++){
	        	 if(array[i] < mincount){
	        		 stats[2] = array[i];
	        		 mincount = array[i];
	        	 }
	        	 if(array.length - 1 == i){
	        		 System.out.println("Min:" + stats[2]);
	        	 }
	 
	         }
	         
	         
	         if(isSortedAsc(array)){
	        	 if(array.length % 2 == 0){
	        		 stats[3] = ((array[array.length/2] + array[array.length/2 - 1])/2);
	        	 }
	        	 else{
	        		 stats[3] = array[(int)(array.length/2)];
	        	 }
	         }
	         else{
	        	 double[] sorted = new double[array.length];
	        	 for(int i = 0; i < array.length; i++){
	        		 int greaterValue = 0;
	        		 double compared = array[i];
	        		 for (int a = 0; a < array.length; a++){
	        			 if(array[a] < compared){
	        				 greaterValue++;
	        			 }
	        			 if(array.length - 1 == a){
       					 sorted[greaterValue] = compared;
       				 }
	        		 }
	        	 }
	        	 
	        	 if(array.length % 2 == 0){
	        		 stats[3] = ((sorted[array.length/2] + sorted[array.length/2 - 1])/2);
	        	 }
	        	 else{
	        		 stats[3] = sorted[(int)(array.length/2)];
	        	 }
	         }
	         
	         int smallcounter = 0;
	         int bigcounter = 0;
	         for(int i = 0; i < array.length; i++){
	        	 
	        	 if(array[i] > stats[0]){
	        		 bigcounter++;
	        	 }
	        	 
	        	 stats[4] = bigcounter;
	         }
	         
	         for(int i = 0; i < array.length; i++){
	        	 
	        	 if(array[i] < stats[0]){
	        		 smallcounter++;
	        	 }
	        	 
	        	 stats[5] = smallcounter;
	         }
	         
	         System.out.println(java.util.Arrays.toString(stats));
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
	    	
	    	int[] reversedArray = new int[array.length];
	    	int reversedIndex = 0;
	    	for(int i = array.length - 1; i > -1; i--){
	    		reversedArray[reversedIndex] = array[i];
	    		reversedIndex++;
	    	}
	    	for(int i = 0; i < array.length; i++){
	    	    array[i] = reversedArray[i];
	    	}
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
	    	int diffCount = array1.length;
	    	for(int i = 0; i < array1.length;i++){
	    		if(array1[i] == array2[i]){
	    			diffCount--;
	    		}
	    	}
	    	
	    	
	         return diffCount;
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
	    	int seqCount = 1;
	    	for(int i = 0; i < array1.length; i++){
	    		int nextItem = array1[i] + 1;
	    		
	    		
	    		if(i == array1.length - 1){
	    			
	    			return seqCount;
	    		}
	    		
	    		if(array1[i+1] == nextItem){
		    		seqCount++;
		    			
		    		}
	    		
	    			
	    		}
	    	
	    		return seqCount;
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
	         int[] generated = new int[n];
	         for(int i = 0; i < generated.length; i++){
	         int randomInt = (int) (Math.random() * n * 2);
	         while(contains(generated,randomInt)){
	             randomInt = (int) (Math.random() * n * 2);
	         }
	         if(randomInt != generated[i]){
	             generated[i] = randomInt;
	         }
	         }
	         
	         
	         System.out.println(Arrays.toString(generated));
	        return generated; 
	    }
	    
	    public static boolean contains(int[] array, int n){
	        for(int i = 0; i < array.length; i++){
	            if(array[i] == n){
	                return true;
	            }
	        }
	        return false;
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
	    	
	    	if(n > 0) {
	    		for (int i = n; i > 0; i--){
	    			for(int a = array.length - 1; a > 0; a --){
	    				int item1 = array[0];
	    				int itemLast = array[a];
	    				array[0] = itemLast;
	    				array[a] = item1;
	    			}
	    		}
	    		
	    	}
	    }
	
		private static void testPrimes(int numberToTest){
		    int lastToCheck = (int) (Math.sqrt(numberToTest));
		    boolean[] theNumbers = new boolean[numberToTest];
		    for(int i = 0; i < numberToTest; i++){
			theNumbers[i] = true;
		    }
		    theNumbers[0] = false;
		    theNumbers[1] = false;
		    int increment = 2;
		    boolean first = true;
		    for(int test = 2; test <= numbersToTest; test = test + increment){
			if(!first){
			    theNumbers[test] = false;
			}
			else{
			    first = false;
			}
		    }

		    for(int i = 0; i < theNumbers.length; i++){
			if(theNumbers[i]){
			    System.out.println(i + " is prime.");
			}
		    }
		}

}


