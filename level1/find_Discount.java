import java.util.Scanner;
class find_Discount{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking University fee as an input
		int Fee = input.nextInt();
		
		// Taking offered Discount percentage as an input
		int discountPercentage = input.nextInt();
		
		// Fee After the Discount 
		int discountedFee = (Fee*discountPercentage)/100;
		int finalFee = Fee - discountedFee;
		
		System.out.print("The discount amount is INR " + discountedFee + " and final discounted fee is INR " + finalFee);
	}
}