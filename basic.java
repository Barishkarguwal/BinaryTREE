package practice;

public class basic {
        
        public static class node{
        	int key;
        	node left,right;
        	node(int item){
        		key=item;
        		left=right=null	;
        		}
        }
        public static class binarytree{
        	node root;
        	
        	binarytree(){
        		root=null;
        	}
        	public static void inorder(node new_node){
        		if(new_node==null){
        			return;
        		}	
        	inorder(new_node.left);	
        	System.out.println(new_node.key +" ");
        	inorder(new_node.right);
        	}
        	public void preorder(node new_node){
        		if(new_node==null)
        			return;
        		System.out.println(new_node.key	 +" ");
        		preorder(new_node.left);
        		preorder(new_node.right);
        	}
        	public void postorder(node new_node){
        		if(new_node==null)
        			return;
        		
        		postorder(new_node.left);
        		postorder(new_node.right);
        		System.out.println(new_node.key + " ");
        	}
        	
        public void inorder(){inorder(root);}
        public void preorder(){preorder(root);}
        public void postorder(){postorder(root);}
       
        
        public static void main(String args[]){
        	binarytree obj=new binarytree();
        	obj.root=new node(1);
        	obj.root.left=new node(2);
        	obj.root.right=new node(3);
        	obj.root.left.left=new node(4);
        	obj.root.left.right=new node(5);
        	System.out.println("inorder traversal of binary tree ");
        	obj.inorder();
        	System.out.println("preorder traversal of binary tree ");
        	obj.preorder();
        	System.out.println("postorder traversal of binary tree ");
        	obj.postorder();
        }
        }
}
