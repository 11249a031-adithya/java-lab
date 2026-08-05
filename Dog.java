class Animal {
    final void sound() {
        System.out.println("Animals make sounds.");
    }
}

public class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks.");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}