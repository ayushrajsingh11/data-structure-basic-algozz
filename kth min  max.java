/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {static int max(int[] a,int n){
    int max=a[0];
    for(int i=0;i<n;i++){
        if(a[i]>max){
            max=a[i];
        }
    }
    return max;
    
}static int min(int[] a,int n){
    int min=a[0];
    for(int i=0;i<n;i++){
        if(a[i]<min){
            min=a[i];
        }
    }
    return min;
    
}static void kmin(int[] a,int k,int n){
    
List<Integer> l=new LinkedList<>();
for(int i:a){
    l.add(i);
}int min=0;
while(k>1){
    min=Collections.min(l);
    if(l.contains(min))
    l.remove(min);
    k--;
}
    
System.out.print(l);
 System.out.println("min => "+min);
}
    static void kmax(int[] arr,int k,int n){
      int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=arr[i];
        }
  while(k>1){
      for(int i=0;i<n;i++){
          if(a[i]==max(a,n)){
              a[i]=0;
          }
      }k--;
      
  }System.out.println("max => "+max(a,n));
} 


	public static void main (String[] args) {
		
		int[] a={1,2,3,4,5,6,7};
		int k=3;
		int n=a.length;
		
	kmax(a,k,n);
	kmin(a,k,n);
	
	
	
	}
}
/*
class GFG {
    static void kmin(int[] a,int k,int n){
Arrays.sort(a);
int min=0;
for(int i=0;i<k;i++){
    min=a[i];
}
System.out.println("kmin => "+min);
}
static void kmax(int[] a,int k,int n){
    Arrays.sort(a);
    int max=0;
    for(int i=n-1;i>k;i--){
        max=a[i];
    }
System.out.println("kmax => "+max);
}
	public static void main (String[] args) {
	int[] a={1,2,3,4,5,6,7};
	int n=a.length;
	int k=3;
	kmin(a,k,n);
	kmax(a,k,n);
	
	}
}
*/