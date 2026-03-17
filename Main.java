
package singlelinkedlist;


public class Main {
    
     public static void main(String[] args) {
        Singlelinkedlist list = new Singlelinkedlist();

        list.InsertBegining(30);
        list.InsertBegining(20);
        list.InsertBegining(10);

        list.insertMiddle(25, 3);

        list.InsertEnd(40);

        list.display();
    }
}
