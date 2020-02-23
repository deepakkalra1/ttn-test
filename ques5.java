import java.util.*;

class Employee {
    Double Age;
    Double Salary;
    String Name;

    public void setValues(Double age,Double sal,String name){
        this.Age=age;
        this.Salary=sal;
        this.Name=name;

    }
}

public class ques5 {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setValues(30.0,10000.0,"deepak");
        Employee emp2 = new Employee();
        emp2.setValues(29.0,30000.0,"rahul");
        Employee emp3 = new Employee();
        emp3.setValues(25.0,40000.0,"aman");
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

               // System.out.println(employee.Salary);
                int val=0;
                    if (employee.Salary < t1.Salary){
                        val=-1;
                    }
                    else if (employee.Salary == t1.Salary){
                        val=0;
                    }
                    else {
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
