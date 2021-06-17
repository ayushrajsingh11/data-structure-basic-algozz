public class queueImplementation {
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public boolean isEmpty(){
        if(head==null)
        return true;
        return false;
    }
    public void enqueue(int data){
        Node newnode=new Node(data);
        if(head==null)
        head=newnode;
        else{
            Node temp=head;
            head=newnode;
            newnode.next=temp;
        }
System.out.println(data+" -> enququed");
    }
    public int dequeue(){
        if(head==null)
        return 0;
        else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }  
            int pop= temp.next.data;
            temp.next=null;
return pop;
          
        }
    }
    public int front(){
return head.data;
    }
    public int rear(){
Node temp=head;
while(temp.next!=null){
    temp=temp.next;

}
return temp.data;
    }

    public static void main(String[] args){
queueImplementation l=new queueImplementation();
l.enqueue(10);
l.enqueue(20);
l.enqueue(30);
l.enqueue(40);

System.out.println(l.dequeue()+" -> dequeued");
System.out.println(l.front()+" -> front");
System.out.print(l.rear()+" -> rear");

    }
}
