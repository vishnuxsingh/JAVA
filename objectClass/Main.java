class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Student student = new Student();
        student.name = "John";
        student.age = 20;
        System.out.println(student);
        Student student2 = new Student();
        student2.name = "John";    
        student2.age = 20;
        System.out.println(student2);
        System.out.println(student.equals(student2)); 
        System.out.println(student instanceof Student);
        System.out.println(student.getClass().getName());
    }

}
class Student {
    String name;
    int age;
    @Override
    public String toString() {
        return (name + ", " + age);
    }
    @Override
    public boolean equals(Object obj) {
        {
            return false;
        }
    }
    
}