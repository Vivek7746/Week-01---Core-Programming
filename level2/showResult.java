import java.util.*;
class showResult{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
			
			// Creating three variables to store marks of Physics, Chemistry and Maths
			int physics, chemistry, maths;
			
			// Taking input from the user
			physics = input.nextInt();
			chemistry = input.nextInt();
			maths = input.nextInt();
			
			// Calculating percentage
			double percentage = (physics+chemistry+maths)/3;
			
			// Handling percentage 80 and above
			if(percentage >= 80){
				
				System.out.print("Grade : A, Remark : (Level 4, agency-normalized standards), Marks : " + percentage);
			}
			
			// Handling percentage between 70 and 79
			else if(percentage >= 70){
				
				System.out.print("Grade : B, Remark : (Level 3, agency-normalized standards), Marks : " + percentage);
			}
			
			// Handling percentage between 60 and 69
			else if(percentage >= 60){
				
				System.out.print("Grade : C, Remark : (Level 2, below, but approaching agency-normalized standards), Marks : " + percentage);
			}
			
			// Handling percentage between 50 to 59
			else if(percentage >= 50){
				
				System.out.print("Grade : D, Remark : (Level 1, well below agency-normalized standards), Marks : " + percentage);
			}
			
			// Handling percentage between 40 to 49
			else if(percentage >= 40){
				
				System.out.print("Grade : E, Remark : (Level 1, too below agency-normalized standards), Marks : " + percentage);
			}
			
			// Handling case 39 and below
			else{
				
				System.out.print("Grade : R, Remark : (Remedial standards), Marks : " + percentage);
			}
	}
}