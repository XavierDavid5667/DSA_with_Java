package com.dsaquestions.arraypractice;

public class Program5 {
    public static void main(String[] args) {
        int num=6;
        int startNumber=1;
        int columnNumber;
        int rowAdd=6;
        for(int i=0;i<6;i++){
            columnNumber=startNumber;
            int k=rowAdd;
            for(int j=0;j<=i;j++){
                if(i==0) {
                    System.out.print(columnNumber+" ");
                }else {
                    System.out.print(columnNumber+" ");
                    columnNumber -= k;
                    k++;

                }
            }
            System.out.println();
            startNumber+=num;
            num--;
            rowAdd--;
        }
    }
}
