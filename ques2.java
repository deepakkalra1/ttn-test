public class ques2 {
public static void main(String[] args) {
String s = "Javaisgood";
String ss = s.toLowerCase();
char str[] = ss.toCharArray();
char temp;
   ;
for (int i = 0; i < str.length; i++) {
for (int j = i + 1; j < str.length; j++) {
if (str[i] > str[j]) {
temp = str[i];
str[i] = str[j];
str[j] = temp;
  //  System.out.println(str[i]+" "+str[j]);
}
}
}
System.out.println("Sorted string");
for (int i = 0; i < str.length; i++) {
System.out.println(str[i]);
}
}
}