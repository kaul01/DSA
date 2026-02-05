public class L61 {
    public static ListNode rotateRight(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;

        if(fast == null || fast.next == null)return head;

        ListNode cur=head;
        int size=0;
        while(cur != null){
            size++;
            cur = cur.next;
        }
        k = k%size;

        if(k == 0)return head;


        for(int i=0 ; i<k ; i++){
            fast = fast.next;
        }
        ListNode newHead = null;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
    }
    public static void main(String[] args) {
        ListNode head = ListNode.generateList(new int[]{1,2,3,4,5});
        ListNode.printList(rotateRight(head, 2));
    }
}
