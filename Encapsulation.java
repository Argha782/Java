class Human{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    // public void setName(String n){
    //     name = n;
    // }
    public void setName(String name){
        this.name = name;
    }
    // public void setAge(int a){
    //     age = a;
    // } 
    public void setAge(int age){
        this.age = age;
    }
    public Human(){                         // Default Constructor
        name = "Argha";
        age = 18;
    }

    public Human(String name, int age){      // Parameterized Constructor
    //  public Human(String n, int a){ 
    //  name = n;
    //  age = a;
        this.name = name;
        this.age = age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj =new Human();
        Human obj1 =new Human("John Doe", 30);
        System.out.println(obj.getName()+" : "+obj.getAge());
        System.out.println(obj1.getName()+" : "+obj1.getAge());
        // obj.name="Argha";                       // Unable to access bcuz access specifier set to private
        // obj.age=24;                             // Unable to access bcuz access specifier set to private

        obj.setName("Saha");
        obj.setAge(24);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
