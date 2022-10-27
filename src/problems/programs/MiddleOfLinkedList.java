package problems.programs;

public class MiddleOfLinkedList {
    public static <ListNode> void main(String[] args) {
        problems.programs.ListNode head= new problems.programs.ListNode(3);
        problems.programs.ListNode slow=head,fast=slow;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow);
    }
}
