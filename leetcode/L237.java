public class L237 {
    public static void deleteNode(ListNode node) {
        if(node.next == null) node = null;
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        deleteNode(head.next);
        System.out.println("New List: ");
        ListNode.printList(head);
    }
}
