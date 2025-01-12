import java.util.*;
class FindTallest{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Initialising an array string to keep track of the name
		String[] name = {"Amar", "Akbar", "Anthony"};
		
		// Initialising height and age array of these friends
		int height[] = new int[3];
		int age[] = new int[3];
		
		// Taking input from the user
		for(int index = 0; index < 3; index++){
			height[index] = input.nextInt();
		}
		for(int index = 0; index < 3; index++){
			age[index] = input.nextInt();
		}
		
		// Finding Youngest Friend
		// Let the Youngest be Akbar
		String youngest = name[0];
		int minimumage = age[0];
		
		for(int index = 1; index < 3; index++){
			if(age[index] < minimumage){
				minimumage = age[index];
				youngest = name[index];
			}
		}
		
		System.out.println("The Youngest among all is " + youngest);
		
		// Finding tallest Friend
		// Let the tallest be Akbar
		String tallest = name[0];
		int maximumheight = height[0];
		
		for(int index = 1; index < 3; index++){
			if(age[index] > minimumage){
				maximumheight = height[index];
				tallest = name[index];
			}
		}
		
		System.out.println("The tallest among all is " + tallest);
	}
}