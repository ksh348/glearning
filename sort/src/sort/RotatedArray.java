package sort;

public class RotatedArray {

	public int[] rotate(int arr[]) {
		int j=0;
		int temp[] = new int[arr.length];
		
		for(int i=(arr.length/2)+1; i<arr.length; i++, j++) {
			temp[j] = arr[i];
		}
		
		for(int i=0;i<= (arr.length/2); i++, j++) {
			temp[j] = arr[i];
		}
		// arr = temp;
		return temp;
	}
}