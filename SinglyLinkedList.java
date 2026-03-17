
package singlelinkedlist;


public class SinglyLinkedList {
    Node1 head;

    // Insert at beginning
    void insertBeginning(String data) {
        Node newNode = new Node1(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertEnd(String data) {
        Node newNode = new Node1(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at middle (specific position)
    void insertMiddle(String data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            insertBeginning(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display the linked list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
}
