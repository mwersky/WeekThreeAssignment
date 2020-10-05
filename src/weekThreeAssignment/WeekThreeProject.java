package weekThreeAssignment;

public class WeekThreeProject {

	public static void main(String[] args) {

		//Hello! due to the complexity of this assignment I coppied its' contents into my code and will use it to help keep my things focused. I MAY move them around ;)
		String brkLn = "_________________________";
		
		
		
		
		System.out.println("1) Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.");
		System.out.println(" ");
		 
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 2}; //2 is my added variable for question 3
			
			System.out.println("Current Array elements:");
			for(int i = 0; i < ages.length; i++) {
				System.out.println(ages[i]);
			}
			
		System.out.println(brkLn);	
		System.out.println("2) Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.");		
		
		int	x = 0; //Used these to store the values of the elements I needed. Again maybe a better way but this worked for me.
		int y = 0;
			
			for(int i = 0; i < ages.length; i++) {
				if(i == 0){
					x =+ ages[i];
				} else if (i < ages.length - 1) { //I admittedly don't fully know why the -1 is necessary but... yeah. doesn't work without it.
								//there MIGHT be a nicer way to do this... but I noticed if you leave it blank it does nothing?		
				} else {
					y =+ ages[i];
					System.out.println(x - y);
				}
			}
		System.out.println(brkLn);		
		System.out.println("3) Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).");
		System.out.println("");
		
		System.out.println("I added a 2, as seen above and the code clearly works still.");
		System.out.println(brkLn);
		
		
		System.out.println("4) Use a loop to iterate through the array and calculate the average age. Print the result to the console.");		
			
			int total = 0; //value holder
				
			for(int i = 0; i < ages.length; i++) {
				total = total + ages[i];
			}
			int average = total / ages.length;
			System.out.println("The Average Age of our list of ages in our array is " + average + ".");
		
			System.out.println(brkLn);		
		System.out.println("5) Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.");
		System.out.println(" ");
		
		String[] names = new String[6];
		
			names[0] = "Sam";
			names[1] = "Tommy";
			names[2] = "Tim";
			names[3] = "Sally";
			names[4] = "Buck";
			names[5] = "Bob";

			
			System.out.println("The Array:"); //Just to print out the array in the console. I think the presentation is nice.
			for (int i = 0 ; i < names.length; i++) {
				System.out.println(names[i]);
			}
		
		
		System.out.println(brkLn);
		System.out.println("6) Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.");
		System.out.println(" ");
		
		int sum = 0;
		for (String name : names) { //and the answer...
			sum = name.length() + sum;			
		}
		
		System.out.println("There are " + sum + " total characters in my Array."); //explains itself.
		
		
		System.out.println(brkLn);
		System.out.println("7) Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.");
		System.out.println(" ");
		
		
		for (int i = 0 ; i < names.length; i++) { //I'm not sure this method here counts but this was the first way I thought of to 
			if (i < names.length - 1) {
				System.out.print(names[i] + ", ");	//So I know the question asked for spaces but I feel like the comma + a space is functionally the same.
			} else {
				System.out.print("and " + names[i] + "."); //plus you can do this at the end and make it look like it has proper structure.
			}	}		
		System.out.println("");
	
		
		System.out.println(brkLn);
		System.out.println("8) How do you access the last element of any array?");
		System.out.println("");
		
		System.out.println("I don't know how and couldn't figure it out on my own with the time I had.");
		
		
		
		System.out.println(brkLn);
		System.out.println("9) How do you access the first element of any array?");
		System.out.println("");
		
		System.out.println("using arrayName[0] which when adjusted for this array gives you " + names[0]);
		
		System.out.println(brkLn);
		System.out.println("10) Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.");
		System.out.println("");
		
		System.out.println("New array :");
		int[] nameLengths = new int[6];
			
			nameLengths[0] = 0;
			nameLengths[1] = 0;
			nameLengths[2] = 0;
			nameLengths[3] = 0;
			nameLengths[4] = 0;
			nameLengths[5] = 0;
	
			int newSum = 0;
			for (int i = 0; i < names.length; i++) { 
				newSum = names[i].length();
				nameLengths[i] = newSum;
				System.out.println(names[i] + " is " + nameLengths[i] + " letters.");
			}
			
		System.out.println(brkLn);
		System.out.println("11) Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.");
		System.out.println(" ");
			
			int newNewSum = 0;
				
				for (int i = 0; i < nameLengths.length; i++) {
					newNewSum = newNewSum += nameLengths[i];	
				}
				System.out.println("The total number of characters in this array is " + newNewSum + ".");
		
				System.out.println(brkLn);
				System.out.println("See Code Screenshot for remaining 7 questions");
				System.out.println(brkLn);
	}
		//12) Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	
		public static String multiplyString(String str, int num) {
			String result = "";
			for (int i = 0; i < num; i++) {
			result = result += str;
			}
			return result;
		}
	
		//13) Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	
		public static String createFullName(String firstName, String lastName) { 
			return firstName + " " + lastName;
		}
			
		//14) Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		public static int sumArray(int[] numbers) {
			int sum = 0; 
			for (int number : numbers) { 
				sum += number;
				
			} if (sum > 100) {
			return sum; 
		} else {
			return 0;
		}
		}
			
		//15) Write a method that takes an array of double and returns the average of all the elements in the array.
		
		public static double calculateAverage(double[] numbers) { //similar idea as int
			double sum = 0;
			for (double number : numbers) {
				sum += number;
				
			}
			return sum / numbers.length; //this divides by the numbers of variables so this would basically give you your average.
		}
			
		//16) Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			
		/*
		 * I really tried to understand interacting with two arrays but I haven't had enough time to understand enough to answer.
		 */
			
		//17) Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			
		public static boolean willBuyDrink(boolean isHotInside, double moneyInPocket) {
			if(isHotInside == true && moneyInPocket >= 10.50) {
				return true;
			} else {
				return false;
			} //Ok this one was honestly a total brain puzzle. I was TICKLED when it actually worked.
				
		}
			
		//18) Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		/* 
		 * Sorry I honestly ran out of time for this one due to moving and I'm just too brain dead to be more creative.
		 */
	

	
	
}
