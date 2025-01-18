import java.util.*;
class Palindrome{
	
	static boolean isPalindrome(String str){
		
		// Iterating over the string and comparing elements [0, n-1], [1, n-2] ...
		for(int i = 0; i < str.length(); i++){
			
			// False condition
			if(str.charAt(i) != str.charAt(str.length()-i-1))
				return false;
		}
		
		// If if we get here this means the string is Palindrome
		return true;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Taking input as a String from the user
		String str = input.next();
		
		// Displaying the output by calling the method
		System.out.print("The statement that " + str + " is a Palindrome is " + isPalindrome(str));

		input.close();
	}
}