import java.util.*;
class ReverseString{
	
	static String reversetheString(String str){
		
		// Initialising the new string temp
		String temp = "";
		
		// Iterating from the end to the beginning of the string(str)
		for(int i = str.length() - 1; i >= 0; i--){
			temp += str.charAt(i);
		}
		
		return temp;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking a string from the user
		String str = input.nextLine();
		
		String reversed_str = reversetheString(str);
		
		// Displaying the reversed string 
		System.out.print("String before : " + str + "\nString after : " + reversed_str);

		input.close();
	}
}