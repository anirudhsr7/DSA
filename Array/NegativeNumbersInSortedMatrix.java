//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

public class NegativeNumbersInSortedMatrix {
	
	public static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int i = rows - 1;
        int j = 0;
        
        int count = 0;
        
        while(i>=0 && j<cols){
            if(grid[i][j] < 0){
                count += (cols - j);
                i -= 1;
            }else{
                j+=1;
            }
        }
        return count;
	}
	public static void main(String[] args) {
		int[][] grid = {
				{4,3,2,-1},
				{3,2,1,-1},
				{1,1,-1,-2},
				{-1,-1,-2,-3}
		};
		
		int count = countNegatives(grid);
		System.out.println(count);
	}

}
