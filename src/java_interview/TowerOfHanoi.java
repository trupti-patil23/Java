package java_interview;

public class TowerOfHanoi {
	public static void main(String[] args) {
		int noOfDisk = 10;		
		towerOfHanoi(noOfDisk,'A','B','C' );
	}

	private static void towerOfHanoi(int noOfDisk, char source, char helper, char dest) {
		
		if(noOfDisk == 1) {
			System.out.println("Disc "+ noOfDisk + " moved from " 
		    + source + " to "+  dest);
			return;
		}else {						
			towerOfHanoi(noOfDisk-1,source, dest, helper);
			System.out.println("Disc "+ noOfDisk + " moved from " 
				    + source + " to "+  dest);
			towerOfHanoi(noOfDisk-1,helper, source, dest);
		}		
	}
}
