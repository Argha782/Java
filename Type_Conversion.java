public class Type_Conversion {
    public static void main(String[] args) {
        byte b=12;
        int a = b;
        System.out.println(a);

        int c=123;
        byte d=(byte)c;
        System.out.println(d);

        int e=259;
        byte f=(byte)e;
        System.out.println(f);

        float g=12.6789f;
        int h =(int)g;
        System.out.println(h);

        byte i= 23;
        byte j=10;
        int r=i*j;
        System.out.println(r);
    }
}
