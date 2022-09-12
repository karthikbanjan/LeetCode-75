package level1;

public class MiddleOfTheLinkedList876 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static int size(ListNode head) {
        int size = 0;
        while (head != null) {
            head = head.next;
            size++;
        }
        return size;
    }

    public ListNode middleNodeSolution1(ListNode head) {
        ListNode middle = head;
        int size = size(head);

        for (int i = 0; i < size/2 - 1; i++) {
            middle = middle.next;
        }

        return middle;
    }

    public ListNode middleNodeSolution2(ListNode head) {
        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

}
