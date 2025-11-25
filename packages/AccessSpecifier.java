package packages;

import packages.tools.A;
import packages.*;


// import java.util.ArrayList;

public class AccessSpecifier {
    public static void main(String args[]) {
        System.out.println("Access Specifier Demo");
        AB obj = new AB();
        System.out.println("Public Variable accessible from anywhere: " + obj.publicVar);          // Accessible from anywhere
        System.out.println("Protected Variable accessible from anywhere except different package non-sub class: " + obj.dfvar);    // Accessible from anywhere except different package non-sub class
        // System.out.println("Default Variable accessible only within the same package: " + obj.defaultVar);        // Accessible only within the same package
        // System.out.println("Private Variable accessible only within the class: " + obj.privateVar);     // Not Accessible accessible only within the class
        // ArrayList list = new ArrayList();
        System.out.println("Default Variable accessible within the same package: " + obj.data);            // Accessible
        
    }
}
