/*package whatever //do not write package name here */

import java.io.*;
/*
public class sort {
	public static void main(String args[])
	{
		int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		int h[] = new int[3];
		for(int i = 0; i < arr.length;i++)
		{
			h[arr[i]] += 1; 
		}
		
		for(int i = 0; i < 3;i++)
		{
			int t=0;
			while(t<h[i])
			{
				System.out.print(i+" ");
				t++;
			}
		}
		
	}

}
*/
class GFG {static void pt(int nmbr,int count){
    for(int i=0;i<count;i++){
        System.out.print(nmbr+" ");
    }
    
}
	public static void main (String[] args) {
		int[] a={0,1,2,0,1,2};
		int zc=0;
		int oc=0;
		int tc=0;
		int n=a.length;
	
		for(int i=0;i<n;i++){
		    if(a[i]==0)
		    zc++;
		    if(a[i]==1)
		    oc++;
		    if(a[i]==2)
		    tc++;
		}
		pt(0,zc);
		pt(1,oc);
		pt(2,tc);
		
		
	}
}