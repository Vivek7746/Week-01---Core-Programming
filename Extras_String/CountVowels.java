import java.util.*;
class CountVowels{
	
	static int[] findcount(String str){
		
		// Taking a variable vowel count
		int vowelcount = 0;
		
		// Looping over the string to find number of vowels
		for(int i = 0; i < str.length(); i++){
			
			// Vowel condition
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				vowelcount++;
			}
		}
		
		// Consonants will the difference between the length of the str and vowelcount
		int consonantcount = str.length() - vowelcount;
		
		int[] toreturn = {vowelcount, consonantcount};
		return toreturn;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking input as a String from the user
		String str = input.next();
		
		// Calling method to find the Consonants and vowel 
		int[] array = findcount(str);
		
		// Displaying the actual count
		System.out.print("There are " + array[0] + " vowels and " + array[1] + " consonants in the string " + str);
		
		input.close();
	}
}