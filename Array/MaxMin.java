//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

public class MaxMin {
	
	static class Pair{
		public int min;
		public int max;
	}
	
	public static Pair getMinMax(int[] array, int start, int end) {
		Pair pair = new Pair();
		Pair mml = new Pair();
		Pair mmr = new Pair();
		int mid;
		if(start == end) {
			pair.min = array[start];
			pair.max = array[start];
			return pair;
		}
		if(end == start + 1) {
			if(array[start] > array[end]) {
				pair.min = array[end];
				pair.max = array[start];
			}else {
				pair.max = array[end];
				pair.min = array[start];
			}
			return pair;
		}
		
		mid = (start+end)/2;
		mml = getMinMax(array, start, mid);
		mmr = getMinMax(array, mid+1, end);
		
		if(mml.min < mmr.min) {
			pair.min = mml.min;
		}else {
			pair.min = mmr.min;
		}
		
		if(mml.max < mmr.max) {
			pair.max = mmr.max;
		}else {
			pair.max = mml.max;
		}
		return pair;
	}

	public static void main(String[] args) {
		int[] array = {23, 45, 11, 56, 78, 98, 1, 120};
		Pair maxmin = getMinMax(array, 0, array.length -1);
		
		System.out.println("Min: "+ maxmin.min);
		System.out.println("Max: "+ maxmin.max);
		

	}

}
