//Generics Methods
package Generics;

public class Demo3 {
    public static void main(String[] args) {
        // int a=getResult(10);
        // String b=getResult("Hello");
        // System.out.println(a);
        // System.out.println(b);
        printpair(10, "Hello");
    }
    public static <T> T getResult(T a) {
        return a;
    }
    public static <T,U> void printpair(T a, U b) {
        System.out.println(a+" "+b);
    }
}
