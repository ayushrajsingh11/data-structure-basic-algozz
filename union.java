/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
int[] a1={1,2,3,4,5};
int[] a2={2,4,6,8,10};
ArrayList<Integer> l=new ArrayList<>();

LinkedHashSet<Integer> s=new LinkedHashSet<>();
for(int i:a1){
    l.add(i);
    s.add(i);
}
for(int i:a2){
    s.add(i);
    l.add(i);
}
System.out.print("intersection => ");
for(int i:l){
    
    if(Collections.frequency(l,i)>1){
        System.out.print(i+" ");
      
    }
}
System.out.print("union => "+s);


	}
}