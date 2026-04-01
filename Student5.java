
package advancedjavaapplication;


public class Student5 {
    int rollno;
    String name;
    int age;
    String course;
    double marks;
    public Student4(int rollno,String name,int age,String course,double marks)
    {
    this.rollno=rollno;
    this.name=name;
    this.age=age;
    this.course=course;
    this.marks=marks;
    }
    public void display()
    {
        System.out.println("RollNo: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
        System.out.println("Marks: "+marks);
    }
    
}
