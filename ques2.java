@FunctionalInterface
interface returnOneInteger{
    public int returnOne(int a,int b);
}
public class ques2 {
    public static void main(String[] args) {

        returnOneInteger rOneInt= (a,b)->{

           return a;
        } ;

        System.out.println("returning one integer value : "+ rOneInt.returnOne(5,7));


    }
}
