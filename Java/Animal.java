class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Calls the sound() method of Animal class
        animal.sound();

        // Calls the overridden sound() method of Dog class
        dog.sound();
    }
}
