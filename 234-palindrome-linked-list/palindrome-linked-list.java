class Solution {
    ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null)
            return true;

        ListNode middle = findMiddle(head);

        ListNode curr = middle.next;
        middle.next = null;

        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode FH = head;
        ListNode SH = prev;

        while(SH != null){
            if(FH.val != SH.val)
                return false;

            FH = FH.next;
            SH = SH.next;
        }

        return true;
    }
}