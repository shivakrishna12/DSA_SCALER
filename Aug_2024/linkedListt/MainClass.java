package Aug_2024.linkedListt;

public class MainClass {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(100);
        Node n2 = new Node(1000);
        head.next = n1;
        n1.next = n2;
        Node n3 = new Node(10000);
        insertAtEnd(head, n3);
        // deleteAtEnd(head);
        insertAtPosition(head, 2);

        head = deleteHead(head);
        printNumbers(head);


    }

    public static void printNumbers(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void insertAtEnd(Node head, Node newNode) {
        while (head.next != null) {
            head = head.next;
        }
        if (head.next == null) {
            head.next = newNode;
        }

    }

    public static void deleteAtEnd(Node head) {
        Node prevNode = null;
        while (head.next != null) {
            prevNode = head;
            head = head.next;
        }
        if (head.next == null) {
            prevNode.next = null;
        }

    }

    public static void insertAtPosition(Node head, int position) {
        Node newNode = new Node(12345);
        Node present = head;
        int count = 0;
        while (head != null) {
            present = head;
            head = head.next;

            if (count == position) {
                Node nextNode = present.next;
                present.next = newNode;
                newNode.next = nextNode;
                return;
            }
            count += 1;
        }
    }

    public static Node deleteHead(Node head) {
        Node nextNode = head.next;
        return nextNode;

    }

    public static boolean searchData(Node head, int num) {
        while (head != null) {
            if (num == head.data) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
