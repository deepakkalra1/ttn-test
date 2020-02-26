class except1 extends Exception{

String s1;
except1(String s2){
s1 = s2;
}
public String toString(){
return ("except1 occured: " +s1);
}
}

public class ques13 {
public static void main(String[] args) throws except1 {
try{
System.out.println("in try block");
throw new except1 ("This is My error Message");
}
catch (except1 e){
System.out.println("catch block");
System.out.println(e);
}
}

}
