import java.util.*;
class forCountdown{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable Countfrom and taking it from the user
			int Countfrom = input.nextInt();
			
			// Counting it down to 1 using For loop
			for(int Currenttime = Countfrom; Currenttime >= 1; Currenttime--){
				System.out.println(Currenttime);
			}
	}
}