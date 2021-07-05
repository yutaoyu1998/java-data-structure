import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student another) {
        return this.score - another.score;
    }

    @Override
    public boolean equals(Object student) {
        if (this == student) return true;
        if (student == null || getClass() != student.getClass()) return false;
        Student s = (Student) student;
        return Objects.equals(name, s.name);
    }

    @Override
    public String toString() {
        return String.format("student(name: %s, score: %d)", name, score);
    }
}
