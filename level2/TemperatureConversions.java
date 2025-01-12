import java.util.Scanner;
class TemperatureConversions{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Creating a Fahrenheit variable
		double Fahrenheit;
		
		// Taking these value of celsius from the user
		Fahrenheit = input.nextInt();
		
		// Converting Fahrenheit to Celsius
		double celsiusResult = ((Fahrenheit-32)*5/9);
		
		// Displaying the Results
		System.out.print("The " + Fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
	}
}