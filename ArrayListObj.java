// Create a class student  instance var of student are r.no, name and course.
// Create a parameterized constructor for student class create getters for student class and 
// create a array list in which you are going store 5 objects of student class and 
// print the information using for each.

import java.util.*;

class Student {
    private int rNo;
    private String name;
    private String course;

    public Student(int rNo, String name, String course) {
        this.rNo = rNo;
        this.name = name;
        this.course = course;
    }

    public int getRNo() {
        return rNo;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}

public class ArrayListObj {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Apple", "Maths"));
        students.add(new Student(2, "Banana", "Physics"));
        students.add(new Student(3, "Carrot", "Computer Science"));
        students.add(new Student(4, "Dominos", "Chemistry"));
        students.add(new Student(5, "Egg", "Biology"));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
