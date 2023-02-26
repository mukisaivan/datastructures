package bSINGLYLINKEDLISTS;

public class bSearchingAnElement {
    public static void main(String[] args) {

        bSearchingAnElement sll = new bSearchingAnElement();

        sll.head = new ListNode(8);
        ListNode second = new ListNode(34);

        sll.head.next = second;

    }
    
    ListNode head;

    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
