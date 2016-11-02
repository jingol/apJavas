package caveExplorer;

public class Practice {
	public static void main(String[] args){
		String[][] arr2D = new String[10][8];
		//iterate row by row
		for(int row = 0; row < arr2D.length; row ++){
			//in each row, go col by col
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "";
			}
			
			
		}
		
		
		arr2D[0][1] = "";
		arr2D[0][2] = "^";
		arr2D[0][3] = "^";
		arr2D[1][1] = ".";
		arr2D[1][2] = ".";
		arr2D[1][3] = "\\";
		arr2D[2][1] = "\\";
		arr2D[2][2] = "/";
		arr2D[2][3] = "/";
		
		
		//top row is "_"
		for(int col = 0; col < arr2D[0].length; col++){
			arr2D[0][col] = "_";
			arr2D[arr2D.length-1][col] = " _";
		}
		
		//left and right col is a "|"
		
		for(int row = 1; row < arr2D.length; row++){
			arr2D[row][0] = "|";
			arr2D[row][arr2D[0].length - 1] = " |";
		}
		
		
		
		for(int row = 7; row < arr2D.length; row++){
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "M";
			}
		}
		
		printPic(arr2D);
	}
	
	public static void printSun(String[][] arr2D){
		arr2D[1][2] = "O";
		arr2D[0][2] = "|";
		arr2D[2][2] = "|";
		arr2D[1][1] = "-";
		arr2D[1][3] = "-";
		arr2D[0][1] = "\\";
		arr2D[2][3] = "\\";
		arr2D[0][3] = "/";
		arr2D[2][1] = "/";
	}

	public static void printPic(String[][] pic) {
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				System.out.print(pic[row][col]);
			}
			
			System.out.println();
		}
		
	}
}
