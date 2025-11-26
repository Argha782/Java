public class Wrapping {
    public static void main(String[] args) {
        int num = 10; // Primitive int
        Integer num1 = num; // Boxing
        System.out.println("Primitive int: " + num);
        System.out.println("Boxed Integer: " + num1);
        int num2 = num1; // Unboxing
        System.out.println("Unboxed int: " + num2);
    }
}
