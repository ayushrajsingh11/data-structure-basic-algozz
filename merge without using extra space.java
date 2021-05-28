/*package whatever //do not write package name here */

import java.io.*;

class Solution {
    

    public void merge(int a1[], int a2[], int n, int m) {
  
  int pt1 = n-1; 
	     int pt2 = 0; 
	     
	     while(pt1 >=0 && pt2 < m)
	     {
	         if(a1[pt1]>a2[pt2])   {
	            int temp = a1[pt1];
	            a1[pt1] = a2[pt2];
	            a2[pt2] = temp;
	         }
	         
	         pt1--;
	         pt2++;
	     }
	     
   Arrays.sort(a1);
   Arrays.sort(a2);
        
    }
}