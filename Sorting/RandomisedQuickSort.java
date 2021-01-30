public class RandomisedQuickSort {
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
	
	public static int ramdomisedPartition(int[] array, int start, int end) {
		int range = end - start + 1;
		int pivotIndex = (int)(Math.random() * range) + start; 
		swap(array, pivotIndex, end);
		return partition(array, start, end);
	}
	
	public static void quickSort(int[] array, int start, int end) {
		if(start<end) {
			
			int pIndex = ramdomisedPartition(array, start, end);
//			System.out.println(pIndex);
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
		int[] array = {8,7,6,5,4,3,2,1};
		int size = array.length;
		
		printArray(array, size);
		System.out.println("\nAfter Sorting: ");
		quickSort(array, 0, size-1);
		printArray(array, size);
		
	}

}
