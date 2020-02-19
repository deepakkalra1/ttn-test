public class ques6 {
public static void main(String[] args) {
try {
int a = 10;
int b = 0;
int c;
int arr[] = new int[5];
c = a / b;
System.out.println(arr[10]);
}
catch(ArithmeticException a){
a.printStackTrace();
}
catch(Exception e){
e.printStackTrace();
}
finally {
System.out.println("All errors caught");
}
}
}