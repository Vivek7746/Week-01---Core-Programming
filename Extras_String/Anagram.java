import java.util.*;
public class Anagram {

    static boolean checkAnagram(String str1, String str2){
        
        // Creating two array to store counts of each character
        int[] str1count = new int[26];
        int[] str2count = new int[26];

        // Iterating over both string and Populating array's values
        for(int i = 0; i < str1.length(); i++){
            str1count[str1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < str2.length(); i++){
            str2count[str2.charAt(i) - 'a']++;
        }

        // Checking if they are Anagram
        for(int i = 0; i < 26; i++){
            if(str1count[i] != str2count[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Taking two strings from the user
        System.out.print("Enter str1 : ");
        String str1 = input.next();
        System.out.print("Enter str2 : ");
        String str2 = input.next();

        // Displaying the result
        System.out.print("is " + str1 + " an anagram of " + str2 + "? " + checkAnagram(str1, str2));
        
        input.close();
    }
}
