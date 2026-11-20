package IterableInterface;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
        }
    }
}
