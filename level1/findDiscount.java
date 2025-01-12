class findDiscount{
	public static void main(String[] args){
		
		// Total University fee of the course
		int Fee = 125000;
		
		// offered Discount percentage
		int discountPercentage = 10;
		
		// Fee After the Discount 
		int discountedFee = (Fee*10)/100;
		int finalFee = Fee - discountedFee;
		
		System.out.print("The discount amount is INR " + discountedFee + " and final discounted fee is INR " + finalFee);
	}
}