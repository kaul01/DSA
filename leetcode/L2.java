public class L2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        int carry=0;
        while(l1 != null && l2 != null){
            int cur_sum = l1.val + l2.val + carry;
            carry = cur_sum/10;
            cur.next = new ListNode(cur_sum%10);
            cur = cur.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int cur_sum = l1.val + carry;
            carry = cur_sum/10;
            cur.next = new ListNode(cur_sum%10);
            cur = cur.next;
            l1 = l1.next;
        }

        while(l2 != null){
            int cur_sum = l2.val + carry;
            carry = cur_sum/10;
            cur.next = new ListNode(cur_sum%10);
            cur = cur.next;
            l2 = l2.next;
        }

        if(carry > 0){
            cur.next = new ListNode(carry);
        }

        return res.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode.printList(addTwoNumbers(l1, l2));
    }
}
