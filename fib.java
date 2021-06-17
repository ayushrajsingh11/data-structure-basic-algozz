import java.util.*;
public class fib {
    public static List<Integer> fib(int n){
      List<Integer> l=new ArrayList<>();
      l.add(0);l.add(1);
      int n1=0,n2=1,n3;
      for(int i=2;i<n;i++){
          n3=n1+n2;
          l.add(n3);
          n1=n2;
          n2=n3;
      }
return l;
    }
    public static void main(String[] args) {
     
      int[] arr={10,20,30,25,60,5,95};
      int len=arr.length;
      List<Integer> l=fib(len);int sum=0;
      System.out.println(l);
      for(int i=0;i<len;i++){
          if(l.get(i)<len-1){
              sum=sum+arr[l.get(i)];
          }
      }
      System.out.print(sum);

    }
}
