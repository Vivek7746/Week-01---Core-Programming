import java.util.*;
class WhileNaturalSum{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable Natural number
			int natural = 0;
			
			// Taking input from the user
			natural = input.nextInt();
			
			// Finding sum using while loop
			int LoopSum = 0;
			int tempNatural = natural;
			while(tempNatural >= 1){
				LoopSum += tempNatural;
				tempNatural--;
			}
			
			// Finding sum using Maths formula
			int FormulaSum = (natural * (natural+1))/2;
			
			System.out.println("Sum of Natural number using while loop is " + LoopSum);
			System.out.println("Sum using Formula is " + FormulaSum);
	}
}