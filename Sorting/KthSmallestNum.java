//Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, 
//not the kth distinct element.

// Using Quick Select Algo

public class KthSmallestNum {
	
	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
 	}
	
	public static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int pIndex = start;
		for(int i=start; i<end; i++) {
			if(array[i]<=pivot) {
				swap(array, i, pIndex);
				pIndex+=1;
			}
		}
		swap(array, pIndex, end);
		return pIndex;
	}
	
	public static int randomisedQuickSort(int[] array, int start, int end){
		int range = end - start + 1;
		int pivotIndex = (int)(Math.random()*range) + start;
		swap(array, pivotIndex, end);
		return partition(array, start, end);
	}
	
	public static void quickSort(int[] array, int start, int end, int k) {
		if(start < end) {
			int pIndex = randomisedQuickSort(array, start, end);
			if(k<pIndex) {
				quickSort(array, start, pIndex-1, k);
			}else if(k>pIndex) {
				quickSort(array, pIndex+1, end, k);
			}else {
				return;
			}
		}
	}
	
	public static void printArray(int[] array, int size) {
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] array = {42,10,23,5,12,9,3,1,2,35};
		int k = 4;
		printArray(array, array.length);
		
		quickSort(array, 0, array.length -1, k-1);
		
		System.out.println("\nElement at "+k+"th index is : "+array[k-1]);

	}

}
