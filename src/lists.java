import java.util.ArrayList;
import java.util.List;

public class lists {

	public static void main(String[] args) {
		String [] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "F150";
		cars[2] = "Mustang";
		
		
		//a list is better version of an array
		
		//signature for list is List<E> list of e where e is the generic that will be replaced with the type
		//List<String> reads as list of string
		//lists are more dynamic and easy to change
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		sports.remove(1);
		
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		//cannot use primitive data types for lists
		
		List<Integer> numbers = new ArrayList<Integer>();//<> called a diamond operator
		
		
		

	}

}
