package bSINGLYLINKEDLISTS;

public class aSinglyLinkedList {
    
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        aSinglyLinkedList sll = new aSinglyLinkedList();

        sll.head = new ListNode(10);

        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);

        // connecting them together

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        sll.insertAnywhere(3, 56); //inserts a node at any specified position in the list

        // sll.insertFirst(8); // adds a new node to the beginning of the list

        sll.insertLast(45); // adds a node to the end

        sll.printList(); //prints the contents in the linked list
        System.out.println(" ");
        System.out.println("Number of contents in the Linked list = " + sll.countContents());  //counts th contents available

    }
    
    //method to display the contents
    public void printList() {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }

        System.out.print("null");
    }

    // method too show the number of contents in the Linked list
    public int countContents() {
        int count = 0;
        ListNode current = head;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }


    //adding a node at the beginning of the list
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);

        newNode.next = head;

        head = newNode;
    }

    // inserts a node to the end of the list
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // method to add a node anywhere   (VIDEO 47)


    public void insertAnywhere(int position, int value) {

        // 1 --> 4 --> 5
        // 1 --> 6 --> 4 --> 5

        ListNode node = new ListNode(value);

        if (position == 1) {
            node.next = head;
            head = node;
        } else {

            ListNode previous = head;
            int count = 1; // represents the start of the list(head position)

            while (count < position - 1) {
                previous = previous.next; //only performed if the count(present node position) is less than the position for placing the newnode
                count++;
            }

            ListNode current = previous.next; // current is 1 is reasigning 4 as the previous.next  to avoid breaking the link
            previous.next = node;
            node.next = current;

        }

    }
    

    public ListNode deleteFirst() {
        
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;

        return temp;

    }

}
