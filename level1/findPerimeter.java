import java.util.Scanner;
class findPerimeter{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking Side of the Square as input
		int Side = input.nextInt();
		
		// Perimeter of square is 4 times of it's side
		int Perimeter = 4*Side;
		
	System.out.print("The length of the side is " + Side + " whose Perimeter is " + Perimeter);
	}
}