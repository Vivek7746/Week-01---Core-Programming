import java.util.*;
class MultiplicationTable{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Initialising the array Table which will Store the result [6,9]
		int Table[] = new int[4];
		
		// Creating a Variable Number and taking it as an input 
		int number = input.nextInt();
		
		// Storing multiplication Results in the Table array 
		for(int index = 0; index < 4; index++){
			
			// Zero based indexing so had to do add six to the index
			Table[index] = number * (index+6);
		}
		
		// Displaying the Table 
		for(int index = 0; index < 4; index++){
			System.out.println(number + " * " + (index+6) + " = " + Table[index]);
		}
	}
}