import java.util.*;
class whileCountdown{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable Countfrom and taking it from the user
			int Countfrom = input.nextInt();
			
			// Counting it down to 1
			while(Countfrom >= 1){
				System.out.println(Countfrom);
				
				// Decrementing the Counter
				Countfrom--;
			}
	}
}