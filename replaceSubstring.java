public class replaceSubstring {

    public void replace(){

        String fromToBeReplaced = "abc aaaabcaabbabccc";
        String toBeReplaced = "abc";
        String toBeReplacedWith = "zzzz";


        System.out.println(fromToBeReplaced.replaceAll(toBeReplaced,toBeReplacedWith));

    }
    public static void main(String[] args) {
        replaceSubstring obj = new replaceSubstring();
        obj.replace();




    }
}
