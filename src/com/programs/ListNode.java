package com.programs;

import java.util.List;
import java.util.Objects;

public class ListNode {
    Integer val;
    ListNode next;
    ListNode head;

    ListNode(Integer val, ListNode listNode) {
        this.val = val;
        this.next = listNode;
    }
    ListNode(){};


    ListNode(Integer val) {
        this.val = val;
    }

    public int get(int index) {
        int count = -1;
        ListNode temp = this.head;
        if (temp == null) {
            return -1;
        }
        while (temp != null) {
            count++;
            if (count == index)
                return temp.val;
            temp = temp.next;
        }
        return -1;
    }

    public void printList() {

        if (this.head == null)
            System.out.println("EMPTY");
        else {
            ListNode temp = this.head;
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
    }

    public void addAtTail(int val) {

        if (this.head == null) {
            this.val = val;
            this.head = this;
        } else {
            ListNode temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(val);
        }
    }

    public void addAtHead(int val) {
        this.head = new ListNode(val, this.head);
    }

    public void addAtIndex(int index, int val) {
        if (index == 0)
            addAtHead(val);
        else {
            if (this.head != null) {
                int count = 1;
                ListNode prev = this.head, temp = prev.next;
                while (temp != null) {
                    if (count == index) {
                        prev.next = new ListNode(val, temp);
                        count ++;
                        break;
                    } else {
                        prev = prev.next;
                        temp = temp.next;
                        count += 1;

                    }
                }
                if (count == index)
                    addAtTail(val);

            }
        }
    }

    public void deleteAtIndex(int index) {
        if(this.head!=null) {
            if (index == 0) {
                this.head = this.head.next;
            }
            else {
                int count = 0;
                ListNode temp = this.head;
                while (temp.next != null) {
                    if (count == index-1) {
                        temp.next = temp.next.next;
                        break;
                    }
                    temp=temp.next;
                    count++;
                }
            }
        }

    }
}
