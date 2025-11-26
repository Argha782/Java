class Laptop{
    String model;
    double price;
    public String toString(){
        return "Laptop Model: "+model+"\nLaptop Price: "+price;
    }
    // public boolean equals(Laptop that){
    //     return this.model.equals(that.model) && this.price == that.price;
    // }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        return true;
    }
    
}
public class Equal {
    public static void main(String[] args) {
        Laptop obj=new Laptop();
        obj.model="Dell";
        obj.price=55000;

        Laptop obj1=new Laptop();
        obj1.model="Dell";
        obj1.price=55000;

        Laptop obj2=new Laptop();
        obj2.model="Lenovo";
        obj2.price=60000;

        System.out.println(obj);
        System.out.println(obj2);
        boolean result=obj.equals(obj1);
        System.out.println("Are both laptops equal? "+result);
    }
}
