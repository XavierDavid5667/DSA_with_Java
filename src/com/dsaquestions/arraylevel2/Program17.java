package com.dsaquestions.arraylevel2;

import java.util.ArrayList;
import java.util.List;

public class Program17 {

    private void recurPermute(int[] arr, List<Integer>ds, List<List<Integer>>ans,boolean[] visited) {
        if(ds.size()==arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
       for(int i=0;i<arr.length;i++) {
           if(!visited[i]) {
               visited[i]=true;
               ds.add(i);
               recurPermute(arr,ds,ans,visited);
               visited[i]=false;
               ds.remove(ds.size()-1);
           }
       }

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        recurPermute(nums,ds,ans,visited);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        Program17 obj = new Program17();
        System.out.println(obj.permute(arr));
    }
}
