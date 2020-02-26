
interface MyInterface2{
    public default int myMethod(int a,int b){
        int sum=0;
        sum = a+b;
        return sum;
    }

}

public class ques7 implements MyInterface2{
    public int myMethod(int a,int b){

        return a-b;
    }

    public static void main(String[] args) {
        //MyInterface mi ;
        ques7 obj=new ques7();

        System.out.println("My method 1 has been called :"+ obj.myMethod(3,2));




    }
}
