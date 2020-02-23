import java.util.*;

//class Employee {
//    Double Age;
//    Double Salary;
//    String Name;
//
//    public void setValues(Double age,Double sal,String name){
//        this.Age=age;
//        this.Salary=sal;
//        this.Name=name;
//
//    }
//}
//Employee class already exist in ques5 java file so m not creating here
public class ques6 {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setValues(30.0,90000.0,"deepak");
        Employee emp2 = new Employee();
        emp2.setValues(29.0,30000.0,"rahul");
        Employee emp3 = new Employee();
        emp3.setValues(25.0,30000.0,"aman");
        Employee emp4 = new Employee();
        emp4.setValues(23.0,50000.0,"mayank");


        List<Employee> empHm = new ArrayList<Employee>();
        empHm.add(emp1);
        empHm.add(emp2);
        empHm.add(emp3);
        empHm.add(emp4);

        Collections.sort(empHm, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {


               //  System.out.println(employee.Salary);
                //System.out.println(t1.Salary);
                System.out.println(" ");
                int val=0;
                if (employee.Salary < t1.Salary){

                    val=-1;
                }
                else if (employee.Salary == t1.Salary){
                    //System.out.println("yes same");
                    val=1;
                    int l1 = employee.Name.length();
                    int l2 = t1.Name.length();
                    for (int i=0;i<(l1<l2 ? l1:l2);i++){
                        if(employee.Name.charAt(i) == t1.Name.charAt(i)){
                            val=-1;

                            continue;
                        }
                        else if(employee.Name.charAt(i) < t1.Name.charAt(i)) {
                            val=-1;
                            break;
                        }
                    }
                }
                else {
                    //System.out.println("coming here");
                    val=1;
                }


                return val;
            }
        });


        for (Employee obj: empHm){
            System.out.println(obj.Name);
            System.out.println(obj.Age);
            System.out.println(obj.Salary);
            System.out.println("");
        }



    }
}
