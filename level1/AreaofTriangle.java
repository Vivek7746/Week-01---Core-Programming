import java.util.Scanner;
class AreaofTriangle{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking Base as input 
		float Base = input.nextFloat();
		
		// Taking Height number as input 
		float Height = input.nextFloat();
		
		// Finding Area of Triangle
		double Area = 0.5 * Base * Height;
		
		System.out.print("Area of Triangle with Base " + Base + " and Height " + Height + " is " + Area);
	}
}