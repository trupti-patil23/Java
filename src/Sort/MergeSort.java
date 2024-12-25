package Sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] input = {8,4,6,9,3,7};		
		int endIndex = input.length;
		int startIndex = 0;
		
		divide(input,startIndex, endIndex-1);
		System.out.println("Final sorted array by Merge Sort");
		for(int x: input) {
			System.out.print(x+ " ");
		}
	}

	private static void divide(int[] input, int startIndex, int endIndex) {		
		
		while(endIndex <= startIndex)
			return;
		
		int midIndex = startIndex + (endIndex - startIndex)/2;		
		
		divide(input, startIndex, midIndex);
		divide(input, midIndex+1, endIndex);	
		conquer(input, startIndex, endIndex, midIndex );
	}

	private static void conquer(int[] input, int startIndex, int endIndex, int midIndex) {
		
		int[] mergedArray = new int[endIndex-startIndex+1];
		int index1 = startIndex;
		int index2 = midIndex+1;
		int i = 0;
		
		while(index1 <= midIndex && index2 <= endIndex) {
			
			if(input[index1] <= input[index2]) {				
				mergedArray[i++] = input[index1++];
			}
			else {
				mergedArray[i++] = input[index2++];
			}
		}
		while(index1 <= midIndex) {
				mergedArray[i++] = input[index1++];
		}
		while(index2 <= endIndex) {
				mergedArray[i++] = input[index2++];
		}	
		
		for(int j=0,k=startIndex; j< mergedArray.length; j++,k++) {
			input[k] = mergedArray[j];			
		}		
	}
}
