
public class javyWeek3 {

	public static void main(String[] args) {
		// arrays
		/*
		 * What is an array? It is a list. Or a storage device. Can make an array of every single type
		 * [] = array
		 * ints are by default 0 whereas strings are null
		 */
		int [] x = new int [10];//by default it will be zero when the array isn't completely filled out 
		x[0] = 17;
		x[1] = 24;
		x[2] = 64;
		
		System.out.println(x[1]);
		
		int [] y = {34, 15, 16, 18, 19};//usually with a smaller sample size of values

		
		int [] z = new int [1000];
		//initialization with a for loop
		for(int j =  0; j < z.length; j++) {
			z[j] = (int)(Math.random() * 1000);
			//System.out.println(z[j] + " ");
		}
		//Enhanced for loop can be call a for each loop
		//for each loop below
		for(int j: z) {
			System.out.println(j);
		}
		
		
	}

}
