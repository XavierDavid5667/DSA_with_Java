package com.dsaquestions.arraylevel3;

public class MooreAlgorithm {
    public static void main(String[] args) {
        int[] arr={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        int count=0;
        int element = 0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                element=arr[i];
                count=1;
            }
            else if(element==arr[i]){
                count++;
            }else {
                count--;
            }
        }
        int count2=0;
        for(int i=0;i< arr.length;i++){
            if(element==arr[i]){
                count2++;
            }
        }
        if (count2 >(arr.length)/2){
            System.out.println(element);
        }else{
            System.out.println("Nothing");
        }
    }
}
