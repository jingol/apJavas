package introUnit;

public class Yah {

	private static boolean[][] barr;
	
	
	public static void main(String[] args) {
		barr = new boolean[5][5]; 
		printArray(barr);
		buttonClick(3,3);
		printArray(barr);
		buttonClick(3,3);
		printArray(barr);
	}
	
	public static void switchRow(boolean[] row, int x){
//		for(int i = -1; i<2; i++){
//			if(x+i >= 0 && x + i < row.length){
//				row[x+i] = !row[x+i];
//			}
//		}
		if(x >= 0 && x < row.length){
			for(int i = -1; i<2; i++){
				if(x+i >= 0 && x + i < row.length){
					row[x+i] = !row[x+i];
				}
			}
		}
	}
	
	public static void switchColumn(boolean[][] grid, int r, int c){
		switchIfValid(grid,r-1,c);
		switchIfValid(grid,r+1,c);
		
	}
	
	public static void switchIfValid(boolean[][] grid, int r, int c){
		if(r >= 0 && r < grid.length && c >= 0 && c < grid[r].length){
			grid[r][c] = !grid[r][c];
		}
	}
	
	public static void buttonClick(int r, int c) {
		if(r >= 0 && r < barr.length){
			switchRow(barr[r], c);
		}
		switchColumn(barr, r, c);
		//check if any lights are on
		for(int i = 0; i < barr.length; i++){
			for(int j = 0; j < barr[0].length; j++){
				//1 of 2 pts
				if(barr[i][j])return;//2nd pt
			}
		}
		System.out.println("You have solved the puzzle");
	}

	public static void printArray(boolean[][] barr){
		for(boolean[] row: barr){
			for(boolean b: row){
				if(b)System.out.print("O");
				else System.out.print("X");
			}
			System.out.println("\n");
		}
		System.out.println(" - - - - - - - - - - - - - ");
	}

}
