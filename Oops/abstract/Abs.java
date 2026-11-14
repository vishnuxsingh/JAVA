class Abs {
    public static void main(String args[]){
        // Student s1= new Student();
        // s1.name="Abhay";
        // s1.age=26;
        // System.out.println(s1.name+" "+s1.age);
        // s1.getname();
        Egs s2= new Egs();
        s2.name="AJAY";
        s2.age=67;
        s2.age();
        s2.getname();
    }
}
abstract class Student {
    String name;
    int age;
    void getname() {
        System.out.println(name);
    }
    abstract void age();
}
class Egs extends Student {
    @Override 
    void age() {
        System.out.println(age);
    }
}


// abs(hiding implememnation) vs encaps(data security)
