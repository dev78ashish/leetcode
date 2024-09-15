class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode dummy = null;

        while(fast!=null && fast.next!=null){
            dummy=slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        

        dummy.next = slow.next;

        return head;
    }
}
