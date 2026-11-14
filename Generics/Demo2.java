package Generics;

public class Demo2 {
    public static void main(String[] args) {
        B2<Integer, Integer> b = new B2<> (10, 20);
        System.out.println(b.a);
        System.out.println(b.b);
    }
}
class B2<T, U> {
    T a;
    U b;
    B2(T a, U b) {
        this.a = a;
        this.b = b;
    }
}
