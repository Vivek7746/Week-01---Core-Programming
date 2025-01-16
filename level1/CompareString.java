import java.util.*;
class CompareString{
	
	// Custom method to check wheather the string are equal or not
	static boolean Compare(String str1, String str2){
		
		// they have to equal in size
		if(str1.length() != str2.length()) return false;
		
		// checking each character
		for(int i = 0; i < str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)) return false;
		}
		
		// Strings are equal if we get here
		return true;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking two string to compare from the user
		System.out.print("Enter the first string ");
		String str1 = input.next();
		System.out.print("Enter the second string ");
		String str2 = input.next();
		
		boolean comparision = Compare(str1, str2);
		
		// Comparing Strings using in build method
		boolean inBuiltcomparision = str1.equals(str2);
		
		// Displaying the answer
		System.out.println("Using custom comparision, the condition that both the strings are equal is " + comparision);
		System.out.println("Using in built comparision, the condition that both the strings are equal is " + inBuiltcomparision); 
	}
}