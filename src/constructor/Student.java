package constructor;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String gender;

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

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

