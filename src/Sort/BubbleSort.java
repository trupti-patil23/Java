package Sort;

/*It checks 2 adjuscent elements, If second element is bigger, then swap both elements.Then check next two elements.
  So In the first loop biggest element will go to end, Second loop will place second largest element.So outer loop will run  n-1 times
  Inner loop with run O(n^2) times. 
  So total time complexity is O(n^2) times. Which is not considered good.
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] input = {8,2,7,4,5}; // n =5
		int size = input.length;
		int cnt =0;
		
		//-----------------------------------------------------Ascending Order-------------------------------------------
		for(int i =0; i < size-1; i++ ) { //n-1 times run--4 times		
			cnt++;
			for(int j= 0; j< size-i-1; j++) { //total 10 times.  n^2 times
				cnt++;
				if(input[j] > input[j+1]) {					
					int temp = input[j+1];
					input[j+1] = input[j];
					input[j] = temp;					
				}				
			}		
		}
		for(int x : input)
			System.out.print(x + " "); //Ascending Order
		
		System.out.println("\n Iterates for "+ cnt+ " times");

		//-----------------------------------------------------Descending Order-------------------------------------------
		for(int i =0; i < size-1; i++ ) { //n-1 times run--4 times
			for(int j= 0; j< size-i-1; j++) { // first time = 4 times, second time = 3 times, third time = 2 times.....
				if(input[j] < input[j+1]) {					
					int temp = input[j+1];
					input[j+1] = input[j];
					input[j] = temp;					
				}				
			}		
		}
		for(int x : input)
			System.out.print(x + " "); //Descending Order
		//----------------------------------------------------------------------------------------------------------------------------
		//Best case - (Where already Array is sorted) ..we can optimize bubble sort using flag condition
		int[] BestCaseInput = {1,2,3,4,5}; // n =5
		int length = BestCaseInput.length;
		boolean flag;
		int count =0;
		
		for(int i =0; i < size-1; i++ ) {
			count++;
			flag = true;
			for(int j= 0; j< size-i-1; j++) { 
				count++;				
				if(BestCaseInput[j] > BestCaseInput[j+1]) {	
					
					int temp = BestCaseInput[j+1];
					BestCaseInput[j+1] = BestCaseInput[j];
					BestCaseInput[j] = temp;	
					
					flag = false;
				}				
			}	
			
			if(flag == true)
				break; // No swapping means array is already sorted
		}
		
		System.out.println("\n Best Case Approach : Optimized iterations " + count); //Time Complexity o(n)
		for(int x : BestCaseInput)
			System.out.print(x + " ");
		
		
		
	}

}
