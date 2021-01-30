public class QuickSortAlgo {
	
	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int pIndex = start;
		
		for(int i=start; i<=end-1; i++) {
			if(array[i]<=pivot) {
				swap(array, pIndex, i);
				pIndex += 1;
			}
		}
		swap(array, pIndex, end);
		return pIndex;
		
	}
	
	public static void quickSort(int[] array, int start, int end) {
		if(start<end) {
			
			int pIndex = partition(array, start, end);
			quickSort(array, start, pIndex-1);
			quickSort(array, pIndex+1, end);
		}
	}
	
	public static void printArray(int[] array, int size) {
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1,4,2,7,8,5,6};
		int size = array.length;
		
		printArray(array, size);
		System.out.println("\nAfter Sorting: ");
		quickSort(array, 0, size-1);
		printArray(array, size);
		
	}
}
