import java.util.ArrayList;
import java.util.List;

public class ques1 {
    public static void main(String[] args) {
        int total=0;
        List<Integer> l = new ArrayList<Integer>();
        l.add(5);
        l.add(35);
        l.add(15);
        l.add(25);
        for (Integer no:l){
            total+=no;
        }
        System.out.println(total);
    }
}
