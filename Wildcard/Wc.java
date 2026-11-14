package Wildcard;

import java.util.ArrayList;
import java.util.List;

public class Wc {
    public static void main(String[] args) {
        //invarient in generics
        // Animal a=new Dog();
        // a.eat();
        // a.sleep();
        List<Dog> list =new ArrayList<>();
        list.add(new Dog());
        list.add(new Dog());
        fun(list);
    }
    static void fun(List<?> values) {
        for (Object a : values) {
            System.out.println(a.getClass().getSimpleName());
        }
    }
}
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}
