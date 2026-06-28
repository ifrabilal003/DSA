
import java.util.*;

public class MergeTwoSortedLists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> vals = new ArrayList<>();
        while (l1 != null) { vals.add(l1.val); l1 = l1.next; }
        while (l2 != null) { vals.add(l2.val); l2 = l2.next; }
        Collections.sort(vals);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : vals) { curr.next = new ListNode(v); curr = curr.next; }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists sol = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode result = sol.mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.print(result.val + " "); 
            result = result.next;
        }
    }
}
