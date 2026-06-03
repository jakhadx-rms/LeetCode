
// class Solution {
//     public ListNode reverseBetween(ListNode head, int left, int right) {
//         ListNode curr = head;
//         ListNode frwd = head;
//         ListNode pre = null;
//         ListNode last = head;
//         ListNode len = head;
//         int length = 0;
//         for(int i = 1; i < left; i++){
//             curr = curr.next;
//             frwd = frwd.next;
//             pre = curr;
//         }
        
//         while(len != null){
//             length++;
//         }

//         for(int i = 1; i <= length - right; i++){
//             last = last.next;
//         }
//         while(last != null){
//             frwd = curr.next;
//             curr.next = pre;
//             pre = curr;
//             curr = frwd;
//         }

//         return pre;
//     }
// }

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode prev = null;

        for(int i = 1; i < left; i++){
            prev = curr;
            curr = curr.next;
        }

        ListNode head2 = prev;   
        ListNode last = curr;        

        for(int i = 0; i < right - left + 1; i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if(head2 != null){
            head2.next = prev;
        } else {
            head = prev;
        }
        last.next = curr;
        return head;
    }
}