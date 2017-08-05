package practice;
import java.util.*;

public class Levelorder_usingQUEUE {
                public static node root;
                public static class node{
                	int key;
                	node right,left;
                	node(int data){
                		key=data;
                		left=right=null;
                	}
                }
                
                public void levelorderprint(){
                   	
                	Queue<node> queue=new LinkedList<node>();
                	queue.add(root);
                	
                	
                	while(!(queue.isEmpty())){
                		node temp=queue.poll();
                		System.out.println(temp.key +" ");
                		
                		if(temp.left!=null)
                		   queue.add(temp.left);
                		
                		if(temp.right!=null)
                			queue.add(temp.right);
                			
                	}
                	
                }
                
                
              public static void main(String args[]){
            	  Levelorder_usingQUEUE tree=new Levelorder_usingQUEUE();
            	  tree.root=new node(1);
            	  tree.root.left=new node(2);
            	  tree.root.right=new node(3);
            	  tree.root.left.right=new node(4);
            	  tree.root.left.left=new node(5);
            	  tree.root.right.left=new node(6);
            	  tree.root.right.right=new node(7);
            	  System.out.println("Level order traversal of binary tree is");
            	  tree.levelorderprint();
              }
}
