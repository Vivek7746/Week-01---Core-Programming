import java.util.*;
class LongestWord{
	
	static String findLongestword(String str){
		
		// Using split method to separate into words of string array 
		String[] words = str.split(" ");
		
		// Creating a variable to keep track of the maximum length
		int maxlen = 0;
		
		for(int i = 0; i < words.length; i++){
			
			// Comparing previous length to the current word
			maxlen = Math.max(maxlen, words[i].length());
		}
		
		// Returning the word with the length of maxlen 
		for(int i = 0; i < words.length; i++){
			if(words[i].length() == maxlen){
				return words[i];
			}
		}
		
		return "";
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Taking input as a String from the user
		String str = input.nextLine();
		
		// Calling method to remove dublicate
		String result = findLongestword(str);
		
		// Displaying the result
		System.out.print("In the sentence ->" + str + "<- the longest word is " + result);

		input.close();
	}
}