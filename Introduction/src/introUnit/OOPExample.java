/**
 * 
 */
package introUnit;

/**
 * @author Student6
 *This class is designed to contrast with the Procedural Example. It embodies
 *an object-oriented approach
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// construct a student
		Student jillian = new Senior ("Jillian", "Programmer");
		Student jordan = new Sophomore ("Jordan" , "Software");
		Student jason = new Freshman ("Jason", "run");
		jillian.talk();
		jordan.talk();
		jason.talk();
	}

}
