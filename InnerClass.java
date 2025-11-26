// static class Outer {                                               // Static can't be used in outer class
abstract class Outer {                                               
// class Outer {                                               
    int outerVar = 10;
    public void show(){
        System.out.println("Outer Class Method");
    }
    public abstract void outerAbstractMethod();          // Abstract method not allowed in concrete class
    // static class Inner {                                              // Static can be used in inner class
    class Inner {
        void display() {
            System.out.println("Inside Inner Class");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        // Outer outer = new Outer();
        // outer.show();
        // Outer.Inner inner = outer.new Inner();
        // inner.display();
        Outer outer2 = new Outer(){
            public void show(){
                System.out.println("Anonymous Inner Class Method");
            }
            public void outerAbstractMethod(){
                System.out.println("Implementing abstract method in anonymous class");
            }
        };
        outer2.show();
        outer2.outerAbstractMethod();
    }
}
