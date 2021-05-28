/*package whatever //do not write package name here */

import java.io.*;

class GFG { int maxSubarraySum(int arr[], int size){
        
         int m1 = 0, m2 =Integer.MIN_VALUE;
    for (int i = 0; i < size; i++) {
       
        // include current element to previous subarray only
    m1=m1+arr[i];
    m2=Integer.max(m1,m2);
    if(m1<0)
    m1=0;
        
    }
    return m2;}
	public static void main (String[] args) {
	int[] arr={1,2,3,-1,5};
	int n=arr.length;
	System.out.print(maxSubarraySum(arr,n));
	}
}