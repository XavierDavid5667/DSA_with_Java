package com.dsaquestions.array;

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {
    public static int removeDuplicates(int[] arr, int n) {
      int low=1;
      for(int i=1;i<n;i++){
          if(arr[i]!=arr[i-1]){
              arr[low]=arr[i];
              low++;
          }
      }
      return low;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,3,4,4,5,5}; //1 2 2 3 3 3 4 4 5 5
        int k=removeDuplicates(arr, arr.length);
        System.out.println(Arrays.toString(arr)+" "+k);
    }
}
