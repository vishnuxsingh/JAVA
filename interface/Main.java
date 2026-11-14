class Main {
public static void main(String[] args) {
        Car thar = new Thar();
        thar.start();
        Bike pulsar = new Pulsar();
        pulsar.start();
        D d = new D();
        d.start();
    }
}
interface Car {
    void start();
}
interface Bike {
    default void start() {
        System.out.println("Bike is starting");
    }
}
class Pulsar implements Bike {
    @Override
    public void start() {
        System.out.println("Pulsar is starting");
    }
}   
class Thar implements Car {
    @Override
    public void start() {
        System.out.println("Thar is starting");
    }
}

interface A {
    void start();
}
interface b extends A {
    void start();
}
interface c extends b {
    void start();
}
class D implements b,c {
    @Override
    public void start() {
        System.out.println("d is starting");
    }
}