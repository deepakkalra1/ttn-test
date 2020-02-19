//import java.util.Scanner;
//
//public class LibraryManagement extends LibOperations implements UserDetails {
//    public void getDetails() {
//        System.out.println("Name :" + name);
//        System.out.println("Age: " + age);
//    }
//
//    public void login(String user, String pass) {
//        if (user == "Shobhit@29" && pass == "abcde") {
//            System.out.println("Access Granted!");
//        } else
//            System.out.println("Access Denied");
//    }
//
//    public void issueBook(int bookId) {
//        System.out.println(bookId + " issued to " + username);
//    }
//
//    public void retBook(int bookId) {
//        System.out.println(bookId + " returned by " + username);
//    }
//
//
//
//
//public static void main(String[] args) {
//int opt;
//char a;
//LibraryManagement lib = new LibraryManagement();
//Scanner sc = new Scanner(System.in);
//do {
//System.out.println("Choose an option: /n1.User Details/n2.Login/n3.Issue book/n4.Return Book/n5.exit");
//System.out.println("Enter your option: ");
//opt = sc.nextInt();
//switch (opt) {
//case 1:
//lib.getDetails();
//break;
//case 2:
//lib.login("Shobhit@29", "abcde");
//break;
//case 3:
//lib.issueBook(101);
//break;
//case 4:
//lib.retBook(101);
//break;
//case 5:
//System.exit(0);
//default:
//System.out.println("Wrong input");
//break;
//}
//System.out.println("Do you want to continue? y/n");
//a = sc.next().charAt(0);
//}
//while (a == 'y');
//}
//
////LibraryManagement() {
////
////}
//
//}