package quan_ly_hoc_sinh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Viết chương trình cho phép nhập thông tin học sinh, bao gồm: tên học sinh, điểm toán, và điểm văn. Tính điểm trung bình và hiển thị kết quả.
 */

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số lượng học sinh: ");
            n = sc.nextInt();

            if (n < 0) {
                System.out.println("Phải nhập số dương!!");
            }

        } while (n <= 0);

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
