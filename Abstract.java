abstract class Car{
    abstract void start();                      // Abstract method must belong to abstract class but an abstract class maynot have abstract method
    public void music(){
        System.out.println("Music is playing");
    }
}
class Honda extends Car{                        // Concrete class
    void start(){
        System.out.println("Honda car started");
    }
}
public class Abstract {
    public static void main(String[] args) {
        System.out.println("This is an abstract class example.");
        // Car obj = new Car();                // Cannot creat object of abstract class
        Car obj = new Honda();
        obj.start();
        obj.music();
    }
}
