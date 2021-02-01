//Move all negative numbers to beginning and positive to end with constant extra space

public class RearrangeArray {
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static void rearrangeArr2(int[] array, int n) {
		int left = 0;
		int right = n-1;
		
		while(left<=right) {
			if(array[left] < 0 && array[right] < 0) {
				left++;
			}
			else if(array[left] > 0 && array[right] < 0) {
				swap(array, left, right);
				left++;
				right--;
			}
			else if(array[left] > 0 && array[right] > 0) {
				right--;
			}else {
				left+=1;
				right-=1;
			}
		}
	}
	
	public static void rearrangeArr(int[] array, int n) {
		int j = 0;
		
		for(int i=0; i<n; i++) {
			if(array[i]<0) {
				if(i!=j) {
					swap(array, i, j);
				}
				j++;
			}
		}
	}
	
	public static void printArray(int[] arr, int size) {
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {-23, 4, 5, -45, -546};
		printArray(array, array.length);
		
		rearrangeArr2(array, array.length);
		System.out.println("\nAfter rearranging: ");
		printArray(array, array.length);
		
	}

}
