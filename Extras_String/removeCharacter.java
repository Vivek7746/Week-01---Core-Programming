import java.util.*;
public class removeCharacter {

    static String removeChar(String str, char toremove){
        
        // Initialising a Resultant string
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != toremove){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Taking string input from the user
        System.out.print("Enter the string : ");
        String string = input.nextLine();
        System.out.print("Enter the character you want to remove : ");
        char toremove = input.next().charAt(0);;

        // Displaying the result string
        System.out.print("After removing " + toremove + " from the string " + string + ", we get " + removeChar(string, toremove));

        input.close();
    }
}
