package introUnit;

import java.util.Random;

public class Mathrandom {

	public static void main(String[] args) {
		int[] results = new int[6];
//		same as int[]results = {0,0,0,0,0,0}
		
		int totalrolls = 10000;
		
		for(int index = 0; index < totalrolls; index++){
			int roll = rollUnfairDie();
			System.out.println("Roll # " + (index + 1) + " Die is " + roll);
			results[roll - 1]++;
		}
		
		for(int i = 0; i < 6; i++){
			int percentage = (int)((double)results[i]/totalrolls * 100);
			System.out.println((i + 1) + " was rolled " + percentage  + "%" + " percent of times.");
		}

	}
	
	public static int rollFairDie(){
//		Random gen = new Random();
//		return gen.nextInt(6) + 1;		
		double rand = Math.random(); //random double (0,1)
		int roll = (int)(6 * rand); // 0,5  this is what above code does
		return roll + 1;
	}

	public static int rollUnfairDie(){
		double rand = Math.random();
		int roll = (int)(6*rand);
		if(roll == 0 || roll == 1 || roll == 2 || roll == 3)
		{
			return (int) roll + 1;
		}
		else
		{
			return roll;
		}
		
	}
}
