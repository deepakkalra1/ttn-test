@FunctionalInterface
interface AddFunction{
    public int  add(int a,int b);
}

@FunctionalInterface
interface SubtractFunction{
    public int  sub(int a,int b);
}

@FunctionalInterface
interface MultiplicationFunction{
    public int  mul(int a,int b);
}

public class ques3 {
    public int addition(int a,int b){
        int sum=0;
        sum = a+b;
        return sum;
    }
    public int subtraction(int a,int b){
        int sum=0;
        sum = a-b;
        return sum;
    }
    static public int multiplication(int a,int b){
        int sum=0;
        sum = a*b;
        return sum;
    }
    public static void main(String[] args) {
        AddFunction add = new ques3()::addition;
        SubtractFunction sub = new ques3()::subtraction;
        MultiplicationFunction mul = ques3::multiplication;

        System.out.println("Addition functional interface and instance method refrencing :"+ add.add(10,20));
        System.out.println("subtraction functional interface and instance method refrencing :"+ sub.sub(20,10));
        System.out.println("Multiplication with functional interface and static method refrencing :"+mul.mul(2,6));

    }
}
