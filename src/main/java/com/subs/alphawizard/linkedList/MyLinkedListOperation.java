package com.subs.alphawizard.linkedList;

public class MyLinkedListOperation {

    static void traverse(MyList head){
        MyList curr = head;
        while(curr!=null){
            System.out.print(curr.data+"-> ");
            curr = curr.next;
        }
    }

    static boolean cycleIsPresent(MyList head){
        MyList slow = head;
        MyList fast = head;

        while(slow.next != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow.data==fast.data)
                return true;
        }
        return false;
    }

    public static void main(String ar[]){
        MyList n1 = new MyList<>("Akash");
        MyList n2 = new MyList<>("Singh");
        MyList n3 = new MyList<>("Vihan");
        MyList n4 = new MyList<>("Maliya");
        MyList n5 = new MyList<>("Pihu");
        MyList n6 = new MyList<>("Karanwal");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n4;
        System.out.println("Cycle Exists: "+cycleIsPresent(n1));

    }
}
