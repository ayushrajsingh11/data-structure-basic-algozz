/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;


class GFG {
	public static void main (String[] args) {
		int[] arr={1,2,3,4,5};
		int n=arr.length;
		int max=arr[0];
		int min=arr[0];
	for(int i=0;i<n;i++){
	    if(arr[i]>max){
	        max=arr[i];
	    }if(arr[i]<min){
	        min=arr[i];
	    }
	}
	System.out.print("max= "+max+" min= "+min);
	
		
		
	}
}