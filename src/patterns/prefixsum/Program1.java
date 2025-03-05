package patterns.prefixsum;

public class Program1 {

    public static void fillPrefixArray(int[] arr,int[] prefixArray){
        int n= arr.length;
        prefixArray[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixArray[i]=prefixArray[i-1]+arr[i];
        }
    }


    public static void main(String[] args) {
      int[] arr={10,4,16,20};
      int n= arr.length;;
      int[] prefixSum=new int[n];
      fillPrefixArray(arr,prefixSum);
      for(int i:prefixSum){
          System.out.print(i+" ");
      }
    }
}
