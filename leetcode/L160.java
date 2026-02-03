public class L160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        while(a!=b){
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(6);
        
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = head;

        ListNode headB = new ListNode(7);
        headB.next = new ListNode(8);
        headB.next.next = new ListNode(9);
        headB.next.next.next = head;
        
        ListNode result = getIntersectionNode(headA, headB);
        System.out.println("Intersection node: " + result.val);
    }
}
