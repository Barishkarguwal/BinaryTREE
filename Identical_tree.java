package practice;


public class Identical_tree {
	 public static node root,root1;
     public static class node{
  	   int key;
  	   node left,right;
  	   node(int data){
  		   key=data;
  		   left=right=null;
  	   }
     }
     
      public boolean identical(node node1,node node2){
    	  if(node1==null&&node2==null)
    		  return false;
    	  
    	  if(node1!=null && node2!=null)
    		return (node1.key==node2.key && identical(node1.left,node2.left) && identical(node1.right,node2.right));
      
    	  
      return false;
      }
     public static void main(String args){
    	 Identical_tree tree=new Identical_tree();
           tree.root=new node(5);
      	  tree.root.left=new node(7);
      	  tree.root.right=new node(11);
      	  tree.root.left.left=new node(19);
      	  tree.root.left.right=new node(21);
      	  
      	  tree.root1=new node(5);
      	  tree.root1.left=new node(7);
      	  tree.root1.right=new node(11);
      	  tree.root1.left.left=new node(19);
      	  tree.root1.left.right=new node(21);
      	  System.out.println(tree.identical(root,root1));
     }
}
