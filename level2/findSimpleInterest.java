import java.util.*;
class findSimpleInterest{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Creating variables Principal, Rate and Time
		int Principal, Rate, Time;
		
		// Taking the value of variables from the user
		Principal = input.nextInt();
		Rate = input.nextInt();
		Time = input.nextInt();
		
		// Finding Simple Interest using Formula
		double SimpleInterest = (Principal*Rate*Time)/100.00;
		
		System.out.print("The Simple Interest is " + SimpleInterest + " for Principal, " + Principal + " Rate of Interest, " + Rate + " and Time " + Time);


	}
}