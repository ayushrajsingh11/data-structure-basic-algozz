import java.util.Stack;


public class preorder {

     Node root;

    class Node{
        int key;
        Node left,right;
        Node (int data){
            key=data;
            left=right=null;
        }
    }
    public void iter_pre(){
        i_p(root);
    }
    public void i_p(Node node ){
        if(node == null)
        return;
Stack<Node> nodeStack =new Stack<Node>();
nodeStack.push(root);
while(nodeStack.empty()==false){
    Node mynode=nodeStack.peek();
    System.out.print(mynode.key+" ");
    nodeStack.pop();
 if(mynode.right!=null)
 nodeStack.push(mynode.right);
 if(mynode.left!=null)
 nodeStack.push(mynode.left);

}



    }

    public static void main(String[] args) {
        preorder tree=new preorder();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        tree.iter_pre();
    }
}
