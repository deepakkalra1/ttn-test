import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ques5 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8);


        //consumer interface

        System.out.println("Consumer interface implementation use :");
        Consumer<Integer> cons = (Integer i)->{

            System.out.println(i);
        };


        for (Integer i:ls){
            cons.accept(i);
        }


        //supplier interface
        System.out.println("");
        System.out.println("Supplier interface implementation use :");
        Supplier<Integer> sup = ()->{
          int sum = 0;
          for (int no: ls){
              sum+= no;
          }
            return sum ;
        };


        System.out.println("the sum of the entire list is: "+ sup.get());


        //predicate funtional interface

        Predicate<Integer> pre = (Integer val)->{
            boolean res=false;
            if (val> 5){
                res=true;
            }
            return res;
        };

        System.out.println("");
        System.out.println("predicate interface to check if given no is greater than 5 or not and here checking with list 3 index :"+ pre.test(ls.get(3)));

        //Funtion interface
        Function<Integer,String> fn = (Integer i)->{
          String res = "the number you have passed is :";
          res+=i;
            return res;
        };
        System.out.println("The output of Funtion interface :" + fn.apply(5));
    }
}
