public class L142 {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.generateList(new int[]{3, 2, 0, -4});
        ListNode next = head.next;
        ListNode tail = head.next.next.next;

        tail.next = next;

        System.out.println(detectCycle(head).val);
    }
}
