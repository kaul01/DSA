public class L25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode root = new ListNode(0 , head);
        ListNode cur = head;
        ListNode prev = root;
        
        while(cur != null){
            ListNode tail = cur;
            int listIndex=0;
            
            while(cur != null && listIndex < k){
                cur = cur.next;
                listIndex++;
            }
            if(listIndex != k){
                prev.next = tail;
            }else{
                prev.next = reverse(tail , k);
                prev = tail;
            }
        }
        return root.next;
    }
    private static ListNode reverse(ListNode head , int k){
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null && k-- >0){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.generateList(new int[]{1, 2, 3, 4, 5});
        ListNode.printList(reverseKGroup(head, 2));
    }
}
