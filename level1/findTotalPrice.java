import java.util.Scanner;
class findTotalPrice{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking Price per Unit as an input
		int PricePerUnit = input.nextInt();
		
		// Taking Quantity as an input
		int Quantity = input.nextInt();
		
		// Total Price will be Quantity times per Unit 
		int TotalPrice = PricePerUnit * Quantity;
		
		System.out.print("The Total purchase price in INR is " + TotalPrice + " if the quantity is " + Quantity + " and unit price in INR is " + PricePerUnit);
	}
}