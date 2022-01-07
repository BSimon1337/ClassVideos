
import java.util.Scanner;

public class Objects {

	public static void main(String[] args) {
		
		
		int age = 34;//primitive data types are just a piece of information
		/*
		 * all primitives are lower case and all objects are upper case.
		 * this is a java naming thing
		 */
		String name = "Sally Mae"; //strings are objects?
		System.out.println(name.length());//java docs has all the methods
		System.out.println(name.charAt(4));//methods allow you to do a bunch of things with objects
		
		Scanner s = new Scanner(System.in);
		
		int[] numbers = new int[3]; //arrays are methods. with objects you need to use "new"
		System.out.println(numbers.length); //any time you call a method you need parentheses
		

	}

}
