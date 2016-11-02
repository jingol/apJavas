package caveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {
	
	public static void main(String[] args){
		int[] arr = {0,1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		//rows, columns.  rows = 4 = arr2D.length columns = 3 = arr2D[0].length
		String[][] arr2D = new String[10][8];
		//iterate row by row
		for(int row = 0; row < arr2D.length; row ++){
			//in each row, go col by col
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "(" + row  + ", "+ col + ")";
				System.out.print(arr2D[row][col]);
			}
			System.out.println();
			
		}
		
	}
}
