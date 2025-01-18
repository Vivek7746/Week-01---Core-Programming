import java.util.*;
public class ReplaceChar {

    static String Replace(String string, char toreplace, char toinsert){

        // Initialising the final String
        String updatedString = "";

        for(int i = 0; i < string.length(); i++){

            // Normal case
            if(string.charAt(i) != toreplace){
                updatedString += string.charAt(i);
            }
            // if we encounter the character to replace
            else updatedString += toinsert;
        }
        
        return updatedString;
    }
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        // Taking String as an input
        System.out.print("Enter the string : ");
        String string = input.next();
        System.out.print("Enter the char to replace : ");
        char toreplace = input.next().charAt(0);
        System.out.print("Enter the char to replace : ");
        char toinsert = input.next().charAt(0);
        
        // Calling a method to Replace string
        string = Replace(string, toreplace, toinsert);

        // Displaying the resultant string
        System.out.print("String becomes " + string);

        input.close();
    }
}
