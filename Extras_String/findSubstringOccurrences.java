import java.util.*;
class findSubstringOccurrences{
	
	static int countOccurrences(String str, String substr){
		
		// Creating a variable to count the substring
		int substringcount = 0;
		
		// Iterating over str string at every index
		for(int i = 0; i < str.length(); i++){
			int cntcheck = 0;
			for(int j = 0, k = i; j < substr.length() && k < str.length(); j++, k++){
				if(str.charAt(k) == substr.charAt(j)) cntcheck++;
			}
			
			// Checking if the total number matched = substr length
			if(cntcheck == substr.length()) substringcount++;
		}
		
		return substringcount;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Taking input as a String from the user
		String str = input.next();
		String substr = input.next();
		
		// Calling method to remove dublicate
		int result = countOccurrences(str, substr);
		
		// Displaying the result
		System.out.print(substr + " has occurred " + result + " times in " + str);

		input.close();
	}
}