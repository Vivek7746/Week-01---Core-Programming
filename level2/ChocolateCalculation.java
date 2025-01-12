import java.util.*;
class ChocolateCalculation{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Creating variables total number of students and chocolates
		int numberOfStudents, numberOfChocolates;
		
		// Taking the value of variables from the user
		numberOfStudents = input.nextInt();
		numberOfChocolates = input.nextInt();
		
		System.out.print("The number of chocolates each child gets is " + (numberOfChocolates/numberOfStudents) + " and the number of remaining chocolates are " + (numberOfChocolates%numberOfStudents));

	}
}