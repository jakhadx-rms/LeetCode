class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode ele = head;

        while (ele != null) {
            length++;
            ele = ele.next;
        }

        if (length == n) {
            return head.next;
        }

        int pos = length - n;

        ListNode slow = head;

        for (int i = 1; i < pos; i++) {
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}