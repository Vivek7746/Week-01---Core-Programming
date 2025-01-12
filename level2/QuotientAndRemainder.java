import java.util.Scanner;
class QuotientAndRemainder{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking both numbers as inputs
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		// Finding Quotient and Remainder
		int Quotient = number1/number2;
		int Remainder = number1%number2;
		
		System.out.print("The Quotient is " + Quotient + " and Remainder is " + Remainder + " of two number " + number1 + " and " + number2);
	}
}