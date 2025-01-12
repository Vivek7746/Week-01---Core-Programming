import java.util.*;
class findBMI{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating two variable weight(kg) and height(cm) in double
			double weight, height;
			
			// Taking weight and height as an input from the user
			weight = input.nextInt();
			height = input.nextInt();
			
			// changing unit of height from cm to m 
			height /= 100.00;
			
			// Finding BMI
			double BMI = weight/(height*height);
			
			// Checking Status accordingly
			if(BMI >= 40.0) System.out.print("Obese");
			else if(BMI >= 25.0) System.out.print("Overweight");
			else if(BMI >= 18.5) System.out.print("Normal");
			else System.out.print("Underweight");
	}
}