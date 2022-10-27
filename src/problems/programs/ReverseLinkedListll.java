package problems.programs;

public class ReverseLinkedListll {
    public static void main(String[] args) {
        ListNode node= new ListNode();

        node.addAtTail(1);
        node.addAtTail(2);
        node.addAtTail(3);
        node.addAtTail(4);
        node.addAtTail(5);
        ListNode head= node.head;
        int left=2,right=2;
        if(left==right) {
            System.out.println("head");
            System.exit(0);
        }
        ListNode newHead = new ListNode();
        newHead.next= head;
        ListNode curr= head,start=newHead,prev = null,temp,end = null;
        int count=0;

        while(curr!=null && curr.next!=null){
            count++;
            if(count==left) {
                prev = curr;
                end = curr;
                curr = curr.next;
                count++;
                while (curr != null && count != right) {
                    temp = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = temp;
                    count++;
                }
                if (curr == null) {
                    break;
                }
                if (count == right) {
                    temp = curr.next;
                    curr.next = prev;
                    start.next = curr;
                    end.next = temp;
                    break;
                }
            }
            else{
                start=curr;
                curr = curr.next;
            }
        }
        ListNode n=newHead.next;

        while(n!=null){
            System.out.println(n.val);
            n=n.next;
        }
    }

}
