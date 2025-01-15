import java.util.*;
class NumberCheck2{
	
	// Method to count Digits of the number
	static int count(int number){
		
		// Counting the digits by continuously by 10
		int digits = 0;
		while(number > 0){
			digits += 1;
			number /= 10;
		}
		
		return digits;
	}
	
	// Method to count Digit sum of the number
	static int sum(int number){
		
		// Creating a variable as sum 
		int summ = 0;
		
		while(number > 0){
			summ += (number%10);
			number /= 10;
		}
		
		return summ;
	}
	
	// Method to store the digits in an array
	static int[] store(int number){
		
		// getting the size of the number using "count" method
		int n = count(number);
		
		int arr[] = new int[n];
		
		// Storing it from the last
		for(int i = n-1; i >= 0; i--){
			arr[i] = number%10;
			number /= 10;
		}
		
		return arr;
	}
	
	// Finding the sum of the square of every digits 
	static int squaresum(int number){
		
		int[] digitarray = store(number);
		
		// Initialising sum as zero
		int sum = 0;
		
		for(int i = 0; i < digitarray.length; i++){
			sum += Math.pow(digitarray[i],2);
		}
		
		return sum;
	}
	
	// Method to check Harshad number condition
	static boolean isHarshad(int number){
		int tempnum = number;
		
		// Calculating the sum of the digits
		int sum = 0;
		
		while(tempnum>0){
			sum += (tempnum%10);
			tempnum/=10;
		}
		
		return (number%sum == 0);
	}
	
	// Method to count frequency of the digits 
	static int[][] countfreq(int number){
		
		// Creating an array countdigit to store frequencies
		int[][] countdigit = new int[10][2];
		
		for(int row = 0; row < 10; row++)
			countdigit[row][0] = row;
		
		while(number > 0){
			countdigit[number%10][1]++;
			number /= 10;
		}
		return countdigit;
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking input i.e, from the user
		int number = input.nextInt();
		
		// Displaying all the results
		
		// Count of the digits
		System.out.println("The number " + number + " has " + count(number) + " digits");
		
		// Printing the sum of all the digits of the number
		System.out.println("The sum of all the digits of the given number " + number + " is " + sum(number));
		
		// Printing the sum of the square of all the digits of the number
		System.out.println("The sum of the square of digits of " + number + " is " + squaresum(number));
		
		// Checking if the given number is a Harshad number 
		System.out.println("The statement that the number " + number + " is a Harshad number is " + isHarshad(number));
		
		int countarr[][] = countfreq(number);
		
		// Printing the 2-D frequency array
		for(int i = 0; i < 10; i++){
			System.out.println("The count of " + countarr[i][0] + " is " + countarr[i][1]);
		}
	}
}