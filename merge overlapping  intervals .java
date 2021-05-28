/*package whatever //do not write package name here */

import java.io.*;
class Solution {
    public int[][] merge(int[][] intervals) {
       
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); int f=intervals[0][0];
        int s=intervals[0][1];
        ArrayList<Integer> c1=new ArrayList<>();
         ArrayList<Integer> c2=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=s){
                s=Math.max(s,intervals[i][1]);
            }else{
                c1.add(f);
                c2.add(s);
            f=intervals[i][0];
            s=intervals[i][1];
            }
        }
        c1.add(f);
        c2.add(s);
        int[][] arr=new int[c1.size()][2];
        
    
        for(int j=0;j<c1.size();j++){
            arr[j][0]=c1.get(j);
        }
        for(int j=0;j<c1.size();j++){
            arr[j][1]=c2.get(j);
        }
        return arr;
    
        
    }
}