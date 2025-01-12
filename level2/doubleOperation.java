import java.util.Scanner;
class doubleOperation{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Creating a, b and c of double datatype
		double a, b, c;
		
		// Taking these values from the user
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		// Performing operations like a + b *c, a * b + c, c + a / b, and a % b + c
		double Result1 = a + b * c;
		double Result2 = a * b + c;
		double Result3 = c + a / b;
		double Result4 = a % b + c;
		
		// Displaying the Results
		System.out.print("The Results for a + b *c, a * b + c, c + a / b, and a % b + c are " + Result1 + ", " + Result2 + ", " + Result3 + " and " + Result4 + " respectively");
	}
}