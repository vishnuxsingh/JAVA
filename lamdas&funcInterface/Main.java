import java.util.*;
class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));     
        students.add(new Student("Bob", 21));    
        students.add(new Student("Charlie", 10));    
        students.add(new Student("David", 27));    
        Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));
        for (Student s : students) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}