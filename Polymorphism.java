class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }   
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal obj = new Animal();  // Animal object
        obj.sound();  // Outputs: Animal makes a sound
        obj = new Dog();        // Dog object
        obj.sound();     // Outputs: Dog barks
        obj = new Cat();        // Cat object
        obj.sound();     // Outputs: Cat meows
    }
}
