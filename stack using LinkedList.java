/*package whatever //do not write package name here */

import java.io.*;

class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public boolean isEmpty(){
        if(head==null)
        return true;
        else return false;
    }
    public void push(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            head=newnode;
            newnode.next=temp;
        }
        System.out.println(data + " pushed to the stack");
    }
    public int pop(){
       int popped =Integer.MIN_VALUE;
       if(head==null)
       System.out.println("stack is empty");
       else{
           popped =head.data;
           head=head.next;
       }return popped;
    }
    public int peek(){
        if(head==null){
            System.out.println("stack is empty");
            return 0;
        }else 
        return head.data;
    }
	public static void main (String[] args) {
	LL l=new LL();
	l.push(10);
	l.push(20);
	l.push(30);
	System.out.println(l.pop()+" poped");
	
	System.out.println(l.peek()+" peek");
	}
}