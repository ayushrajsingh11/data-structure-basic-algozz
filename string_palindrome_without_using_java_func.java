import java.util.*;
public class string_palindrome_without_using_java_func {
public static String is_palindrome(String str){
    List<Character> l=new ArrayList<>();
   
for(int i=str.length()-1;i>=0;i--)
{
    l.add(str.charAt(i));
}

return l.toString();
}
public static String is_palindrome1(String str){
    List<Character> l=new ArrayList<>();
   
for(int i=0;i<str.length();i++)
{
    l.add(str.charAt(i));
}

return l.toString();
}
    public static void main(String[] args) {
        
String str="aabaa";
String real=is_palindrome1(str);
String rev=is_palindrome(str);
System.out.println(rev);
if(real.equals(rev)) System.out.print("true");
else System.out.print("false");
}    
}
