package ss3_static.ke_thua;

import java.util.Scanner;

public class Student extends Person {
    private double score;

    public Student() {
        super();
    }

    public Student(String name, int age, double score) {
        super(name, age);
//        this.setScroe(100);
        this.score = score;
    }

    public double getScroe() {
        return score;
    }

    public void setScroe(double scroe) {
        this.score = scroe;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào tên: ");
        setName(sc.nextLine());

        System.out.println("Nhập vào tuổi: ");
        setAge(Integer.parseInt(sc.nextLine()));

        this.score = Double.parseDouble(sc.nextLine());
    }
}
