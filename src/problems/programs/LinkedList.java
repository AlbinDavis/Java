package problems.programs;

public class LinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.addAtTail(1);
        listNode.addAtTail(2);
        listNode.addAtTail(3);
        listNode.addAtTail(4);
        listNode.addAtIndex(4,5);
        listNode.deleteAtIndex(6);
        listNode.printList();
    }
}
