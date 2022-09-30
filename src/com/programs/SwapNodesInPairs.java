package com.programs;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode node1 = new ListNode(2);
        head.next=node1;
        ListNode node2= new ListNode(3);
        node1.next=node2;
        ListNode node3= new ListNode(4);
        node2.next=node3;


        ListNode prev = new ListNode(-1);
        prev.next=head;

        ListNode first = head;
        head= prev;
        while(first !=null && first.next!=null){
            ListNode second= first.next;
            ListNode next= first.next.next;

            second.next = first;
            first.next= next;
            prev.next=second;

            prev= first;
            first =next;

        }
        print(head.next);
    }
    private static void print(ListNode node){
        while(node!=null){
            System.out.println(node.val);
            node=node.next;

        }
    }
}
