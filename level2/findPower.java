import java.util.*;
class findPower{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating a variable Number and Power
			int Number, Power;
			
			// Taking it as an input
			Number = input.nextInt();
			Power = input.nextInt();
			
			// Creating a variable FinalPower
			int FinalPower = 1;
			
			// Finding the power using for Loop
			for(int times = 1; times <= Power; times++){
				FinalPower *= Number;
			}
			
			System.out.print("Final Power is " + FinalPower);
	}
}