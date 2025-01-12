import java.util.*;
class CanTheyVote{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking a variable age and taking it as an input for the user
		int age = input.nextInt();
		
		// Taking a boolean variable and assuming they can't vote
		boolean CanVote = false;
		
		// Checking the legal age 
		if(age >= 18) CanVote = true;
		
		// Displaying the answer
		if(CanVote) System.out.print("The person's age is " + age + " and can vote");
		else System.out.print("The person's age is " + age + " and cannot vote");
	}
}