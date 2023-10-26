package com.subs.alphawizard.AA_BSTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTreeDemo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       Node root = createTree();
       System.out.println("In Order Traversal...");
       inOrder(root);
       System.out.println("\nPre Order Traversal...");
       preOrder(root);
       System.out.println("\nPost Order Traversal...");
       postOrder(root);
       System.out.println("\n Height of this binary tree is.."+height(root));
       System.out.println("\n Size of this binary tree is.."+size(root));
       System.out.println("\n Level Order Traversal of binary tree is...");
       levelOrder(root,3);



    }

    static void inOrder(Node root){
        if(root==null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    static int height(Node root){
        if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }

    static int size(Node root){
        if (root ==null){
            return 0;
        }
        return size(root.left)+size(root.right)+1;

    }

    static int maxNode(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maxNode(root.left),maxNode(root.right)));
    }

    static void levelOrder(Node root, int level){
        if(root==null){
            return;
        }
        if(level==1){
            System.out.print(root.data+" ");
        }
        else if(level>1){
            levelOrder(root.left,level-1);
            levelOrder(root.right,level-1);
        }
    }

    static void printLevelOrderTraversalByQueue(Node root){

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        //q.add(null); If we want to print in a tree form
        while (!q.isEmpty()){
            Node curr = q.poll();
            if(curr==null){
                if(q.isEmpty())
                    return;
                q.add(null);
                System.out.println();
                continue;

            }
            System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }

    }

    static Node createTree(){
        Node root=null;
        System.out.println("Enter data: ");

        int data = sc.nextInt();
        if(data==-1) return null;

        root = new Node(data);
        System.out.println("Enter for left: "+data);
        root.left= createTree();

        System.out.println("Enter for right : "+data);
        root.right= createTree();

        return root;


    }
}
