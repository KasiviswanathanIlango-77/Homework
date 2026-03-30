
package advancedjavaapplication;


public class Book2 {
    private int id;
    private String title;
    private String author;
    private String status; // "Available" or "Issued"

    public Book2(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = "Available";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void issueBook() {
        this.status = "Issued";
    }

    public void returnBook() {
        this.status = "Available";
    }

    public void display() {
        System.out.println("ID: " + id +
                ", Title: " + title +
                ", Author: " + author +
                ", Status: " + status);
    }
}
