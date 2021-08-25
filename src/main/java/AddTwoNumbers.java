public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbersSolution s = new AddTwoNumbersSolution();
        ListNode node1 = new ListNode(2);
        ListNode node1_2 = new ListNode(2);
        ListNode node1_3 = new ListNode(2);

        ListNode node2 = new ListNode(5);
        ListNode node2_2 = new ListNode(6);
        ListNode node2_3 = new ListNode(4);

        node1.next = node1_2;
        node1_2.next = node1_3;

        node2.next = node2_2;
        node2_2.next = node2_3;

        s.addTwoNumbers(node1, node2);
    }
}

class AddTwoNumbersSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultList = new ListNode();

        resultList = setNodeList(l1, l2, 0);
        return resultList;
    }

    public ListNode setNodeList(ListNode l1, ListNode l2, int upperValue) {
        ListNode result = new ListNode();

        int newUpper = 0;
        if (l1 != null && l2 != null) {
            if (l1.val + l2.val + upperValue >= 10) {
                result.val = (l1.val + l2.val + upperValue) % 10;
                newUpper = 1;
            } else {
                result.val = l1.val + l2.val + upperValue;
            }
        } else {
            if (l1 == null && l2 == null) {
                if (upperValue == 0) {
                    return null;
                } else {
                    result.val = 1;
                }
            } else {
                if (l1 == null) {
                    if (l2.val + upperValue >= 10) {
                        result.val = (l2.val + upperValue) % 10;
                        newUpper = 1;
                    } else {
                        result.val = l2.val + upperValue;
                    }
                } else {
                    if (l1.val + upperValue >= 10) {
                        result.val = (l1.val + upperValue) % 10;
                        newUpper = 1;
                    } else {
                        result.val = l1.val + upperValue;
                    }
                }
            }
        }

        ListNode nextL1 = null;
        ListNode nextL2 = null;
        if (l1 != null && l1.next != null) {
            nextL1 = l1.next;
        }
        if (l2 != null && l2.next != null) {
            nextL2 = l2.next;
        }

        if (nextL1 != null || nextL2 != null || newUpper > 0) {
            result.next = setNodeList(nextL1, nextL2, newUpper);
        }

        return result;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
