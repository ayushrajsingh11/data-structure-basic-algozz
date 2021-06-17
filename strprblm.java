import java.util.*;
public class strprblm {
    public static String  fun(String s1 ){
      char[] ch=s1.toCharArray();
    Stack<Character> l=new Stack<>();
    for(int i=0;i<ch.length;i++){
        l.push(ch[i]);
        if(ch[i]=='#'){
            l.pop();
            l.pop();
        }
    }
       return l.toString();
     }
    public static void main(String[] args) {
     String s1="xz#";
     String s2="xyzz##";
     String t1=fun(s1);System.out.println(t1);

     String t2=fun(s2);System.out.println(t2);
     if(t1.equals(t2))
     System.out.print("true");
     else
     System.out.print("false");



     /*
  String t1=fun(s1);
  String t2=fun(s2);
  if(t1.length()==t2.length()){
      
          if(t1.equals(t2)){
              System.out.print("true");
          }else System.out.print("false");
      

  }else System.out.print("false");
*/   }
}
