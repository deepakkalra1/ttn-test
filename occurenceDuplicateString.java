public class occurenceDuplicateString {


    public static void main(String[] args) {
    String toBeChecked = "this this string is to check number this of counts of duplicate words in a string";
    String words[] = toBeChecked.split(" ");
    String copied[]=words;
    //System.out.println(copied[0]);
    int count=0;
    for (int i=0;i<copied.length-1;i++){

        if (copied[i]!="-") {
            //System.out.println(copied[i]);


            for (int j = i + 1; j < copied.length; j++) {

                if (copied[j] != "-") {

    //System.out.println(copied[i]);
      //              System.out.println(copied[j]);
                    if (copied[i].equals(copied[j]) ) {
                        //System.out.println(copied[j]);

                        count++;

                        copied[j] = "-";
                    }
                }
            }
            if (count >= 1) {

                System.out.println(copied[i]);
                System.out.println("total count is="+(count+1));

                count = 0;
            }

        }

    }

    }

}
