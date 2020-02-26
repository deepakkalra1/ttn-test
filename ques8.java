interface myInterface3{
    public default void myMethod(){
        System.out.println("This is interface method");
    }
}
class MyClass{
    public void myMethod(){
        System.out.println("This is class method");
    }
}

public class ques8 extends MyClass implements myInterface3 {
    public static void main(String[] args) {
        ques8 obj = new ques8();
        obj.myMethod();



    }
}
