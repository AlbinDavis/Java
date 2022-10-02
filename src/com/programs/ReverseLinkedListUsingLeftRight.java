package com.programs;

public class ReverseLinkedListUsingLeftRight {
    public static void main(String[] args) {
        ListNode node= new ListNode();

        node.addAtTail(1);
        node.addAtTail(2);
        node.addAtTail(3);
        node.addAtTail(4);
        node.addAtTail(5);
        ListNode head= node.head;
        int left=2,right=4;

        ListNode newHead = new ListNode();
        newHead.next= head;
        ListNode curr= head,start=newHead,prev = null,temp,end = null;

        while(curr!=null && curr.next!=null){
            if(curr.val==left) {
                prev = curr;
                end = curr;
                curr = curr.next;
                while (curr != null && curr.val != right) {
                    temp = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = temp;
                }
                if (curr == null) {
                    break;
                }
                if (curr.val == right) {
                    temp = curr.next;
                    curr.next = prev;
                    start.next = curr;
                    end.next = temp;
                    break;
                }
            }else{
                start=curr;
                curr = curr.next;
            }}
        ListNode n=newHead.next;

        while(n!=null){
            System.out.println(n.val);
            n=n.next;
        }
        }
        
}
