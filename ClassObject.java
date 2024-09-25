/* Write a Java program where you define a class named Student with the following attributes: rollNo, name, and marks.
The class should have two methods: addInfo() to input the student's details and display() to print the student's details.
*/

class Student {

    private int rollNo;
    private String name;
    private int marks;

    Student() {
        rollNo=00;
        name="Uk";
        marks=00;
    }


    void addInfo(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }


    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll No: " + rollNo);
        System.out.println("Student Marks: " + marks+"\n");
    }

    public int getRollNo(){
        return rollNo;
    }

    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
}


public class ClassObject {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();


        student1.addInfo(01, "Apple", 85);
        student2.addInfo(02, "Batman", 95);
        student3.addInfo(03, "CatWomen", 75);

        student1.display();
        student2.display();
        student3.display();
        student4.display();

        System.out.println("\nGetter Setter");
        student1.setRollNo(5);
        student1.display();

    }
}
