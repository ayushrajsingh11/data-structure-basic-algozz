public class BST_search_insertion {
    Node root;
    class Node{
        int key;
        Node left,right;
        Node(int data){
            key=data;
            left=right=null;
        }
    }
    BST_search_insertion(){
        root=null;
    }
    
    public void insert(int key){
        root=insertrec(root,key);
    }
    public Node insertrec(Node root,int key){
        if(root==null)
        {
            root=new Node(key);
            return root;
        }if(key<root.key)
        root.left=insertrec(root.left, key);
        else if(key>root.key)
        root.right=insertrec(root.right, key);
    return root;
    }
    public void inorder(){
        inorderrec(root);
    }
   
    public void inorderrec(Node root){
        if(root!=null){
            inorderrec(root.left);
            System.out.println(root.key);
            inorderrec(root.right);
        }
    }

    public static void main(String[] args) {
       BST_search_insertion l=new BST_search_insertion();
       l.insert(50);
       l.insert(30); 
       l.insert(20); 
       l.insert(40); 
       l.insert(70); 
       l.insert(60); 
       l.insert(80); 
       l.inorder();
      
       
      
   
    }
}
