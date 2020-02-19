import java.util.Scanner;

public class ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="";

        while(true){
            str=sc.next();
            if (str.toLowerCase().intern() =="done"){
                break;
            }


//            char strArr[]=new char[str.length()];
            if (str.charAt(0) ==str.charAt(str.length()-1) ){
                System.out.println("first and last character of a string is same");
            }
            else {
                System.out.println("first and last character of a string is NOT same");
            }

        }

    }
}
