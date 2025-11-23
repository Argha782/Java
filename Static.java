class Mobile
{
    String model;
    int cost;
    static String device;

    public Mobile(){
        model="";
        cost=0;
        System.out.println("in Constructor block");
    }

    static{
        System.out.println("in Static block");
    }

    public void show(){
        System.out.println(model + " : " + cost + " : " + device);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.model + " : " + obj.cost + " : " + device);          // we can only use static variables in static func or need too pass respective object reference
    }
}
public class Static{
    public static void main(String[] args) {
        Mobile obj=new Mobile();
        obj.model="Samsung";
        obj.cost=15000;
        // obj.device="Smartphone";
        Mobile.device="Smartphone";
        
        // System.out.println();
        Mobile obj1=new Mobile();
        obj1.model="MI";
        obj1.cost=12000;
        // obj1.device="Phone";
        Mobile.device="Phone";

        // obj.device="Mobile";
        Mobile.device="Mobile";
        obj.show();
        obj1.show();
        Mobile.show1(obj);
    }
}