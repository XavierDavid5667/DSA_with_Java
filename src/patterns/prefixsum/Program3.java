package patterns.prefixsum;

import java.util.Arrays;

public class Program3 {
    public static void main(String[] args) {
        int[] arr={0, 0, 0, 0, 0};
        int n= args.length;
        int m=3;
        int[][] queries={{2,4},{1,3},{1,2}};
        int i=0;

        while(i<m){
          int start= queries[i][0]-1;
          int end=queries[i][1]-1;
          for(int j=start;j<=end;j++){
              arr[j]=arr[j]+100;
          }
          i++;
        }

        System.out.println(Arrays.toString(arr));

        int max=Integer.MIN_VALUE;
        for(int k=0;k< arr.length;k++){
            if(arr[k]>max){
                max=arr[k];
            }
        }
        System.out.println(max);
    }
}
