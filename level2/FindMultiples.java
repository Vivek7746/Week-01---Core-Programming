import java.util.*;
class FindMultiples{
	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);
		
		// Taking a number from the user
		int number = input.nextInt();
		
		// Finding all the multiples
		System.out.print("The multiples of " + number + " under 100 are ");
		for(int times = 1; number*times <= 100; times++){
			
			// This will be the multiple of number
			System.out.print(number*times + " ");
		}
	}
}