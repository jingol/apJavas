/**
 * 
 */
package DataTypes;


public class datatypes {

	
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
		
			

	}

}
