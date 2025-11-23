public class Strings {
    public static void main(String[] args) {
        // Create and initialize a string
        String greeting = "Hello, World!";
        System.out.println("Greeting: " + greeting);

        // String concatenation
        String name = "Alice";
        String personalizedGreeting = greeting + " Welcome, " + name + "!";
        System.out.println(personalizedGreeting);

        // String methods
        int length = greeting.length();
        System.out.println("Length of greeting: " + length);

        String upperCaseGreeting = greeting.toUpperCase();
        System.out.println("Uppercase Greeting: " + upperCaseGreeting);

        String subString = greeting.substring(7, 12);
        System.out.println("Substring (7 to 12): " + subString);

        boolean containsWorld = greeting.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        // String builder
        StringBuilder sb = new StringBuilder(); 
        sb.append("This ");;
        sb.append("is ");
        sb.append("a ");
        sb.append("StringBuilder ");;
        sb.append("example.");
        System.out.println("StringBuilder content: " + sb.toString());

        StringBuilder str = new StringBuilder("Argha"); 
        System.out.println("capacity: " + str.capacity());
        System.out.println("length: " + str.length());
        str.insert(0, "My Name is: ");     
        str.append(" Saha");   
        System.out.println(str.toString());
        str.replace(0, 11, "I am");
        System.out.println(str.toString());
        str.delete(8, 14);
        System.out.println(str.toString());
    }
}