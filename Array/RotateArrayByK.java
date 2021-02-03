public class RotateArrayByK {
	public static void reverse(int[] a, int l, int r) {
		while(l<r) {
			int temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
			r--;
		}
	}
	
	public static void rotate(int[] a, int n, int k) {
		reverse(a, n-k, n-1);
		reverse(a, 0, n-k-1);
		reverse(a, 0, n-1);
	}
	
	public static void printArray(int[] a, int size) {
		for(int i=0; i<size; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int n = arr.length;
		int k = 3;
		
		printArray(arr, n);
		
		System.out.println("After rotating by "+k+":");
		rotate(arr, n, k);
		printArray(arr, n);
	}
}
