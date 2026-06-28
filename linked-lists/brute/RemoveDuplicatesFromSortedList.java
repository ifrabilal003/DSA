

import java.util.*;

public class RemoveDuplicatesFromSortedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> seen = new HashSet<>();
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (head != null) {
            if (seen.add(head.val)) {
                curr.next = new ListNode(head.val);
                curr = curr.next;
            }
            head = head.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList sol = new RemoveDuplicatesFromSortedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        ListNode result = sol.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " "); 
            result = result.next;
        }
    }
}
