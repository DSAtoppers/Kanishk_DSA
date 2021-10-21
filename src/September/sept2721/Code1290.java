package September.sept2721;

public class Code1290 {

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

    public static int getDecimalValue(ListNode head) {
        StringBuilder num = new StringBuilder();
        num = new StringBuilder(head.val + "");
        while (head.next != null){
            num.append(head.next.val);
            head = head.next;
        }

        return Integer.parseInt(num.toString(), 2);
    }

    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(0);
        ListNode h3 = new ListNode(1);
        h1.next = h2;
        h2.next = h3;

        System.out.println(getDecimalValue(h1));
    }
}
