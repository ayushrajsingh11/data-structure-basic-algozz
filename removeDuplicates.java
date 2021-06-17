import java.util.*;
public class removeDuplicates {
    public static void remove(int[] a){
Set<Integer> l=new HashSet<>();
for(int i:a){
    l.add(i);
}
System.out.println("unique elements -> "+l);
    }
    public static void frequency(int[] a ){
        ArrayList<Integer> l=new ArrayList<>();
        for(int i:a)
        l.add(i);

        for(int i=0;i<l.size();i++){
            System.out.println("frequency -> "+l.get(i)+" -> "+Collections.frequency(l,l.get(i)) );
        }
    }
    public static void main(String[] args){
        int[] a={1,1,2,3,4,4,5,6,6};
remove(a);
frequency(a);
    }
}
