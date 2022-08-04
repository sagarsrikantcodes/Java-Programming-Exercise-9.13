package package1;
import java.util.Scanner;

public class TestLocation {
	public static void main(String[] args) {
		// User Input for number of rows and columns 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int rowLength = input.nextInt();
		int columnLength = input.nextInt();
		
		// Creating a 2D array
		double[][] array = new double[rowLength][columnLength];
		System.out.println("Enter the array:");
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				array[row][column] = input.nextDouble();
			}
			// System.out.println(); 
		}
		
		// Creating new object of Location type 
		Location location1 = Location.locateLargest(array);
		
		// Display the location of the largest element in a 2D array 
		System.out.println("The location of the largest element is " + location1.maxValue + " at ("
				+ location1.row + "," + location1.column + ")");
	}

}
