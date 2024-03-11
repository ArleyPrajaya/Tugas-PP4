package tugaspp4;


public class StrukturList {
    Node HEAD;

    // Constructor
    StrukturList() {
        HEAD = null;
    }

    // Class Node
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method removeHead
    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.next;
            dispose(temp);
        }
    }

    // Method dispose
    public void dispose(Node temp) {
        temp.next = null;
        temp = null;
    }

    // Method isEmpty
    public boolean isEmpty() {
        return HEAD == null;
    }
}
