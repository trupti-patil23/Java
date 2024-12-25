package Sort;

public class CountingSort {

	public static void main(String[] args) {
		int[] input = {0,1,2,1,2,3,1}; //n
		int range = 5; //range 0-5
		
		int size = input.length; //input array size
		
		//create Array 
		int[] auxArray = new int[size]; //Use to store sorted elements
		
		//create count array of length k, which will store occurences
		int[] countArray = new int[range+1] ; //to store 0 to 5 = 6
		
		//Step1 - populate countArray with occurrences ...
		int count = 0;
		for(int i = 0; i< size; i++) {
			countArray[input[i]] += 1;
		}
		
		//Step2 - Upgrade countArray from occurrences to indexes--Their position in inputArray
		for(int i = 1; i<range; i++) {
			countArray[i] += countArray[i-1] ;
		}
		
		// step3 : traverse input array in reverse order and add sorted elements in auxArray
		for(int i=size-1; i >= 0; i--) {
			int index = --countArray[input[i]];		
			auxArray[index] = input[i]; //Sorted
		}
			
		//step4 : copy from auxArray(sorted) to input(original Array)
		for(int i = 0; i<size; i++) {
			input[i] = auxArray[i];
		}
		
		//step5 : print sorted original array
		for(int i = 0; i<size; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
