package datatypes;

public class DoubleInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5.0/2);
		//5.0 is a double
		//2 is a int
		System.out.println((double) 5/2);
		//changing 5 to double is called casting
		System.out.println(5/2);
		//answer is 2 because int/int = int
		System.out.println(3+5.0/2+5*2);
		System.out.println(3.0+5/2+5*2);
		//changing place of the double makes the subsequent outputs in the
		//equation different,following order of operations it yields diff ans
		System.out.println((int)(3.0 + 5)/(2 + 5 * 2));
		//8/12 yields decimal, rounds to 0
		if(42 == 42.0) System.out.println("42 equals 42.0");
		
		double d1 = 4.64; 
		double d2 = 2.0;
		double d3 = 2.64;

		System.out.println("d1 : " + d1); 
		System.out.println("d2 : " + d2); 
		System.out.println("d3 : " + d3);  
		System.out.println("d1 - d2 : " + (d1 - d2));
		

//		String s = 1;
//		System.out.println(s);
//		cannot convert string to int
		
//		String s = (String)1;
//		System.out.println(s);
//		cannot cast int to string
		
//		String s = "1";
//		System.out.println(s);
//		works because "1" is a string
		
//		String s = ""+1;
//		System.out.println(s);
//		works because string + 1
		
//		String s = "Happy "+18+"th birthday!";
//		System.out.println(s);
//		works
		
//		String s = "Happy 18th birthday!";
//		System.out.println(s);
		 
//		String s = "Happy "+54/3+"th birthday!";
//		System.out.println(s);
		
//		String s = "Happy "+(54/3)+"th birthday!";
//		System.out.println(s);
		
//		int m = 22;
//		int n = 7;
//		System.out.println("m/n is "+(m/n));
		
//		int m = 22;
//		int n = 7;
//		System.out.println("m/n is "+((double)m/n));


	}

}
