package introUnit;

public class PopulateRandomArray {

	
	
	public static int indexOf(int[] arrayToSearch, int key){
		for (int i=0;i<arrayToSearch.length;i++){
	    	if (key==arrayToSearch[i]){
	    		return i;
	    	}
	      }

	     return -1;
	}
	public static void popArray(int[]arr){
		int[] randArr=new int[arr.length-1];
		for(int r=0; r<randArr.length;r++){
			int toAdd= arr[(int)Math.random()*arr.length];
			while(indexOf(randArr,toAdd)>-1){
				toAdd=arr[(int)Math.random()*arr.length];
			}
			randArr[r]=toAdd;
		}
	}
	
	public static void main(String[] args){
	    String[] letters = {"A","C","B"};
	    String[] numbers = {"3","1","2"};
	    for(int j=0; j<6; j+=2){
	        for(String l : letters){
	            System.out.print(l+numbers[j%3]);
	        }
	    }
	}
	
	public static void testPrimes(int numberToTest){
		int lastToCheck=(int)(Math.sqrt(numberToTest));
		boolean[] theNumbers=new boolean[numberToTest];
		for(int i=0;i<numberToTest;i++){
			theNumbers[i]=true;
		}
		theNumbers[0]=false;
		theNumbers[1]=false;
		for(int prime = 2; prime <= lastToCheck; prime++){
			//when checking 50 nums, tests 2,3,4,5,6,7
			if(theNumbers[prime]){
				//checks numbers taht are prime(nums that havent been crossed out)
				//won't check 4 and six
				System.out.println(prime +" is prime. Crossing off: \n");
				
				boolean first=true;
			
				for(int test= prime + prime;test<numberToTest;test=test+prime){
					if(!first){
						System.out.print(test+ ", ");
						theNumbers[test]=false;
					}else{
						first=false;
					}
				}
			
			}
		}
		for(int i=0;i<theNumbers.length;i++){
			if(theNumbers[i]){
				System.out.println(i+" is prime.");
			}
		}
	}
}
