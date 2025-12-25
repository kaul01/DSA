public class L206 {
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode ans = null;
        while(head != null){
            ListNode next = head.next;
            head.next = ans;
            ans = head;
            head = next;
        }
        return ans;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = reverseList(head);
        System.out.println("Reversed list: ");
        ListNode.printList(result);
    }
}

