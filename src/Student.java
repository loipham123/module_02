import java.util.Scanner;

public class Student {
    String name;
    int age;
    String gender;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên: ");
        name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giới tính: ");
        gender = sc.nextLine();
    }

    void output() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
    }

    void run() {
        System.out.println(name + " có thể chạy nhanh");
    }
}
