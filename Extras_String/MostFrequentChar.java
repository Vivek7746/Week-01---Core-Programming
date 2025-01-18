import java.util.*;
public class MostFrequentChar {

    static char findMostFrequent(String string){
        
        // Making a Hashing Array to store counts of every character
        int count[] = new int[26];

        // Creating a variable to store maximum occurrence count
        int maxcount = 0;

        for(int i = 0; i < string.length(); i++){
            
            char ch = string.charAt(i);

            // Populating the values in count array
            count[ch-'a']++;
            maxcount = Math.max(maxcount, count[ch-'a']);
        }

        // Return the char which have the maximum count
        for(int i = 0; i < 26; i++){
            if(count[i] == maxcount){
                // we got the maximum occurrence
                // Type casting into a character
                char ch = (char)('a' + i);
                return ch;
            }
        }
        return 'a';
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Taking string as input from the user
        System.out.print("Enter the string : ");
        String string = input.next();

        // Displaying the most frequent character
        System.out.print("The most frequent character in string is " + findMostFrequent(string));

        input.close();
    }
}
