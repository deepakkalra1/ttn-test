import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class ques4 {
    public void sortingHashMapValues(){

        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(6,"f");
        hm.put(5,"e");
        hm.put(2,"b");
        hm.put(3,"c");
        hm.put(4,"d");
        hm.put(1,"a");

        TreeMap<Integer,String> tm = new TreeMap<Integer, String>();

        for (Map.Entry<Integer,String> entry : hm.entrySet() ){
            tm.put(entry.getKey(),entry.getValue());

        }
        for (Map.Entry<Integer,String> entry : tm.entrySet() ){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
    public static void main(String[] args) {
        ques4 obj = new ques4();
        obj.sortingHashMapValues();
    }
}
