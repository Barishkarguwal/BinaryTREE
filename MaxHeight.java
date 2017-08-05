package practice;

public class MaxHeight {
           public static node root;
           public static class node{
        	   int key;
        	   node left,right;
        	   node(int data){
        		   key=data;
        		   left=right=null;
        	   }
           }
           public int height(node new_node){
        	   
        	    if(new_node==null){
        	    	return 0;
        	    }
        	    else{ 
        	    	
        	    int lheight=height(new_node.left);
        	    int Rheight=height(new_node.right);
        	    
        	    if(lheight>Rheight)
        	    	return (lheight+1);
        	    
        	    else
        	    	return (Rheight+1);
        	    }
           }
           public static void main(String args[]){
        	   MaxHeight tree=new MaxHeight();
        	   tree.root=new node(4);
        	   tree.root.left=new node(14);
        	   tree.root.right=new node(12);
        	   tree.root.left.left=new node(14);
        	   tree.root.left.left.left=new node(9);
        	   tree.root.right.left=new node(151);
        	   System.out.println("Max height is of tree is" + tree.height(tree.root));
           }
}
