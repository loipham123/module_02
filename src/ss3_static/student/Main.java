package ss3_static.student;

/**
 * Viết một lớp Student đại diện cho sinh viên, bao gồm các thông tin sau:
 *
 * Mã số sinh viên
 * Tên
 * Điểm
 * Sử dụng biến tĩnh (static) để đếm số lượng sinh viên đã được tạo ra và viết phương thức tĩnh để truy xuất số lượng sinh viên.
 */
public class Main {
    public static void main(String[] args) {
        Student s1= new Student(1,"Loi",7.8);
        Student s2= new Student(2,"Vy",10);
        Student s3= new Student(3,"Linh",9.9);

        System.out.println("Số lượng sinh viên: "+Student.getStudentCount());
    }
}
