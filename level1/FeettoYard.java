import java.util.Scanner;
class FeettoYard{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking input in Feet 
		int Feet = input.nextInt();
		
		// Changing Feet to Yards
		int Yards = Feet/3;
		
		// Dividing Feets to Miles and Feets 
		int Miles = Yards/1760;
		int RemainingYards = Yards%1760;
		
		System.out.print("The value of " + Feet + " feet in Miles and Yards is " + Miles + " miles and " + RemainingYards + " yards");
	}
}