// Final---class
final class A{
    
    System.out.println("This is a final class and can't be inherited.");
}

// class B extends A{
//     // Trying to extend final class will cause a compilation error
// }

// Final---method
class B{
    public final void display(){
        System.out.println("This is a final method in class A and can't me change in next class.");
    }
}
class C extends B{
    // Trying to override final method will cause a compilation error
    // public void display(){
    //     System.out.println("Trying to override final method");
    // }
}


public class Final {
    public static void main(String[] args) {

// Final---variable
        final int MAX_VALUE = 100;
        // MAX_VALUE = 200; // This line would cause a compilation error

        System.out.println("The maximum value is: " + MAX_VALUE);
    }
}
