import java.util.*;
class Toggle{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// Taking input as a String from the user
		String str = input.next();
		
		// Creating a variable toggled String 
		String toggledstr = "";
		
		/*for(int i = 0; i < str.length(); i++){
			
			// Checking if the char is in LowerCase 
			if('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
				char toadd = (char)(str.charAt(i) - 'a' + 'A');
				toggledstr += toadd;
			}
			// Checking if the char is in LowerCase 
			else if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
				char toadd = (char)(str.charAt(i) - 'A' + 'a');
				toggledstr += toadd;
			}
		}*/
		
		for(int i = 0; i < str.length(); i++){
			
			char ch = str.charAt(i);
			// Checking if the ch is in Lower case
			if(ch == Character.toLowerCase(ch)) toggledstr += Character.toUpperCase(ch);
			
			// Checking if the ch is in Upper case
			if(ch == Character.toUpperCase(ch)) toggledstr += Character.toLowerCase(ch);
		}
		
		System.out.print("The str " + str + " after toggle is " + toggledstr);

		input.close();
	}
}