package jasonAndVicki;


import caveExplorer.CaveExplorer;
import caveExplorer.CaveRoom;

public class JasonGenerateField {
	public static String[][] mine;
	public static boolean mine2[][];
	public static String map;
	
	public static void generateField() {
		mine = new String[9][9];
		mine2 = new boolean[9][9];
	}
	public static void createMines() {
		int num = 10;
		while (num > 0) {
			int row = (int)(Math.random() * mine2.length);
			int col = (int)(Math.random() * mine2[0].length);
			if (!mine2[row][col]) { 
				mine2[row][col] = true;
				num--;
			}
		}
	}
	public static void matchValues() {
		for (int row = 0; row < mine.length; row++) {
			for (int col = 0; col < mine[0].length; col++) {
				if (mine2[row][col]) {
					mine[row][col] = "X";
				}
				else {
					mine[row][col] = countAdjacent(mine2, row, col);
				}
			}
		}
	}
	public static String countAdjacent(boolean[][] minefield, int r, int c) {
		int count = 0;
		count+= validAndTrue(minefield, r-1, c);
		count+= validAndTrue(minefield, r+1, c);
		count+= validAndTrue(minefield, r, c-1);
		count+= validAndTrue(minefield, r, c+1);
		count+= validAndTrue(minefield, r+1, c+1);
		count+= validAndTrue(minefield, r-1, c-1);
		count+= validAndTrue(minefield, r+1, c-1);
		count+= validAndTrue(minefield, r-1, c+1);
		
		return count + "";
	}
	public static int validAndTrue(boolean[][] minefield, int i, int j) {
		if (i >= 0 && i < mine2.length && j >= 0 && j < mine2[0].length && mine2[i][j]) {
			return 1;
		}
		return 0;
	}
	public static void printField() {
		map = " ";
        for(int i = 0; i < mine[0].length - 1; i++){
            map += "____";
        }
        map += "___\n";

public class JasonGenerateField {
	private String map;
	public static Field[][] fields;
	
	public void makeMinefield(){
		fields = new Field[9][9];
		map = " ";
		for(int i = 0; i < CaveExplorer.caves[0].length - 1; i++){
			map += "____"; //4 underscores
		}
		
		map += "___\n";//3 underscores
		
		for(int i = 0; i < 9; i++){
			//three r ows of text
			
			for(int a = 0; a < 9; a++){
				//a line of text for each row
				String text = " ";
				for(CaveRoom cr: ){
					
					if(cr.getDoor(CaveRoom.WEST) != null 
							&& cr.getDoor(CaveRoom.WEST).isOpen()){
						text += " ";				
					}
					else{
						text +="|";
					}
					if(i == 0){
						text += "   "; // 3 spaces
					}else if(i == 1){
						text += " " + cr.getContents()+ " ";
					}
					else if(i == 2){
						if(cr.getDoor(CaveRoom.SOUTH) != null 
								&& cr.getDoor(CaveRoom.SOUTH).isOpen()){
							text += "   "; // 3 spaces
						}
						else{
							text += "___"; // 3 underscores
						}
					}
				}//last caveroom in the row
				
				text += "|";
				map += text + "\n";
			}//last of the 3 text lines
		}//last row
	}
	
	
	
}	


        for(int row = 0; row <mine.length; row++){
            for(int row2 = 0; row2 < 2; row2++){
                for(int col = 0; col < mine[row].length; col++){
                    if(row2 == 1){
                        map+="|___";
                    } else{
                    	map+="|   ";
                    }
                }
                map += "|" + row + "\n";               
            }
        }
        System.out.println(map);
        System.out.println("  0   1   2   3   4   5   6   7   8");
	}
	public static void play() {
		generateField();
		createMines();
		matchValues();
		printField();
		for (int i = 0; i < mine.length; i++){ 
			for (int j = 0; j < mine[0].length; j++) {
				System.out.print(mine[i][j]);
			}
			System.out.println();
		}
		VickiCheckField.play();
	}
	
}

