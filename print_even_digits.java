import java.util.*;

public class print_even_digits {
    public static List<Integer> print_even(int n){
    List<Integer> l=new ArrayList<>();
while(n!=0){
    int last=n%10;
    if(last%2==0){
        l.add(last);
    }
    n/=10;
}
return l;
    }
    public static void main(String[] args) {
        List<Integer> l=print_even(1234);
        System.out.print(l);
    }
}
