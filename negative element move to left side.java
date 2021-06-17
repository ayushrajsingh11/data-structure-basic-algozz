/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {static void remove(int[] a){
    ArrayList<Integer> l=new ArrayList<>();
    ArrayList<Integer> l1=new ArrayList<>();
    for(int i:a){l.add(i);
        }
        for(int i=0;i<l.size();i++){
            if(l.get(i)<0){
                
                l1.add(Integer.valueOf(l.get(i)));
                l.remove(i);
            }
        }
        l1.addAll(l);
        System.out.print(l1);
}
	public static void main (String[] args) {
		
		int[] a={1,-2,3,-4,5};
		remove(a);
	
	}
}