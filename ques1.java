@FunctionalInterface
interface greaterOrNot {
    public boolean check(int a,int b);
   // public int incByOne(int a);

}

interface incByOne {

     public int inc(int a);

}
interface concatTwoStrings {
    public String con(String a,String b);


}
interface convertToUpperCase {
    public String convert(String a);


}
public class ques1 {
    public static void main(String[] args) {

        greaterOrNot grtOrnt = (a,b)->{
            if(a>b){
                return true;

            }
            else {
                return false;
            }

        };

        System.out.println("Checking first number is greater or not :"+ grtOrnt.check(2,3)) ;


        incByOne ibo = (a)->{

            return ++a;

        };
        System.out.println("Number will be increased by one: "+ibo.inc(2));

        concatTwoStrings concat = (a,b)->{
          String finalString ;
          finalString=a;
          finalString+=b;
          return finalString;
        };
        System.out.println("Two strings being concatinated: "+ concat.con("deepak","kalra"));

        convertToUpperCase conUpperCase = (a)->{
          String finalString;
          finalString = a.toUpperCase();
          return finalString;

        };

        System.out.println("Converted to upper case :"+ conUpperCase.convert("deepak"));





    }

}
