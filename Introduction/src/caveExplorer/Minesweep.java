package caveExplorer;

public class Minesweep {

	public static void main(String[] args) {
		boolean[][] mines = new boolean[6][6];
		createMines(mines,10);
		String[][] field = new String[mines.length][mines[0].length];
		matchValues(field,mines);
		printPic(field);
	}

	private static void printPic(String[][] field) {
		// TODO Auto-generated method stub
		
	}

	private static void matchValues(String[][] field, boolean[][] mines) {
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col < field[0].length;col++){
				if(mines[row][col]){
					field[row][col] = "X";
				}
				else{
					field[row][col] = countAdjacent(mines,row,col);
				}
			}
		}
	}

	private static String countAdjacent(boolean[][] mines, int r, int c) {
		int count = 0;
		//loop thru row above
		for(int row = r-1; row <= r+1; row++){
			
		//loop thru col left to col right
			for(int col = c - 1; col <= c + 1; col++){
				//exclude this element when counting
				if(row != r && col != c){
					if(row >= 0 && row < mines.length && col >=0 && col < mines[row].length){
						
					}
				}
			}
		}
		return null;
	}

	private static void createMines(boolean[][] mines, int numberOfMines) {
		while(numberOfMines > 0){
			int row = (int)(Math.random() * mines.length);
			int col = (int)(Math.random() * mines[0].length);
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines--;
			}
		}
		
	}

}
