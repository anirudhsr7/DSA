// Write a program to reverse an array or string
//

public class ReverseArray {
	
	public static void recursiveRevArray(int[] array, int start, int end) {
		if(start>=end) {
			return;
		}
		int temp = array[start];
		array[start] = array[end];
		array[end] = temp;
		recursiveRevArray(array, start + 1, end - 1);
		
	}
	
	public static void reverseArray(int[] array, int size) {
		int start = 0;
		int end = size-1;
		while(start<=end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		
	}
	
	public static void printArray(int[] array, int size) {
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,3,4,5,6,7,2,9,8};
		
		printArray(arr, arr.length);
//		reverseArray(arr, arr.length);
		recursiveRevArray(arr, 0, arr.length-1);
		
		System.out.println("\nAfter Reversing of Array:");
		printArray(arr, arr.length);
		
		
	}

}
