/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Compute {
    
    public void rotate(long arr[], long n)
    {
        ArrayList<Long> l=new ArrayList<>();
        for(long i:arr){
            l.add(i);
        }
        Collections.rotate(l,1);
        for(int i=0;i<n;i++){
            arr[i]=Long.valueOf(l.get(i));
        }
        /*
          long x = arr[n-1], i;
   for (i = n-1; i > 0; i--)
      arr[i] = arr[i-1];
   arr[0] = x;
        */
    }
}