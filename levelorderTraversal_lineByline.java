package practice;
import java.util.*;

import practice.Levelorder_usingQUEUE.node;

public class levelorderTraversal_lineByline {
                public static node root;
                public static class node{
                	int key;
                	node left,right;
                	node(int data){
                		key=data;
                		left=right=null;
                	}
                }
                public void printlevel(){
                	
                	 if(root==null)
                		 return;
                	 
                Queue<node> q=new LinkedList<node>();
                	q.add(root);
                	
                while(true){
                	int count=q.size();
                	if(count==0)
                		break;
                
                	while(count>0){
                	node temp=q.poll();
                	System.out.println(temp.key + " ");
                	
                	if(temp.left!=null)
                		q.add(temp.left);
                	
                	if(temp.right!=null)
                		q.add(temp.right);
                	count--;
                	}
                	System.out.println();
                }
                }
                public static void main(String args[]){
                	levelorderTraversal_lineByline tree=new levelorderTraversal_lineByline ();
                	tree.root=new node(1);
              	  tree.root.left=new node(2);
              	  tree.root.right=new node(3);
              	  tree.root.left.right=new node(4);
              	  tree.root.left.left=new node(5);
              	  tree.root.right.left=new node(6);
              	  tree.root.right.right=new node(7);
              	  tree.printlevel();
                }
}
