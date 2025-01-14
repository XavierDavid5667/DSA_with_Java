package com.dsaquestions.arraylevel2;

public class Program6 {

    public int findMajority(int[] arr){
        int n=arr.length;
        int count=0;
        int candidate=-1;
        for(int num:arr){
            if(count==0){
                candidate=num;
                count=1;
            }else if(candidate==num){
                count++;
            }else{
                count--;
            }
        }

         count=0;
        for(int num:arr){
            if(candidate==num){
                count++;
            }
        }
        if(count>n/2){
            return candidate;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        Program6 program6=new Program6();
        System.out.println(program6.findMajority(arr));
    }
}
