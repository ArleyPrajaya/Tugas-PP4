package tugaspp4c;


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
    
    public void removeTail() {
        if (HEAD != null) {
            Node preNode = null;
            Node lastNode = HEAD;

            if (HEAD.next == null) {
                HEAD = null;
            } else {
                while (lastNode.next != null) {
                    preNode = lastNode;
                    lastNode = lastNode.next;
                }
                preNode.next = null;
                dispose(lastNode);
            }
        }
    }
}
