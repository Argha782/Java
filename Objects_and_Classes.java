class Calculator{
    int a;
    public int add(int n1, int n2)
    {
        int result = n1 + n2;
        return result;
    }
    public int sub(int n1, int n2)
    {
        int result = n1 - n2;
        return result;
    }
}

class Example{
    public void playMusic(){
        System.out.println("Playing music!!!");
    }
    public String school(int marks){
        if(marks >= 85)
            return "Pass with Distinction";
        else if(marks >= 60)
            return "Pass with 1st Div";
        else if(marks >= 45)
            return "Pass with 2nd Div";
        else
            return "Fail";
        
    }
}

public class Objects_and_Classes {
    public static void main(String[] args) {
        int num1= 20;
        int num2= 15;
        Calculator calc = new Calculator();
        int sum = calc.add(num1, num2);
        System.out.println(sum);
        int sub = calc.sub(num1, num2);
        System.out.println(sub);

        Example obj = new Example();
        obj.playMusic();
        String result=obj.school(84);
        System.out.println(result);
    }
}
