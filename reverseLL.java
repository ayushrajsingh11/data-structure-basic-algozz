public class reverseLL {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    
    public void pL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static  Node rev(Node head){
        Node next=null;
        Node curr=head;
        Node prev=null;
        int k=2;
        int c=0;
        while(curr!=null){
            if(c==k)
            break;
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            c++;
        }
        head=prev;
        return head;
    }
    public static int middle(Node head){
        Node slow=head;
        Node fast=head;
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow.data;
    }
    public static void main(String[] args) {
        reverseLL l=new reverseLL();
        l.head=new Node(10);
        l.head.next=new Node(20);
        l.head.next.next=new Node(30);
        l.pL(head);
       
        System.out.println(middle(head));
        head=rev(head);
        l.pL(head);

    }
}
