package set;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Student> students = new java.util.HashSet<>();

        students.add(new Student (1,"Nguyễn Văn A",20));
        students.add(new Student (1,"Nguyễn Văn A",20));

        System.out.println(students.size());
    }
}
