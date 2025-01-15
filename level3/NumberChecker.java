import java.util.*;
class NumberChecker{
	
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
	
	// Checking Duck condition
	static boolean checkDuck(int number){
		
		// Creating an array 
		int arr[] = store(number);
		
		// Checking if zero exists
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 0) return false;
		}
		
		return true;
	}
	
	// Finding Armstrong number
	static int findArmstrong(int number){
		
		// Creating an array 
		int arr[] = store(number);
		
		int ArmstrongNumber = 0;
		// Iterating over the array 
		for(int i = 0; i < arr.length; i++){
			ArmstrongNumber += Math.pow(arr[i], 3);
		}
		
		return ArmstrongNumber;
	}
	
	// Finding the largest and the second largest 
	static int[] largest(int number){
		
		// Creating an array 
		int arr[] = store(number);
		
		// let the largest and the second largest to be arr[0]
		int lar1 = arr[0], lar2 = arr[0];
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] >= lar1){
				lar2 = lar1;
				lar1 = arr[i];
			}
		}
		int[] finalarray = {lar1, lar2};
		
		return finalarray;
	}
	
	// Finding the smallest and the second smallest 
	static int[] smallest(int number){
		
		// Creating an array 
		int arr[] = store(number);
		
		// let the smallest and the second smallest to be arr[0]
		int small1 = 10000000, small2 = 10000000;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < small1){
				small2 = small1;
				small1 = arr[i];
			}
			else if(arr[i] < small2){
				small2 = arr[i];
			}
		}
		int[] finalarray = {small1, small2};
		
		return finalarray;
	}
	
	public static void main(String[] args){
		
		Scanner input =  new Scanner(System.in);
		
		// Taking the number as an input from the user as int
		int number = input.nextInt();
		
		int larger[] = largest(number);
		int smaller[] = smallest(number);
		
		// Displaying results

		// Count of the digits
		System.out.println("The number " + number + " has " + count(number) + " digits");
		
		// Calling Duck check method
		System.out.println("The statement that given number is a Duck number is " + checkDuck(number));
		
		// Calling the Armstrong method
		System.out.println("The Armstrong number of the number " + findArmstrong(number));
		
		// Calling to find the largest and the second largest digit 
		System.out.println("The largest digit in the number in " + number + " is " + larger[0]);
		System.out.println("The second largest digit in the number in " + number + " is " + larger[1]);
		
		// Calling to find the smallest and the second smallest digit 
		System.out.println("The smallest digit in the number in " + number + " is " + smaller[0]);
		System.out.println("The second smallest digit in the number in " + number + " is " + smaller[1]);
	}
}