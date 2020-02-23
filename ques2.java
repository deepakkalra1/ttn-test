import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ques2 {


    public void uniqueCharacters(){

        String str;
        Scanner sc = new Scanner(System.in);
        str=sc.next();
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                continue;
            }
            hm.put(str.charAt(i),0);
        }

        for (Map.Entry<Character,Integer> entry : hm.entrySet() ) {
            System.out.println(entry.getKey());
        }

    }
    public static void main(String[] args) {
    ques2 obj = new ques2();
    obj.uniqueCharacters();



    }
}
