import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		
		int[] arr = {-1, 0, 1, 2, -1, -4};
		int n = arr.length;
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(arr);
		
		for(int i=0; i<n-2; i++) {
			if(i>0 && arr[i]==arr[i-1]) {
				continue;
			}
			int l = i+1;
			int r = n-1;
			while(l<r) {
				if(l!=i+1 && arr[l]==arr[l-1]){
                    l++;
                    continue;
                }
                if(r!=n-1 && arr[r]==arr[r+1]){
                    r--;
                    continue;
                }
				if(arr[i]+arr[l]+arr[r]==0) {
					list.add(Arrays.asList(arr[i],arr[l],arr[r]));
					l++;
					r--;
				}else if(arr[i]+arr[l]+arr[r]<0) {
					l++;
				}else if(arr[i]+arr[l]+arr[r]>0) {
					r--;
				}
			}
		}
		
		for(List<Integer> i : list) {
			System.out.println(i);
		}

	}
}
