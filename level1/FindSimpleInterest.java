import java.util.*;
class FindSimpleInterest{
	
	// Method to find Simple Interest
	public static double findSI(double principal, double rate, double time){
		// returning Simple interest 
		return (principal*rate*time)/100;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking Principal, Rate and Time as input from the user
		double principal = input.nextDouble();
		double rate = input.nextDouble();
		double time = input.nextDouble();
		
		// Calling the method
		double SimpleInterest = findSI(principal, rate, time);
		
	System.out.print( "The Simple Interest is " + SimpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
	}
}