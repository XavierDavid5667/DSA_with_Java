package patterns.prefixsum;

import java.util.Arrays;

/**
 * Sum of an array between indexes L and R using Prefix Sum
 */
public class Program2 {
    public  static void sumBetweenTwoIndices(int[] arr){
        int[] prefixSum=new int[arr.length];
        int n= arr.length;
        prefixSum[0]=arr[0];
        for(int i=1;i<n;i++){
           prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        System.out.println("===Prefix Sum Array===");
        System.out.println(Arrays.toString(prefixSum));
        int[][] queries={ { 2, 3 }, { 4, 6 }, { 1, 5 }, { 3, 6 } };
        for(int i=0;i< queries.length;i++)
        {
            int left=queries[i][0];
            int right=queries[i][1];
            System.out.print(prefixSum[right-1] - prefixSum[left - 1] + "\n");
        }
    }
    public static void main(String[] args) {
        int[] a = { 3, 6, 2, 8, 9, 2 };
        sumBetweenTwoIndices(a);
    }
}
