
public class Ques7
{
    static
    {
        System.out.println("using static block");
        System.out.println("FirstName : Deepak LastName : kalra Age : 24");
    }
    public static String firstname = "deepak";
    public static String lastName = "kalra";
    public static int age = 24;

    public static void getDetails()
    {
        System.out.println("accessing using static method");

        System.out.println("firstname: "+firstname+ " lastName: "+lastName+ " age: "+age);
    }

    public static void main(String[] args)
    {
        System.out.println("accessing using static variables");
        System.out.println("firstname: "+firstname+ " lastName: "+lastName+ " age: "+age);
        getDetails();

    }
}