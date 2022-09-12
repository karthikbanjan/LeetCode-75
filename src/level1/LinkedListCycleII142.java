package level1;

import java.util.HashSet;

public class LinkedListCycleII142 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode detectCycleSolution1(ListNode head) {
        HashSet<ListNode> passedNodes = new HashSet<>();

        while (head != null) {
            if (!passedNodes.add(head)) {
                return head;
            }
            head = head.next;
        }

        return null;
    }

    public ListNode detectCycleSolution2(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                ListNode slow2 = head;
                while (slow2 != slow) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }

        }

        return null;
    }

}
