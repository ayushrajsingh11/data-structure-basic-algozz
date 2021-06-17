/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		int[] arr={1,2,3,4,5};
		int n=arr.length;
		Stack<Integer> s=new Stack<Integer>();
	for(int i=0;i<n;i++){
	    s.push(arr[i]);
	    
	}for(int i=0;i<n;i++){
	    arr[i]=s.pop();
	    System.out.print(arr[i]+" ");
	}
	
		
		
	}
}