public class CircularLinkedList {
    Node head;

    public void insertNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {

        }
    }

    public static void main(String args[]) {

    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
