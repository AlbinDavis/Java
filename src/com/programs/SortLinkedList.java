package com.programs;

public class SortLinkedList {
    public static void main(String[] args) {
        ListNode head=new ListNode(5);
        ListNode node2=new ListNode(4);
        head.next=node2;
        ListNode node3=new ListNode(3);
        node2.next=node3;
        ListNode node4=new ListNode(2);
        node3.next=node4;
        ListNode node5=new ListNode(1);
        node4.next=node5;
        ListNode result =sortLinkedList(head);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }

    private static ListNode sortLinkedList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode left=head;
        ListNode mid= findMid(head);
        ListNode right=mid.next;
        mid.next=null;
        left=sortLinkedList(left);
        right=sortLinkedList(right);

        return mergeLinkedList(left,right);

    }

    private static ListNode findMid(ListNode head){
        ListNode slow= head,fast=head.next;
        while(fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    private static ListNode mergeLinkedList(ListNode list1,ListNode list2){
        ListNode result = new ListNode(0,null);
        ListNode temp=result;
        while(list1!=null && list2!=null) {
            if (list1.val < list2.val) {
                temp.next = new ListNode(list1.val);
                temp = temp.next;
                list1 = list1.next;
            } else {
                temp.next = new ListNode(list2.val);
                temp = temp.next;
                list2 = list2.next;
            }

        }
            if(list1!=null){
                temp.next=list1;
            }
            if(list2!=null){
                temp.next=list2;
            }
            return result.next;
    }
}
