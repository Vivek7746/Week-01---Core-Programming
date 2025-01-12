import java.util.*;
class FindBonus{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Initialising Salary and YearofExperience arrays of size 10
		double salary[] = new double[10];
		double year[] = new double[10];
		
		// Taking input of Employee's salary 
		for(int index = 0; index < 10; index++){
			salary[index] = input.nextDouble();
		}
		
		// Taking input of Employee's years of experience 
		for(int index = 0; index < 10; index++){
			year[index] = input.nextDouble();
		}
		
		// Creating two more array of Bonus amount and new salary 
		double bonus[] = new double[10];
		double newsalary[] = new double[10];
		
		// Calculating bonus amount and new salary of Employees
		for(int index = 0; index < 10; index++){
			
			// Handling 5 years of experience and above case
			if(year[index] >= 5){
				bonus[index] = (salary[index]*5)/100;
				
				// Updating the new salary 
				newsalary[index] = salary[index]+bonus[index];
			}
			// Handling 4 years of experience and less case
			else if(year[index] <= 4){
				bonus[index] = (salary[index]*2)/100;
				
				// Updating the new salary 
				newsalary[index] = salary[index]+bonus[index];
			}
		}
		
		// Displaying the results
		for(int index = 0; index < 10; index++){
			System.out.println((index+1) + " employee's Bonus amount is " + bonus[index] + " and their new salary is " + newsalary[index]);
		}
	}
}