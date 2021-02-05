// Rotate Matrix By 90 degree anti-clockwise
public class RotateMatrixBy90 {
	
	
	public static void swap(int[][] arr, int i, int j) {
		int temp = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = temp;
	}
	
	public static void printMatrix(int[][] mat, int row, int col) {
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] mat = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int row = mat.length;
		int col = mat[0].length;
		
		
		System.out.println("[Given Matrix]");
		printMatrix(mat, row, col);
		
		// Performing Transpose
		for(int i=0; i<row; i++) {
			for(int j=i+1; j<col; j++) {
				swap(mat, i, j);
			}
		}
		
		// Performing reverse
		for(int j =0; j<col; j++) {
			for(int i=0; i<(int)row/2;i++) {
				int temp = mat[i][j];
				mat[i][j] = mat[(row-1) - i][j];
				mat[(row-1) - i][j] = temp;
			}
		}
		
		System.out.println("[After Rotating 90 degree anti-clockwise]");
		printMatrix(mat, row, col);	
	}
}
