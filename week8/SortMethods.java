// Sort Method Class
// Mark Hoffman  4/11/02
//
// Various implementations of sorting methods
// with support opertions to print an array 
// and to generate an array of random integers.

package week8;

public class SortMethods{

	public static void selectionSort (int[] intArray){
		//Preconditions
		//	Input: unsorted integer array	
		//	Assumptions: array is full
		//Postconditions
		//	Output: none
		//	Actions: array is sorted in ascending order

		for(int last = intArray.length - 1; last > 0; last--){
			int indexOfLargest = last;
			
			// Find largest element in unsorted array
			for(int i = 0; i < last; i++){
				if (intArray[i] > intArray[indexOfLargest]){
					indexOfLargest = i;
				} // end if
			} // end for
			
			// Swap last element with largest element
			int temp = intArray[last];
			intArray[last] = intArray[indexOfLargest];
			intArray[indexOfLargest] = temp;
			
			// Print partially sorted array
			System.out.println("Pass " + (intArray.length - last));
			printArray(intArray);
			
		} // end for
		
	}// end selectionSort
		
	public static void printArray(int[] intArray){
		//Preconditions
		//	Input: unsorted integer array	
		//	Assumptions: array is full
		//Postconditions
		//	Output: none
		//	Actions: array is displayed on screen
		
		System.out.print("Array==> ");
		for(int i = 0; i < intArray.length; i++){
			System.out.print(intArray[i] + " ");
		} // end for
		
		System.out.println(" ");
		
	} // end printArray
	
	public static int[] randomIntArray(int n, double range){
		//Preconditions
		//	Input: size of array(n), range of integers (0 to range)
		//	Assumptions: none
		//Postconditoins
		//	Output: array of random integers 0 to floor(range) 
		//	Actions: none
		
		int[] intArray = new int[n];
		
		for(int i = 0; i < n; i++){
			intArray[i] = (int)(Math.random() * range);
		} // end for
		
		return intArray;
		
	} // end randomIntArray
	
	public static int[] copyArray(int[] intArray){
		//Preconditions
		//	Input: integer array
		//	Assumptions: array is full
		//Postconditions
		//	Output: array of random integers 0 to floor(range) 
		//	Actions: none
		
		int[] copyArray = new int[intArray.length];
		
		for(int i = 0; i < intArray.length; i++){
			copyArray[i] = intArray[i];
		} // end for
		
		return copyArray;
		
	} // end copyArray

    public static int selectionSortComparisons(int[] intArray) {
        int comparisons = 0;
    
        for (int last = intArray.length - 1; last > 0; last--) {
            int indexOfLargest = last;
    
            // Find largest element in unsorted array
            for (int i = 0; i < last; i++) {
                comparisons++; // count comparisons
                if (intArray[i] > intArray[indexOfLargest]) {
                    indexOfLargest = i;
                }
            }
    
            // Swap last element with largest element
            int temp = intArray[last];
            intArray[last] = intArray[indexOfLargest];
            intArray[indexOfLargest] = temp;
        }
    
        return comparisons;
    }    

} // end SortMethods