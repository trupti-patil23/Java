package Sort;
//Best case time complexity = O(n)
public class InsertionSort {

	public static void main(String[] args) {
		
		int[] input = {7,8,1,3,2}; // n =5
		int size = input.length;
		int cnt = 0;
		
		for(int i = 1 ; i< size;i++) {
			int current = input[i];			
			int j= i-1;			
			while(j>=0 && current < input[j]) {
				cnt++;
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = current;
		}
		System.out.println("Iteration Count -> " + cnt);
		for(int x : input)
			System.out.print(x + " "); //Ascending Order
	}

}
