import java.sql.Array;
import java.util.Arrays;

public class occurenceCharacter {
String str = "ddeepak lll";
char[] strcpy = str.toCharArray();
int index=0;
int iIndex=index+1;
int count[]=new int[str.length()] ;

char character[] = new char[str.length()];
//    public void count(int i){
//        System.out.println(index);
//        System.out.println(iIndex);
//        iIndex=index+1;
//        char hereChar;
//        if (strcpy[index]!='-'){
//        //hereChar=strcpy[i];
//        character[index]=strcpy[index];
//
//            try {
//                //System.out.println(strcpy.charAt(index));
//                //System.out.println(strcpy.charAt(iIndex));
//                if(strcpy[index] == strcpy[iIndex]){
//                    strcpy[iIndex]='-';
//
//                    count[index]+=1;
//
//                   // System.out.println("coming");
//
//
//                }
//               // System.out.println(iIndex);
//                count(++this.iIndex);
//
//
//            }
//            catch (Exception ex){
//
//                System.out.println("reached");
//                if (index<str.length()){
//
//                    count(++index);
//                }
//
//            }
//
//
//        }
//        else {
//           // System.out.println("asfas");
//            //System.out.println(iIndex);
//            count(strcpy[++this.index]);
//
//        }
//       // System.out.println(count[0]);
//
//    }
    public void count(){

        if(strcpy[index]!='-' ){

            try{
                if(strcpy[index]==strcpy[iIndex]){
                   // System.out.println("sffasfas");
                    character[index]=strcpy[iIndex];
                    count[index]+=1;
                    strcpy[iIndex]='-';
                }
                else {
                    character[index]=strcpy[index];
                    count[index]++;

                }
                ++iIndex;
                count();
            }
            catch (Exception e){
                index++;
                iIndex=index+1;

                if (index<strcpy.length-1){
                    count();
                }
            }
        }
        else {

            if(index<strcpy.length-1){
                index++;
                iIndex=index+1;
                count();
            }
        }
    }
    public static void main(String[] args) {

        occurenceCharacter obj = new occurenceCharacter();
       // Arrays.setAll(obj.count,-1);
    obj.count();


    for (int i=0;i<obj.character.length;i++)
    {

        if(obj.count[i]!=0 ){
            System.out.println(obj.character[i]);
            System.out.println(obj.count[i]+1);
            System.out.println("");
        }
//        else {
//            System.out.println(obj.character[i]);
//            System.out.println(obj.count[i]+1);
//            System.out.println("");
//        }
    }
    }

}
