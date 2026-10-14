public class 142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Find meeting point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Find cycle starting node
                ListNode entry = head;

                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }

                return entry;
            }
        }

        return null;
    }
}