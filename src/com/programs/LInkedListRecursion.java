package com.programs;

public class LInkedListRecursion {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode.next= listNode2;
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;
        printNodeValues(listNode);

    }

    private static void printNodeValues(ListNode head) {
        if(head==null)
            return;
        System.out.println(head.val);
        printNodeValues(head.next);
    }
}
