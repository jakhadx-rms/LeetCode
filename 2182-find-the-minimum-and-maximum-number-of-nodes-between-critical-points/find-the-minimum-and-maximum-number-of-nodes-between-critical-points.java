class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1, -1};
        if (head == null || head.next == null || head.next.next == null) {
            return ans;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        int position = 1;
        int firstCritical = -1;
        int previousCritical = -1;
        int minDistance = Integer.MAX_VALUE;
        while (curr.next != null) {
            int prevValue = prev.val;
            int currValue = curr.val;
            int nextValue = curr.next.val;
            boolean isCritical =
                    (currValue > prevValue && currValue > nextValue) ||
                    (currValue < prevValue && currValue < nextValue);
            if (isCritical) {
                if (firstCritical == -1) {
                    firstCritical = position;
                }
                if (previousCritical != -1) {
                    minDistance = Math.min(
                            minDistance,
                            position - previousCritical
                    );
                }
                previousCritical = position;
            }
            prev = curr;
            curr = curr.next;
            position++;
        }
        if (firstCritical == previousCritical) {
            return ans;
        }
        int maxDistance = previousCritical - firstCritical;
        ans[0] = minDistance;
        ans[1] = maxDistance;
        return ans;
    }
}