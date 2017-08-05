package practice;

public class Level_order_traversal {
	               public static node root;
                           public static class node{
                        	   int data;
                        	   node left , right;
                        	   node(int data){
                        		   this.data=data;
                        		   left=right=null;
                        	   }
                           }
                           public static void main(String args[]){
                        	   Level_order_traversal tree=new Level_order_traversal();
                        	   tree.root=new node(1);
                        	   tree.root.left=new node(2);
                        	   tree.root.right=new node(3);
                        	   tree.root.left.left=new node(4);
                        	   tree.root.left.right=new node(5);
                        	    tree.levelorder(root);
                           }
                           public void levelorder(node new_node){
                        	   int h=height(new_node);
                        	   System.out.println("height of the tree is"+" "+ h);
                        		for(int i=1;i<=h;i++){
                        			printgivenorder(new_node,i);
                        			System.out.println();
                        		}
                           }
                         public int height(node root){
                        	 if(root==null){
                        		 return 0;
                        	 }
                         else{  
                        		 
                        	 int lheight,rheight;   
                        	lheight= height(root.left);
                        	rheight=height(root.right);
                        	 
                        	if(lheight>rheight)
                        		return (lheight+1);
                        	
                        	else
                        		return (rheight+1);
                        	
                        	 }
                        	 
                         }
                         public void printgivenorder(node new_node,int level){
                        	  
                        	 if(new_node==null){
                        		 return;
                        	 }
                        	 if(level==1){
                        		 System.out.println( new_node.data + " ");
                        	 }
                        	 else if(level>1){
                        		 printgivenorder(new_node.left,level-1);
                        		 printgivenorder(new_node.right,level-1);
                        	 }
                        	 
                         }
                           
}