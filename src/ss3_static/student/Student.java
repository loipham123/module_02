package ss3_static.student;

public class Student {
    private int id;
    private String name;
    private double score;

    static int studentCount = 0;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        studentCount++;
    }
    //Phương thức tĩnh truy xuất số lượng sinh viên
    public static int getStudentCount(){
        return studentCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
