package com.programs;

public class MiddleOfLinkedList {
    public static <ListNode> void main(String[] args) {
        com.programs.ListNode head= new com.programs.ListNode(3);
        com.programs.ListNode slow=head,fast=slow;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow);
    }
}
