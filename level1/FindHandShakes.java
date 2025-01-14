import java.util.*;
class FindHandShakes{
	
	// Method to find total number of Hand Shakes among students
	public static int numberofhandshakes(int students){
		// returning total number of handshakes
		return (students*(students-1)) / 2;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking Number of students as an input
		int students = input.nextInt();
		
		// Calling the method
		int handshakescount = numberofhandshakes(students);
		
	System.out.print( "The number of maximum handshakes among " + students + " is " + handshakescount);
	}
}