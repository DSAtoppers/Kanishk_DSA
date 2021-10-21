package September.sept2721;

public class Code237 {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }
    }

    public void deleteNode(ListNode node) {
        node.next = node.next.next;
        node.val = node.next.val;

    }
}
