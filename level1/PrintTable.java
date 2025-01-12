import java.util.*;
class PrintTable{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Initialising the array Table which will Store the result
		int Table[] = new int[10];
		
		// Creating a Variable Number and taking it as an input 
		int number = input.nextInt();
		
		// Storing multiplication Results in the Table array 
		for(int index = 0; index < 10; index++){
			
			// Zero based indexing so had to do add one to the index
			Table[index] = number * (index+1);
		}
		
		// Displaying the Table 
		for(int index = 0; index < 10; index++){
			System.out.println(number + " * " + (index+1) + " = " + Table[index]);
		}
	}
}