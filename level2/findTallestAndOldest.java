import java.util.*;
class findTallestAndOldest{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating variables for Amar's, Akbar's and Anthony's height and age
			
			// Taking ages as an input 
			int amarAge = input.nextInt();
			int akbarAge = input.nextInt();
			int anthonyAge = input.nextInt();
			
			// Taking heights as an input 
			int amarHeight = input.nextInt();
			int akbarHeight = input.nextInt();
			int anthonyHeight = input.nextInt();
			
			// Finding the youngest friend
			if(amarAge <= akbarAge && amarAge <= anthonyAge){
				System.out.print("Amar is the youngest");
			}
			else if(akbarAge <= amarAge && akbarAge <= anthonyAge){
				System.out.print("Akbar is the youngest");
			}
			else if(anthonyAge <= amarAge && anthonyAge <= akbarAge){
				System.out.print("Anthony is the youngest");
			}
			
			System.out.println();
			
			// Finding the tallest friend 
			if(amarHeight >= akbarHeight && amarHeight >= anthonyHeight){
				System.out.print("Amar is the tallest");
			}
			else if(akbarHeight >= amarHeight && akbarHeight >= anthonyHeight){
				System.out.print("Akbar is the tallest");
			}
			else if(anthonyHeight >= amarHeight && anthonyHeight >= akbarHeight){
				System.out.print("Anthony is the tallest");
			}
	}
}