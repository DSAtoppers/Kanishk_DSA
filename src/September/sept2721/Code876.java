package September.sept2721;

public class Code876 {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        int nodesNumber = 1;
        ListNode node = head;

        while (head.next!= null){
            nodesNumber++;
            head = head.next;
        }

        int halfNumber = nodesNumber/2;
        ListNode newNode;

        while (halfNumber > 0){
            node = node.next;
            halfNumber--;
        }

        newNode = node;

        return newNode;
    }

    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(5);
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;

        ListNode node = middleNode(h1);
        System.out.print(node.val + " ");
        while (node.next != null){
            System.out.print(node.next.val + " ");
            node = node.next;
        }

    }
}
