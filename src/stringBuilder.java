
public class stringBuilder {

	public static void main(String[] args) {
		String firstName = "Sally";
		String lastName = "Smith";
		System.out.println(firstName + " " + lastName);
		
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(tripleHi);
		
		System.out.println(firstName.concat(lastName));//strings are not mutable
		System.out.println(firstName);//you should only use strings if they will not change a lot
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(fullName.toString());
		
		
		System.out.println(fullName.charAt(5));
//		System.out.println(fullName.deleteCharAt(5));
//		System.out.println(fullName.delete(1, 3));
		System.out.println(fullName.indexOf("it"));
		System.out.println(fullName.replace(4, 9, "Thompson"));
		System.out.println(fullName.reverse());
		
		/*
		 * you use a string builder when you want to dynamically create a string
		 */
	}
	
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i =0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}

}
