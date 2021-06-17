/*package whatever //do not write package name here */

import java.io.*;

class LL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public void insert(int data){
        Node newnode =new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
            
        }
        newnode.next=null;
        Node temp=head;
        
    while(temp.next!=null)
    temp=temp.next;
    
    temp.next=newnode;
    return;
    }
    public void printlist(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
	public static void main (String[] args) {
	LL l=new LL();
	l.insert(10);l.insert(20);l.insert(30);l.insert(40);l.insert(50);
    

	l.printlist();

	}
}