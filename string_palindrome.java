public class string_palindrome {
public static boolean is_palindrome(String str){
StringBuilder sb=new StringBuilder(str);
sb.reverse();
String rev=sb.toString();
if(rev.equals(str))
return true;
else return false;

} 
    public static void main(String[] args) {
       System.out.println(is_palindrome("abaa"));
       System.out.print(is_palindrome("ccbcc"));  
    } 
}
