import java.util.*;
class removeDuplicate{
	
	static String Remove(String str){
		
		// making an array of 26 to keep track of the dublicates 
		int[] done = new int[26];
		
		// Creating a variable to store the final answer
		String res = "";
		
		for(int i = 0; i < str.length(); i++){
			// checking if already done with this character
			if(done[str.charAt(i)-'a'] == 0){
				done[str.charAt(i)-'a'] = 1;
				res += str.charAt(i);
			}
		}
		
		return res;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Taking input as a String from the user
		String str = input.next();
		
		// Calling method to remove dublicate
		String result = Remove(str);
		
		// Displaying the result array the calling the method of removal
		System.out.print("After removing dublicates from the string " + str + ", we get " + result);

		input.close();
	}
}