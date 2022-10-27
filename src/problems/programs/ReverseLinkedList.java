package problems.programs;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode node= new ListNode();
        node.addAtTail(1);
        node.addAtTail(2);
        node.addAtTail(3);
        node.addAtTail(4);
        ListNode head=node.head,prev=null,curr=head;
        while(curr!=null){
            head = curr.next;
            curr.next = prev;
            prev = curr;
            curr = head;
        }
        while(prev!=null){
            System.out.println(prev.val);
            prev= prev.next;
        }
    }
}
