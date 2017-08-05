package practice;

public class sizeOFaTree {
              public static node root;
              public static class node{
            	  int key;
            	  node left,right;
            	  node(int data){
            		  key=data;
            		  node left=right=null;
            	  }
              }
              public int maxsize(node new_node){
            	  
            	  if(new_node==null)
            		  return 0;
            	  
            	 return (maxsize(new_node.left)+1+maxsize(new_node.right)); 
            	 
            	  
              }
              public static void main(String args[]){
            	  sizeOFaTree tree=new sizeOFaTree();
               tree.root=new node(4);
           	   tree.root.left=new node(14);
           	   tree.root.right=new node(12);
           	   tree.root.left.left=new node(14);
           	   tree.root.left.left.left=new node(9);
           	   tree.root.right.left=new node(151);
           	   tree.root.right.left.left=new node(1);
           	   System.out.println("size of a tree is" + tree.maxsize(root));
           	   
              }
}
