class Inherit {
    public static void main(String args[]){
      EngStu es = new EngStu();
      es.attend();
      es.attendlab();
    }
}
class Student {
    int age;//parent
    String name;
    void attend() {
        System.out.println("Student marked atte");
    }
}
class EngStu extends Student {
    void attendlab() {//child
        System.out.println("Lab Attended");
    }
    // void parentname() {
    //     return super.name;
    //     sout(super.name);
    // }
}
// single inherit -> one to anohter
// multilevel 1-> 2-> 3 
//hierchy -> multipl class extens same class
// multiple - > not supported in java due to diamond problem can be implemented using interface
//super keyword -> refers to the parent object