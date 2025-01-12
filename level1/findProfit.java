class findProfit{
	public static void main(String[] args){
		
		// Given Cost and Selling Prices
		double CostPrice = 129;
		double SellingPrice = 191;
		
		// Profit
		double Profit = SellingPrice - CostPrice;
		
		// Profit percentage
		double ProfitPercentage = (Profit/CostPrice) * 100;
		
		System.out.print("The Cost Price is INR " + CostPrice + " and Selling Price is INR " + SellingPrice + "\nThe Profit is INR " + Profit + " and the Profit Percentage is " + ProfitPercentage);
	}
}