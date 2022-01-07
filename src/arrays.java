
public class arrays {

	public static void main(String[] args) {
		//arrays are used when you have a lot of similar data
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		
		String[] students = new String[3]; //array is an object not a primitive data type
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);


		for (int i = 0; i < students.length; i ++) {
			System.out.println(students[i]);//this replaces printing out all of the sysouts
		}
		
		System.out.println("Enhanced for loop");
		
		for (String student : students) { //for each student in students is how you read this
			System.out.println(student);
		}

	}

}
