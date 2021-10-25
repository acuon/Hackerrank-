//https://www.hackerrank.com/challenges/30-linked-list-deletion/problem

import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

    public static Node removeDuplicates(Node head) {
        Node newHead = head;
        if (head == null || head.next == null){
            return head;
        }
        // while(head.next != null) {
        //     if(head.data == head.next.data) {
        //         Node temp = head;
        //         if(head.next == null) temp.next = null;
        //         while(temp.data == head.next.data) {
        //             head = head.next;
        //         }
        //         temp.next = head.next;
        //     } else {
        //         head = head.next;
        //     }
        // }
        if(head.data == head.next.data){
            head.next = head.next.next;
            removeDuplicates(head);
        } else {
            removeDuplicates(head.next);
        }
        return newHead;
    }

	 public static  Node insert(Node head,int data)
