import java.util.*;
class compareStrings{
	
	static String[] checkString(String str1, String str2){
		
		// let the smaller size be the smaller
		String smaller, greater;
		if(str1.length() <= str2.length()){
			smaller = str1;
			greater = str2;
		}
		else{
			smaller = str2;
			greater = str1;
		}

		// Array of String to store smaller string 
		// at 0th index and greater string at 1th index
		String[] result = new String[2];
		result[0] = smaller; 
		result[1] = greater;

		// Traversing on smaller string and comparing each character
		for(int i = 0; i < smaller.length(); i++){
			
			if(smaller.charAt(i) < greater.charAt(i)){
				break;
			}
			else if(smaller.charAt(i) > greater.charAt(i)){
				String temp1 = result[0];
				result[0] = result[1];
				result[1] = temp1;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Taking input as a String from the user
		System.out.print("Enter str1 : ");
		String str1 = input.next();
		System.out.print("Enter str2 : ");
		String str2 = input.next();

		// Method to call [smaller, greater] string
		String result[] = new String[2];
		result = checkString(str1, str2);

		// Displaying the result
		System.out.println(result[0] + " is lexicographically smaller than " + result[1]);

		input.close();
	}
}