package practice;
import java.util.Scanner;


public class max_sizetree {
            public static node root;
            public static class node{
            	int key;
            	node left,right;
            	node(int data){
            		key=data;
            		left=right=null;
            	}
            }
            public boolean check(node new_node,int data){
            	if(new_node==null)
            		return (data==0);
            	
            	else{
            		boolean s=false;
            	
                   int subsum=data - new_node.key; 
                   if(subsum==0 && new_node.left == null && new_node.right==null)
                	   return true;
                   
                   if(new_node.left!=null)
                	   s=s || check(new_node.left,subsum);
                   
                   if(new_node.right!=null)
                	   s=s || check(new_node.right,subsum);
                   
                   return s;
                	   
            	}
            }
            public static void main(String args[]){
            	max_sizetree tree=new max_sizetree();
            	tree.root = new node(10);
                tree.root.left = new node(8);
                tree.root.right = new node(2);
                tree.root.left.left = new node(3);
                tree.root.left.right = new node(5);
                tree.root.right.left = new node(2);
            	   Scanner in =new Scanner(System.in);
            	   System.out.println("enteer sum you want to check");
            	   int sum=in.nextInt();
            	   System.out.println(tree.check(root,sum));
            	   
            }
}
