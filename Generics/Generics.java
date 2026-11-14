package Generics;

public class Generics {
    public static void main(String[] args) {
        Box<Integer> a = new Box<> (10);
        Box<String> b = new Box<> ("Hello");
        System.out.println(a.getVal());
        System.out.println(b.getVal()+5);
    }
}
class Box<T> {
    private T val;
    Box(T val) {
        this.val=val;
    }
    public T getVal() {
        return val;
    }
    public void setVal(T val) {
        this.val = val;
    }
}
