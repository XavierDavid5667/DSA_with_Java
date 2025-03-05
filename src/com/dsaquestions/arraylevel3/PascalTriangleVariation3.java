package com.dsaquestions.arraylevel3;

public class PascalTriangleVariation3 {
    public static void main(String[] args) {
        int n=6;
        int ans=1;
        System.out.println(ans);
        for(int i=1;i<n;i++){
            ans*=n-i;
            ans/=i;
            System.out.println(ans);
        }
    }
}
