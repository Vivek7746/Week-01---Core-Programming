import java.util.Scanner;
class TotalHandShakes{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking total Number of Students as an input
		int TotalStudents = input.nextInt();
		
		// Finding total combinations of Handshakes
		int HandshakesPossible = (TotalStudents*(TotalStudents-1))/2;
		
		System.out.print("Maximum handshakes possible among " + TotalStudents + " students are " + HandshakesPossible);
	}
}