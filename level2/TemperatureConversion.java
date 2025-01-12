import java.util.Scanner;
class TemperatureConversion{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Creating a celsius variable
		double celsius;
		
		// Taking these value of celsius from the user
		celsius = input.nextInt();
		
		// Converting Celsius to Fahrenheit
		double fahrenheitResult = (celsius * 9/5) + 32;
		
		// Displaying the Results
		System.out.print("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
	}
}