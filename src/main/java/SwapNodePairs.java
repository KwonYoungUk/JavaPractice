public class SwapNodePairs {
    public static void main(String[] args) {
    	SwapNodePairsSolution s = new SwapNodePairsSolution();

        ListNode node1 = new ListNode(1);
        ListNode node1_2 = new ListNode(2);
        ListNode node1_3 = new ListNode(3);
        ListNode node1_4 = new ListNode(4);

        node1.next = node1_2;
        node1_2.next = node1_3;
        node1_3.next = node1_4;

        s.swapPairs(node1);
    }
}

class SwapNodePairsSolution {
	public ListNode swapPairs(ListNode head) {
        int temp = 0;
        ListNode refToStart = head;
        while (head != null) {
            temp = head.val;
            if (head.next != null) {
                head.val = head.next.val;
                head.next.val = temp;
                head = head.next.next;
            }  else {
                head = head.next;
            }
        }
        return refToStart;
    }

}
