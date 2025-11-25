package packages.tools;

public class B extends A {
    public int publicVar = 15;                      // Can be accessed from anywhere
        protected int protectedVar = 25;            // Can be accessed within the same package and subclasses
        int defaultVar = 35;                        // Can be accessed within the same package  
        private int privateVar = 45;                // Can be accessed only within the class  
}
