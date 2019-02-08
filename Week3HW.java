
public class Week3HW {

	public static void main(String[] args) {
		
		int[] ages = new int[8];
			
			ages[0] = 3;
			ages[1] = 9;
			ages[2] = 23;
			ages[3] = 64;
			ages[4] = 2;
			ages[5] = 8;
			ages[6] = 28;
			ages[7] = 93;
	
			//Subtract first element in array from last element in array
			System.out.println(ages[ages.length - 1] - ages[0]);
			//loop to calculate average age
			int sum = 0;
			for (int i : ages) {
				sum += i;	
			}
			//average is a double but sum is an integer so multiply by a double converts sum to double
			double average =  (double)sum / ages.length;
			System.out.println(average);

		String[] names = new String[6];
			
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//average number of letters per name
		for(String charLength : names){
			System.out.println((double)charLength.length() / names.length);
		}
		//concatenate all the names together, separated by spaces
		for (String name : names) {
			System.out.print(name + " ") ;
		}
		
		int[] nameLengths = new int [1];
		//a loop to iterate over the previously created names array and add the length of each name to the nameLengths array
		for(int nameLength : nameLengths) {
			for(String charLength : names){
				System.out.println(charLength.length()); 
			}	
		}
		//a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array
		int suma = 0;
		for ( int i = 0; i < nameLengths.length; i++){
			suma += nameLengths[i];
			System.out.println(suma);
		}
		
		System.out.println(multiplyString("Hello", 3));
		System.out.println(name("John", "Smith"));
		
		int[] myArray = new int[3];
		myArray[0] = 3;
		myArray[1] = 50;
		myArray[2] = 80;
		
		//System.out.println(sumArray(myArray));
		
		double[] newArray = new double[3];
		newArray[0] = 1.5;
		newArray[1] = 2.5;
		newArray[2] = 400.5;
		
		//System.out.println(average(newArray));
		
		double[] newArrayOne = new double[3];
		newArrayOne[0] = 1.5;
		newArrayOne[1] = 3.5;
		newArrayOne[2] = 4.5;
		
		//System.out.println(averageTwo(newArray, newArrayOne));
		
		boolean isHotOutside = true;
		double moneyInPocket = 12.0;
		
		//System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		//This is an array of class grades
		double[] classGrade = new double[5];
		classGrade[0] = 70.0;
		classGrade[1] = 50.0;
		classGrade[2] = 35.0;
		classGrade[3] = 100.0;
		classGrade[4] = 100.0;
		
		System.out.println(myExample(classGrade));
		}
			
	public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}
	
	public static String name(String firstName, String lastName) {
		String fullName = (firstName + " " + lastName);
		return fullName;
	}
	
	public static boolean sumArray(int[] numbers) {
		int sum = 0;
		for(int myArray : numbers) {
			sum += myArray;
		}
		if (sum > 100) {
			return true;
		}
		return false;
	}
	
	public static double average(double[] number) {
		double sum = 0;
		for (double num : number) {
			sum += num;
		}
		return sum / number.length;
	}
	
	public static boolean averageTwo(double[] num, double[] mun) {
		double sum = 0;
		double mus = 0;
		for (double n : num) {
			sum += n;
		}
		for (double no : mun) {
			mus += no;
		}
		if ((sum / num.length) > (mus / mun.length)) {
			return true;
		}
		return false;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside = true && moneyInPocket > 10.5) {
			return true;
		}
		return false;
	}
	//This method is used to find whether one will pass/fail a class depending on their grades average posted in the array.
	//I created this method to see how to output a string when you have a integer array
	public static String myExample(double[] number) {
		double sum = 0;
		for (double num : number) {
			sum += num;
		}
		if (sum / number.length > 70.0) {
			return "You will pass the class.";
		}
		return "You will fail the class.";
	}
	}


