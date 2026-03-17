package singlelinkedlist;

public class Singlelinkedlist {

    Node head;

    public void InsertBegining(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void InsertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
           temp=temp.next;
        }
        temp.next=newNode;
    }
   public void insertMiddle(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            InsertBegining(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position not valid");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display linked list
   public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
