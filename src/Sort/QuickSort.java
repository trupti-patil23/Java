package Sort;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] input = {7,15,9,1,2,8};
		int low = 0;
		int high = input.length-1;
		
		quickSort(input,low, high);
		for(int x: input)
			System.out.print(x+ " ");
	}

	private static void quickSort(int[] input, int low, int high) {
		
		if(low < high) {			
			int pivotIndex = partition(input,low,high);
			quickSort(input, low, pivotIndex-1);
			quickSort (input, pivotIndex+1, high);			 
		}			
	}

	private static int partition(int[] input, int low, int high) {
		
		int i = low-1;
		int pivot = input[high]; //Consider last element as pivot
		for(int j=low;j<high;j++) {
			if(pivot > input[j]) {
				i++;
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;			
			}
		}
		
		i++; // to make space for pivot element; imagine blank array with i
		int temp = input[i];
		input[i] = pivot;
		input[high] = temp;
		return i;
	}

}
