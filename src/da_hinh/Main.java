package da_hinh;

public class Main {
    public static void main(String[] args) {
        Student s1= new Student(1,"Nguyễn Văn A",20);
        Student s2 = new Student(1,"Nguyễn Văn A",10);

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));




    }
}
