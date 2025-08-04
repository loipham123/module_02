package constructor;

import java.util.ArrayList;

public class StudentManagement {
    public static void main(String[] args) {
        System.out.println("hello world");
        Student s1 = new Student("Nam",12,"Nu");
        Student s2= new Student("Nguyen Van B");
        s1.output();
        s2.output();
    }
}