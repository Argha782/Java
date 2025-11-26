class A{
    public void show(){
        System.out.println("In class A");
    }
}
class B extends A{
    public void show1(){
        System.out.println("In class B");
    }
}

public class Typecasting {
    public static void main(String[] args) {
        double a = 5.64;
        int b = (int) a;
        System.out.println(b);          // Typecasting from double to int

        A obj = new B();
        obj.show();                     // Upcasting

        B obj1 = (B)obj;
        obj1.show1();                   // Downcasting
    }
}
