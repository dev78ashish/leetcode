class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode second = reverseList(slow);

        ListNode first = head;

        while (second != null) {
            if(first.val!=second.val) return false;
            first=first.next;
            second=second.next;
        }

        return true;
    }

    static ListNode reverseList(ListNode head) {
        
        ListNode curr = head, prev = null, next;

        while (curr != null) {
            
            next = curr.next;
            
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
