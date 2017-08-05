package practice;
import java.util.*;

public class Inorder_WithoutRecursion {
        public static node root;
        public static class node{
        	int key;
        	node left,right;
        	node(int data){
        		key=data;
        		left=right=null;
        	}
        }
        void inorder(){
          Stack<node> s=new Stack<node>();
          if(root==null)
        	  return;
          
          node temp=root;
          
          while(temp!=null){
        	  s.push(temp);	
        	  temp=temp.left;
          }
          
           while(s.size()>0){
        	  temp=s.pop();
        	  System.out.println(temp.key +" ");
        	  
        	  if(temp.right!=null){
        		  temp=temp.right;
        	  }
        	  while (temp != null) {
                  s.push(temp);
                  temp= temp.left;
        	  }
        	  
          }
        }
        public static void main(String args[]){
        	Inorder_WithoutRecursion tree=new Inorder_WithoutRecursion ();
        	 tree.root=new node(1);
       	  tree.root.left=new node(2);
       	  tree.root.right=new node(3);
       	  tree.root.left.right=new node(4);
       	  tree.root.left.left=new node(5);
       	  tree.root.right.left=new node(6);
       	  tree.root.right.right=new node(7);
       	  tree.inorder();
        }
}
