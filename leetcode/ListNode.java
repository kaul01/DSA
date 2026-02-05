public class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }


    public static void printList(ListNode head) {
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode generateList(int[] arr){
        ListNode head = new ListNode(-1, null);
        ListNode cur = head;
        for(int i:arr){
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        return head.next;
    }
}
