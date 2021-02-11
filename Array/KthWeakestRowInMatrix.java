//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
import java.util.*;
class Solution {
    public int sumRow(int[] arr){
        //int s = 0;
        //for(int i=0; i<arr.length; i++){
          //  s += arr[i];
        //}
        int l = 0;
        int h = arr.length;
        while(l<h){
            int mid = l + (int)((h-l)/2);
            if(arr[mid]==1){
                l = mid+1;
            }else{
                h = mid;
            }
        }
        
        return l;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] fa = new int[mat.length];
        int[] res = new int[k];
        for(int i=0; i<mat.length; i++){
            int sum = sumRow(mat[i])*1000 + i;
            fa[i] = sum;
        }
        Arrays.sort(fa);
        
        for(int i=0; i<k; i++){
            res[i] = fa[i]%1000;
        }
        return res;
    }   
}
     
