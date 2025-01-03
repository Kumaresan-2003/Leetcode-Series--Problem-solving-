package Tree_imp;
class Node{
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}
public class BinaryTree {
	Node root;
	BinaryTree(){
		root=null;
	}
	// insert
	public void  insert(int key) {
		root=insertRec(root,key);
	}
	private Node insertRec(Node root,int key) {
		if(root==null) {
			root =new Node(key);
			return root;
			
					
		}
		else {
			if(key<root.key) {
				root.left=insertRec(root.left,key);
			}
			else if(key>root.key) {
				root.right=insertRec(root.right,key);
			}
		}
		return root;
	}
	  static void preorder(Node root) {
		  if(root!=null) {
			  System.out.print(root.key+" ");
			  preorder(root.left);
			  preorder(root.right);
		  }
		  
	  }
     static void inorder(Node root) {
    	 if(root!=null) {
    		 inorder(root.left);
    		 System.out.print(root.key+" ");
    		 inorder(root.right);
    	 }
    	 //System.out.println();
     }
     
     static void postorder(Node root) {
    	 if(root !=null) {
    		 postorder(root.left);
    		 postorder(root.right);
    		 System.out.print(root.key+" ");
    	 }
    	 //System.out.println();
     }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree ob=new BinaryTree();
		ob.insert(1);
		ob.insert(2);
		ob.insert(3);
		ob.insert(4);
		ob.insert(5);
		
		System.out.print(" preorder printing");
		preorder(ob.root);
		System.out.println();
		
		System.out.print(" Inorder printing");
		inorder(ob.root);
		System.out.println();
		
		System.out.print("Post printing");
		postorder(ob.root);
		System.out.println();
		

	}

}
