package Sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] input = {9,3,5,6,7};
		int size = input.length;
		int count = 0;
		
		for(int i = 0; i < size; i++) {
			int smallest = i;	
			for(int j= i+1;j < size; j++) {
				count++; //this is for iteration count..no logic related
				if(input[smallest] > input[j]) {
					smallest = j;
				}				
			}
			if(smallest == i) // this code is for BestCase senario - where time complexity is o (n) 
				break;
				
			
			int temp = input[i];
			input[i] = input[smallest];
			input[smallest]= temp;			
		}
		
		System.out.println("loops ran for "+ count + " times"); //Time Complexity o(n^2) times
		for(int x: input) {
			System.out.print(x + " ");
		}
			

	}

}
