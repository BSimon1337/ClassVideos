import java.util.Arrays;
import java.util.Scanner;

public class javyWeekThreePartTwo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//System.out.println("What is your name?");
		//String name = kb.next();
		
		//helloWorld(name);//you have to send the method info
		//int x = 5, y = 7;
		//int a = x + y;
		//int z = multiplier(7);
		//System.out.println(z * 7);
		
		//System.out.println("Please enter first number: ");
		//int a = kb.nextInt();
		//System.out.println("Please enter second number: ");
		//int b = kb.nextInt();
		//System.out.println(multiplier(a, b));//sent the method the information for output
		
		int [] x = new int[100];
		
		for(int i = 0; i < x.length; i++) {
			x[i] = (int)(Math.random() * 1000);
			System.out.println(x[i] + " ");
		}
		System.out.println();
		Arrays.sort(x);
		for(int j : x) {
			System.out.println(j + " ");
		}
		
		
	}
	
	public static void helloWorld (String name) {//public means anyone can use it. hello world is the name of the method. void is the return type
		System.out.println("Hello " + name + "!!!");//parameters are what you must determine for the method to be used
	}
	
	public static int multiplier(int a, int b) {//when this is all done we need to send the method an int
		return a * b;
	}
	//method overloading. same name but different parameters
	public static double multiplier(double a, double b) {//when this is all done we need to send the method an int
		return a * b;
		
	}
	public static int multiplier(int a, int b, int c) {//when this is all done we need to send the method an int
		return a * b;
	}

}
