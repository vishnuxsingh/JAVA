class P {
    public static void main(String args[]){
         A a = new C();
         a.a();
    }
}
abstract class A {
    abstract void a();
}
class B extends A {
   @Override 
   void a(){
      System.out.println("b");
   }
}
class C extends A {
@Override 
   void a(){
      System.out.println("c");
   }
}


//plmrpsyn
// run time , compile time 
//based on diffrent params but same name called overload  also called compile time
// method overloading / overriding 
// method override-> run time -> abs class declare any method into that any define in these separate classes
// overridind does not work on static because they belongs to class not object
// variables also doesn't participate in polymrpsm