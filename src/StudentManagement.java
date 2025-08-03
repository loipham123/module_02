import java.util.ArrayList;

public class StudentManagement {
    public static void main(String[] args) {
        int n = 2;
        ArrayList<Student> students = new ArrayList<>(n);

        Student student;
        for (int i = 1; i <= n; i++){
            System.out.printf("\n\nNhập vào thông tin sinh viên thứ %d\n",i);
            student = new Student();
            student.input();
            students.add(student);
        }

        for (int i = 1; i <= n; i++){
            System.out.printf("\n\nThông tin sinh viên thứ %d\n",i);
            students.get(i-1).output();
        }
    }
}
