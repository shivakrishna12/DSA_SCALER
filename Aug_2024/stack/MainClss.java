package Aug_2024.stack;

public class MainClss {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println("Size of the Stack::" + size(head));
        Node temp = new Node(60);
        push(head, temp);
        System.out.println("Size of the Stack::" + size(head));
        pop(head);
        System.out.println("size of the Stack::" + size(head));
    }

    public static int size(Node head) {
        int count = -1;
        while (head != null) {
            count += 1;
            head = head.next;
        }
        return count;
    }

    public static void push(Node head, Node newNode) {
        while (head.next != null) {
            head = head.next;
        }
        head.next = newNode;
    }

    public static void pop(Node head) {
        Node prev = head;
        while (head.next != null) {
            prev = head;
            head = head.next;

        }
        if (head.next == null) {
            prev.next = null;
        }
    }

    public static int peek(Node head) {
        while (head.next != null) {
            head = head.next;
        }
        return head.data;
    }
}
