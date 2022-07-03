package sort;

public class BinarySearch {

	public void search(int arr[], int lowerBound, int upperBound, int key) {
		// int rtnValue = -1;
		int middle = (lowerBound + upperBound) /2;
		
		while(lowerBound < upperBound) {
			
			if(arr[middle] == key) {
				System.out.println("Found at " + middle);
				// rtnValue = middle;
			}
			if(arr[middle] < key) {
				lowerBound = middle+1;
			}
			else
			{
				upperBound = middle;
			}
			middle = (lowerBound + upperBound) /2;
			
			if(lowerBound >= upperBound) {
				System.out.println("Element Not Found in array");
				break;
			}
		}
	}
}
