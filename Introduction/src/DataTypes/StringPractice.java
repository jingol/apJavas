package DataTypes;

public class StringPractice {

	public static void main(String[] args) {
//		String text = new String("Hello World!");
		String text1 = "Hello World"; //same as above,shortcut
		String text2 = "Hello ";
		String text3 = "World";
		System.out.println("Hello World");
		if (text1 .equals (text2 + text3)) //cannot use == for string
		{
			System.out.println("These strings are equal.");
		}
		
		System.out.println(text1);
		System.out.println(text2 + text3);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzva";
		if(word1.compareTo(word2) < 0){
			System.out.println("Word1 is before word2," + 
		"lexicongraphically.");
		}

	}

}
