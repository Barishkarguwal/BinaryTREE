package practice;

public class Deleting_tree {
                 public static node root;
                 public static class node{
                	 int key;
                	 node left,right;
                	 node(int data){
                		 key=data;
                		 left=right=null;
                	 }
                 }
                 public void delete(node new_node){
                	
                	 
                	 if(new_node==null)
                		 return;
                	 
                	delete(new_node.left);
                	delete(new_node.right);
                	System.out.println(new_node.key +" ");
                	new_node=null;
                 }
                 public static void main(String args[]){
                	  Deleting_tree tree=new Deleting_tree();
                	  tree.root=new node(5);
                	  tree.root.left=new node(7);
                	  tree.root.right=new node(11);
                	  tree.root.left.left=new node(19);
                	  tree.root.left.right=new node(21);
                	  
                	  tree.delete(root);
                	  tree.root=null;
                	  System.out.println("tree deleted");
                 }
}
