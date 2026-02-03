public class L234 {
    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        slow = slow.next;

        while(slow != null){
            if(head.val != slow.val) return false;

            slow = slow.next;
            head = head.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;

        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        System.out.println("Is palindrome: " + isPalindrome(head));
    }
}
