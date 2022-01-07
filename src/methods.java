
public class methods {

	public static void main(String[] args) {
		//this is a way to reuse code and use it when you need it. Putting a name on it
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);//calling on the method followed by the argument
		String fullName2 = createFullName("Sam", lastName);
		
		
		System.out.println(fullName);
		System.out.println(fullName2);

	}
	
	public static String createFullName(String x, String y) {
		return x + " " + y;
		
	}

}
