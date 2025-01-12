import java.util.*;
class MultiArray{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Taking rows and columns as variable as input from the user
		int row = input.nextInt();
		int col = input.nextInt();
		
		// Initialising 2D array 
		int arr[][] = new int[row][col];
		
		// Taking input in 2D array 
		for(int currRow = 0; currRow < row; currRow++){
			for(int currCol = 0; currCol < col; currCol++){
				arr[currRow][currCol] = input.nextInt();
			}
		}
		
		// Making a single array of length row*col 
		int SingleArray[] = new int[row*col];
		
		// Tracking index of SingleArray [0, row*col)
		int index = 0;
		
		// Traversing 2D array 
		for(int currRow = 0; currRow < row; currRow++){
			for(int currCol = 0; currCol < col; currCol++){
				SingleArray[index++] = arr[currRow][currCol];
			}
		}
		
		// Displaying SingleArray
		System.out.print("The contiguous array is ");
		for(int currIndex = 0; currIndex < row*col; currIndex++){
			System.out.print(SingleArray[currIndex] + " ");
		}
	}
}