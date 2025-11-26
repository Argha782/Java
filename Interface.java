interface Computer{                         // all methods are public and abstract by default 
// abstract class Computer{
    int age=10;                             // public static final by default and needs to be initialized
    String name="Developer Machine";        // public static final by default and needs to be initialized
    public abstract void compute();
}
class Laptop implements Computer{           // variables and methods of interface are implemented by 'implements' keyword
// class Laptop extends Computer{
    public void compute(){
        System.out.println("Code, compile, run with laptop");
    }
}
class Desktop implements Computer{
// class Desktop extends Computer{
    public void compute(){
        System.out.println("Code, compile, run, faster with desktop....");
    }
}
class Developer{
    public void build(Computer device){
        device.compute();
    }
}

interface A{    // interface can extend another interface
    void run();
}
interface X extends A{

}
class B implements Computer,X{
    public void run(){
        System.out.println("Running in B from A");
    }
    public void compute(){
        System.out.println("Computing in B from Computer");
    }
}
public class Interface {
    public static void main(String[] args) {
        System.out.println("Interface File");
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer argha = new Developer();
        argha.build(lap);
        argha.build(desk);
        // Computer.name="Work Machine";          // static final variable can be accessed by interface name but can't be modified
        System.out.println(Computer.name);
        B obj = new B();
        obj.run();
        obj.compute();
    }
}