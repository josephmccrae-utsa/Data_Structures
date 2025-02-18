package quickSort;
import java.io.FileWriter;
import java.io.IOException;

import randNumGen.RandomNumbers;
import java.io.FileWriter;

public class Driver {

	public static void main(String[] args) {
		int[] data = new int[1000]; // Empty integer array of length 1000
		data = RandomNumbers.randomArray(data); // Initializes given array with random integers 0-999
		String fileNameInput = "RandNumb.txt"; // Name of file for random array of integers
		String fileNameOutput = "sortednumb.txt"; // Name of file for sorted array of integers
		
//		printArray(data);
		printArrayToFile(data, fileNameInput); // Prints random array of integers to file "RandNumb.txt"
		
		QuickSort qs = new QuickSort(); // Creates QuickSort object, qs, from QuickSort class
		qs.sort(data, 0, data.length-1); // Calls quick sort algorithm to sort data
		
//		printArray(data);
		printArrayToFile(data, fileNameOutput); // Prints sorts array of integers to file "sortednumb.txt
		
		
	}
	
//	public static void printArray(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
	
	// General use printToFile method depending on fileName paramater
    public static void printArrayToFile(int[] data, String fileName) {
        try (FileWriter c = new FileWriter(fileName)) {			  // fileName is "RandNumb.txt"
            for (int number : data) {                    // for-each block specifying iteration for every 
                c.write(number + "\n");                           // element of the randomNumbers array
            }
        } catch (IOException e) {                                 // if IOExceptions are not handled the program
            e.printStackTrace();                                  // will not compile
        }
    	
    }

}
