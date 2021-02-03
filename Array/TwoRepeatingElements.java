//Nice Approach go through this also
//https://www.onlinegdb.com/HyFJnYv0w

public class RepeatingElements {
	
	public static int[] repeatingElements(int[] arr, int n) {
		int[] res = new int[2];
		int m = n-2;
		int xor = 0;
		
		for(int i: arr) {
			xor^=i;
		}
		for(int i=1; i<=m; i++) {
			xor^=i;
		}
		int set_bit = xor & ~(xor -1);
		
		int x=0;
		int y=0;
		
		for(int i=0; i<n; i++) {
			if((arr[i] & set_bit) > 0) {
				x^=arr[i];
			}else {
				y^=arr[i];
			}
		}
		
		for(int i =1; i<=m; i++) {
			if((i&set_bit)>0) {
				x^=i;
			}else {
				y^=i;
			}
		}
		
		res[0] = x;
		res[1] = y;
		
		
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {2,1,3,3,4,5,4};
		
		int[] res = new int[2];
		res = repeatingElements(arr, arr.length);
		
		System.out.println("Two Repeating Elements are : " + res[0] +" " + res[1]);

	}

}
