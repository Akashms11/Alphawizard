package com.subs.alphawizard.linkedList;



public class ListOperations {

    static void traverse(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(" -> "+curr.data);
            curr=curr.next;
        }
    }


    static Node insert(Object data, Node head, int pos){
        Node toAdd = new Node(data);
        if(pos==0){
            toAdd.next = head;
            head = toAdd;
            return head;
        }
        Node prev = head;
        for(int i=0;i<pos-1;i++){
            prev=prev.next;
        }

        toAdd.next = prev.next;
        prev.next = toAdd;
        return head;
    }

    static Node delete(Node head, int pos){
        if(pos==0){
            head= head.next;
            return head;
        }
        Node prev = head;
        for(int i=0;i<pos-1;i++){
            prev=prev.next;
        }

        prev=prev.next.next;
        return head;
    }

   static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
       while(curr!=null) {
           Node temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;
       }
       return prev;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node("Akash");
        Node n3 = new Node("Vikas");
        Node n4 = new Node("Moon");
        Node n5 = new Node(20);
        //Linking of nodes
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
//        head = insert(5,head,2);
       // head = delete(head,2);
        head = reverse(head);
        traverse(head);
    }
}
