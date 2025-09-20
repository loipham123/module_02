package set;

import java.util.Objects;

public class Student implements Comparable<Student> {
    int id;
    private String name;
    private double score;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.score = age;
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

    public void setScore(int score) {
        this.score = score;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int scoreCompera = Double.compare(this.score, o.score);

        if(scoreCompera !=0){
            return scoreCompera;
        }
        return this.name.compareTo(o.name);

    }
}
