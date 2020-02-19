class Singleton
{
private static Singleton single_instance = new Singleton();

private Singleton()
{
}
public static Singleton getInstance()
{
return single_instance;
}
}
class ques4 {
public static void main(String args[]) {
Singleton x = Singleton.getInstance();
Singleton y = Singleton.getInstance();
Singleton z = Singleton.getInstance();
}
}