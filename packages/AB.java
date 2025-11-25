package packages;
import packages.tools.A;

public class AB extends A {
    int data = 50;          // Can be accessed within the same package  // default access
    int dfvar = this.protectedVar;  // ✓ Works! Accessing through the subclass instance
}
