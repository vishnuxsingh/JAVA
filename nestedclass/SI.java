public class SI {
    public static void main(String args[]){
        Outer.Inner s1= new Outer.Inner();
        Outer outer=new Outer();
        s1.fun(outer);
    }
}
class Outer {
    int y=4;
    static class Inner {
       void fun(Outer outer) {
        System.out.println("HEY BABY"+outer.y);
       }
    }
}