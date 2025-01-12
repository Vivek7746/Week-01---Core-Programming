import java.util.*;
class CanVoteOrNot{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Initialising the array which will contain ages of Students
		int StudentAges[] = new int[10];
		
		// Taking ages as input from the user
		for(int index = 0; index < 10; index++){
			StudentAges[index] = input.nextInt();
		}
		
		// Traversing the array of ages of Students 
		for(int index = 0; index < 10; index++){
			
			// Current Students age
			int age = StudentAges[index];
			
			// Handling Invalid Case
			if(age <= 0) System.out.println("Invalid Case");
			
			// Handling when a Student can vote
			else if(age >= 18) System.out.println("The Student with the age " + age + " can vote");
			
			//Handling when a Student can't vote 
			else System.out.println("The Student with the age " + age + " can not vote");
		}
	}
}