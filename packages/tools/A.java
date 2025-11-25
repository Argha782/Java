package packages.tools;

public class A {
    public int publicVar = 10;                  // Can be accessed from anywhere
    protected int protectedVar = 20;            // Can be accessed from anywhere except different package non-sub class
    int defaultVar = 30;                        // Can be accessed within the same package  
    private int privateVar = 40;                // Can be accessed only within the class  

    // public static void main(String args[]) {
    //     // main method can be left empty or removed if not used
    // }
}
