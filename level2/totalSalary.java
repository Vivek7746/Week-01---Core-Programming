import java.util.Scanner;
class totalSalary{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Creating variables for Salary and Bonus
		int Salary, Bonus;
		
		// Taking the value of Salary and Bonus from the user
		Salary = input.nextInt();
		Bonus = input.nextInt();
		
		// Displaying the Results
		System.out.print("The salary is INR " + Salary + " and bonus is INR " + Bonus + " Hence Total Income is INR + " + (Salary+Bonus));
	}
}