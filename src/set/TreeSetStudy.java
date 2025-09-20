package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetStudy {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();

        students.add(new Student(1,"Nguyen Van A",8));
        students.add(new Student(2,"Nguyen Van A",3));
        students.add(new Student(3,"Nguyen Van B",2));
        students.add(new Student(4,"Nguyen Van D",1));
        students.add(new Student(5,"Nguyen Van E",1));

        for(Student student :students){
            System.out.println(student.getName()+" "+student.getScore() + " " +student.getId());
        }


    }
}
