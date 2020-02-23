import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ques3 {
    public void characterOccurence(){
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
        // System.out.println(hm.get('y'));
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            hm.put(str.charAt(i),hm.get(str.charAt(i))+1);

        }


        for (Map.Entry<Character,Integer> entry : hm.entrySet() ){
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

    }

    public static void main(String[] args) {
        ques3 obj = new ques3();
        obj.characterOccurence();

    }
}
