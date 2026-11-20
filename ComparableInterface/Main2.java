package ComparableInterface;
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 19));
        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student.name + " - " + student.age);
        }
        Collections.sort(students);
        System.out.println("After sorting:");
        for (Student student : students) {
            System.out.println(student.name + " - " + student.age);
        }

    }
}
class Student implements Comparable<Student> {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Student other) {
        return this.age - other.age;
    }
}
