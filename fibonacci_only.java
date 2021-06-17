import java.util.*;
public class fibonacci_only {
    public static List<Integer> fib(int n){
        List<Integer> l=new ArrayList<>();
        int n1=0,n2=1,n3;
        l.add(n1);l.add(n2);
        for(int i=2;i<n;i++){
            n3=n1+n2;
            l.add(n3);
            n1=n2;
            n2=n3;
        }
                return l;
    }
    public static void main(String[] args) {
        List<Integer> l=fib(10);
        System.out.print(l);
    }
}
