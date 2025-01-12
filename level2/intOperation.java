import java.util.Scanner;
class intOperation{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Creating a, b and c of int datatype
		int a, b, c;
		
		// Taking these values from the user
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		// Performing operations like a + b *c, a * b + c, c + a / b, and a % b + c
		int Result1 = a + b * c;
		int Result2 = a * b + c;
		int Result3 = c + a / b;
		int Result4 = a % b + c;
		
		// Displaying the Results
		System.out.print("The Results for a + b *c, a * b + c, c + a / b, and a % b + c are " + Result1 + ", " + Result2 + ", " + Result3 + " and " + Result4 + " respectively");
	}
}