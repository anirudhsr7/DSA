//import java.util.Arrays;

public class WiggleSort {

	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static void printArray(int[] array, int size) {
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {		
		int[] array = {3,5,4,2,1,6};
		int n = array.length;
				
		System.out.println("Array:");
		printArray(array, n);
		
		//APPROACH 1
//		Arrays.sort(array);
//		
//		for(int i=1; i<n-2; i+=2) {
//			swap(array, i, i+1);
//		}
		
		//APPROACH 2
		for(int i=1; i<n-2; i+=2) {
			if(!(array[i]>=array[i-1])) {
				swap(array, i, i-1);
			}
			if(!(array[i]>=array[i+1])) {
				swap(array, i, i+1);
			}
		}
		
		System.out.println("After Sorting:");
		printArray(array, n);
	}

}
