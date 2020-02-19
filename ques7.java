public class ques7 {
public static void main(String[] args) {
ques7 se = new ques7();
int sec = 216854;
se.ConvertSectoDay(sec);
}
public void ConvertSectoDay(int n)
{
int day = n / (24 * 3600);
n = n % (24 * 3600);
int hour = n / 3600;
n %= 3600;
int minutes = n / 60 ;
n %= 60;
int seconds = n;
System.out.println( day + " " + "days " + hour + " " + "hours " + minutes + " " + "minutes " + seconds + " " + "seconds ");
}
}