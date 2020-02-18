import java.util.Scanner;

class Bank{
   private int ROI=10;
   private int balance;
   private String name;

   public void setBalance(int val){
       this.balance=val;
   }
   public void setName(String val){
       this.name = val;
   }
    public void getUserDetail(){
        System.out.println(this.name);
        System.out.println(this.balance);
    }
}

class SBI extends Bank{
    private int ROI=8;
    public void getROI(){
        System.out.println(ROI);
    }
}

class ICICI extends Bank{
    private int ROI=14;
    public void getROI(){
        System.out.println(ROI);
    }
}

class HDFC extends Bank{
    private int ROI=6;
    public void getROI(){
        System.out.println(ROI);
    }
}

public class Ques11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        HDFC hdfc = new HDFC();

        System.out.println("1= Dealing with SBI");
        sbi.setBalance(10000);
        sbi.setName("rahul");

        System.out.println("2= Dealing with icici");
        icici.setBalance(20000);
        icici.setName("ram");

        System.out.println("3= Dealing with HDFC");
        hdfc.setBalance(30000);
        hdfc.setName("deepak");

        System.out.println("SBI details");
        sbi.getROI();
        sbi.getUserDetail();

        System.out.println("ICICI details");
        icici.getROI();
        icici.getUserDetail();

        System.out.println("HDFC details");
        hdfc.getROI();
        hdfc.getUserDetail();

    }


}
