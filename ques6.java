
interface MyInterface{
    public default int myMethod(int a,int b){
        int sum=0;
        sum = a+b;
        return sum;
    }
    public static void myMethod2(){
        System.out.println("my Method 2 has been called");
    }
}

public class ques6 implements MyInterface{

    public static void main(String[] args) {
        //MyInterface mi ;
        ques6 obj=new ques6();

        System.out.println("My method 1 has been called :"+ obj.myMethod(1,2));

        MyInterface.myMethod2();


    }
}
