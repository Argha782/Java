// class A extends Object{                                     // Every class in java extends Object class
class A{
    public A(){
        super();
        System.out.println("I am A's Constructor");
    }
    public A(int a){
        super();
        System.out.println("Value of a: "+a);
    }
    public void show(){
        System.out.println("I am show method of class A");
    }
    public void config(){
        System.out.println("I am config method of class A");
    }
}
class B extends A{
    public String var2;
    public B(){
        super();
        // super(5);
        System.out.println("I am B's Constructor");
    }
    public B(int b){
        super(b);
        // this();
        System.out.println("Value of b: "+b);
    }
    public void show(){
        System.out.println("I am show method of class B");
    }

}
class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
class AdvCalc extends Calc{
    public int mult(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}
class SuperCalc extends AdvCalc{
    public double pow(double a, double b){
        return Math.pow(a, b);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println();
        B obj1 = new B(100);
        obj.show();
        obj.config();
        SuperCalc ob =new SuperCalc();
        int r1 = ob.add(20, 30);
        int r2 = ob.sub(30, 10);
        int r3 = ob.mult(20, 5);
        int r4 = ob.div(45, 15);
        double r5 = ob.pow(5, 3);
        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5);
    }
}
