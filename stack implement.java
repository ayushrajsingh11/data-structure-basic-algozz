/*package whatever //do not write package name here */

import java.io.*;

class stack {
    private int max=1000;
    private int top;
    private int[] a=new int[max];
    public boolean isEmpty(){
        return (top<0);
    }
    stack(){
        top=-1;
    }
 public boolean push(int x){
     if(top>=max-1){
         System.out.println("stack overflow");
         return false;
     }else{
         a[++top]=x;
         System.out.println(x+ " pushed into the satck");
         return true;
     }
 }
public int pop(){if(top<0){
    System.out.println("stack is empty");

    return 0;
}else{
    int x=a[top--];
    return x;
    
}
     
 }
 public int peek(){
     if(top<0)
    {
        System.out.println("stack underflow");
        return 0;
    }else{
        int x=a[top];
        return x;
    }
 }
	
}
	class Main{
	public static void main (String[] args) {
		stack s=new stack();
		s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
	}
}